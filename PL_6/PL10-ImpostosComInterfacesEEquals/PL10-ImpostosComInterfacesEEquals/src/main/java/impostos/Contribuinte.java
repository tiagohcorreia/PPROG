package impostos;

import java.util.Objects;

public abstract class Contribuinte {

    private String nome;

    private String morada;

    private float outrosRendimentos;

    private static final String NOME_POR_OMISSAO = "sem nome";

    private static final String MORADA_POR_OMISSAO = "sem morada";

    private static final float OUTROS_RENDIMENTOS_POR_OMISSAO = 0;

    public Contribuinte(String nome, String morada, float outrosRendimentos) {
        this.nome = nome;
        this.morada = morada;
        this.outrosRendimentos = outrosRendimentos;
    }

    public Contribuinte() {
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        outrosRendimentos = OUTROS_RENDIMENTOS_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s %nMorada: %s %nOutros Rendimentos: %.2f€",
                nome, morada, outrosRendimentos);
    }

    @Override
    public boolean equals(Object outroObjeto) {

        if (this == outroObjeto) return true;

        if (outroObjeto == null || getClass() != outroObjeto.getClass()) return false;

        Contribuinte outroContribuinte = (Contribuinte) outroObjeto;

        return nome.equalsIgnoreCase(outroContribuinte.nome)
                && morada.equalsIgnoreCase(outroContribuinte.morada)
                && outrosRendimentos == outroContribuinte.outrosRendimentos;
    }



    public abstract float calcularImposto();

}
