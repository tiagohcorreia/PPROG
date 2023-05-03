package jogodecartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private List<Carta> baralho;

    public static enum Tipo {
        BAR_40,
        BAR_52
    };

    private static final Tipo BARALHO_POR_OMISSAO = Tipo.BAR_40;

    public Baralho(Tipo tipoDeBaralho) {
        baralho = criarBaralho(tipoDeBaralho);
    }

    public Baralho() {
        baralho = criarBaralho(BARALHO_POR_OMISSAO);
    }

    public Baralho(Baralho outroBaralho) {
        baralho = new ArrayList<>(outroBaralho.baralho.size());
        for (Carta c : outroBaralho.baralho) {
            baralho.add(new Carta(c));
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Carta c : baralho) {
            s.append(c.toString());
            s.append("\n");
        }
        return s.toString();
    }
    
    public void baralhar() {
        Collections.shuffle(baralho);
    }

    public void partir() {

        // Reserva a primeira metade das cartas do baralho
        List<Carta> mbar = new ArrayList<>(baralho.subList(0, baralho.size()/2));

        // Remove a primeira metade das cartas do baralho
        baralho.removeAll(mbar);

        // Coloca no final a primeira metade das cartas do baralho
        baralho.addAll(mbar);
    }

    public List<Carta> primeirasCartas(int n) {

        // Reserva as primeiras n cartas do baralho
        List<Carta> mbar = new ArrayList<>(
                baralho.subList(0, (n < baralho.size() ? n : baralho.size())));

        // Remove as primeiras n cartas do baralho
        baralho.removeAll(mbar);

        return mbar;
    }

    public List<Carta> ultimasCartas(int n) {
        // Reserva as últimas n cartas do baralho
        List<Carta> mbar = new ArrayList<>(
                baralho.subList((n > baralho.size() ? 0 : baralho.size() - n),
                        baralho.size()));

        // Remove as últimas n cartas do baralho
        baralho.removeAll(mbar);

        return mbar;
    }
    
    private List<Carta> criarBaralho(Tipo tipoDeBaralho) {
        List<Carta> baralho = (tipoDeBaralho == Tipo.BAR_40 ? new ArrayList<>(40)
                                                            : new ArrayList<>(52));
        for (Carta.Naipe n : Carta.Naipe.values()) {
            for (Carta.Tipo t : Carta.Tipo.values()) {
                if (tipoDeBaralho == Tipo.BAR_40
                        && t.compareTo(Carta.Tipo.Sena) > 0
                        && t.compareTo(Carta.Tipo.Dama) < 0) {
                    continue;
                }
                baralho.add(new Carta(t, n));
            }
        }
        return baralho;
    }

}
