package impostos;

public class Desempregado extends Contribuinte {

    private int mesesParagem;

    private static final int MESES_PARAGEM_POR_OMISSAO = 0;
    
    private static float taxaOutrosRendimentos = 2;

    public Desempregado(String nome, String morada, float outrosRendimentos,
                        int mesesParagem) {
        super(nome, morada, outrosRendimentos);
        this.mesesParagem = mesesParagem;
    }

    public Desempregado() {
        super();
        mesesParagem = MESES_PARAGEM_POR_OMISSAO;
    }

    public int getMesesParagem() {
        return mesesParagem;
    }

    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }

    public String toString() {
        return String.format("DESEMPREGADO %n%s %nN. de Meses de Paragem: %d"
                + "%nTaxa sobre Outros Rendimentos: %.1f%%",
                super.toString(), mesesParagem, taxaOutrosRendimentos);
    }

    @Override
    public boolean equals(Object outroObjeto) {

        if (!super.equals(outroObjeto)) return false;

        Desempregado outroDesempregado = (Desempregado) outroObjeto;

        return mesesParagem == outroDesempregado.mesesParagem;
    }    
    
    public static float getTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    public static void setTaxaOutrosRendimentos(float taxaOutrosRendimentos) {
        Desempregado.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }

    @Override
    public float calcularImposto() {
        return getOutrosRendimentos() * taxaOutrosRendimentos / 100;
    }

}
