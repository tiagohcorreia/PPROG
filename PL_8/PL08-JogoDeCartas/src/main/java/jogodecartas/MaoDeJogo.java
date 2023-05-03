package jogodecartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaoDeJogo {

    private List<Carta> maoDeJogo;

    public MaoDeJogo(List<Carta> mao) {
        maoDeJogo = new ArrayList(mao);
    }

    public MaoDeJogo() {
        maoDeJogo = new ArrayList<>();
    }

    public MaoDeJogo(MaoDeJogo outraMaoDeJogo) {
        maoDeJogo = new ArrayList<>();
        for (Carta c : outraMaoDeJogo.maoDeJogo) {
            maoDeJogo.add(new Carta(c));
        }
    }

    public List<Carta> getMaoDeJogo() {
        return new ArrayList<Carta>(maoDeJogo);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Carta c : maoDeJogo) {
            s.append(c.toString());
            s.append("\n");
        }
        return s.toString();
    }

    public List<Carta.Tipo> tiposDeCarta() {

        List<Carta.Tipo> resultado = new ArrayList<>();

        for (Carta carta : maoDeJogo) {

            if (!resultado.contains(carta.getTipo())) {

                resultado.add(carta.getTipo());

            }

        }
        return resultado;

        //throw new UnsupportedOperationException("Não implementado!");
    }

    public int contarCartasDoTipo(Carta.Tipo tipo) {

        int resultado = 0;

        for(Carta carta : maoDeJogo) {

            if(tipo.equals(carta.getTipo())) {

                resultado++;
            }


        }

        return resultado;

//        throw new UnsupportedOperationException("Não implementado!");
    }

    public void ordenar() {
        // A classe Carta deve implementar a interface Comparable, devendo
        // implementar especificamente Comparable<Carta>
//        throw new UnsupportedOperationException("Não implementado!");

        Collections.sort(maoDeJogo);
    }

}
