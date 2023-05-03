package jogodecartas;

public class Carta implements Comparable<Carta> {

    public static enum Tipo {
        Duque, Terno, Quadra, Quina, Sena, Oito, Nove, Dez,
        Dama, Valete, Rei, Manilha, As
    }

    ;

    public static enum Naipe {
        Copas, Ouros, Espadas, Paus
    }

    ;

    private Tipo tipo;

    private Naipe naipe;

    private static final Tipo TIPO_POR_OMISSAO = Tipo.Duque;

    private static final Naipe NAIPE_POR_OMISSAO = Naipe.Copas;

    public Carta(Tipo tipo, Naipe naipe) {
        this.tipo = tipo;
        this.naipe = naipe;
    }

    public Carta(String descricao) {
        String[] arrayDescricao = descricao.split(" ");
        tipo = Tipo.valueOf(arrayDescricao[0]);
        naipe = Naipe.valueOf(arrayDescricao[2]);
    }

    public Carta() {
        tipo = TIPO_POR_OMISSAO;
        naipe = NAIPE_POR_OMISSAO;
    }

    public Carta(Carta outraCarta) {
        tipo = outraCarta.tipo;
        naipe = outraCarta.naipe;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;

    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;

    }

    @Override
    public String toString() {
        return tipo.toString() + " de " + naipe.toString();
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        Carta outraCarta = (Carta) outroObjeto;
        return tipo == outraCarta.tipo && naipe == outraCarta.naipe;
    }

    @Override
    public int compareTo(Carta that) {

        if (this.naipe.equals(that.naipe)) {

            return this.tipo.compareTo(that.tipo);

        } else {

            return this.naipe.compareTo(that.naipe);

        }

    }


}
