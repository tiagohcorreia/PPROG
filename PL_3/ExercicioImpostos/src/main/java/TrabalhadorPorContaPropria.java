public class TrabalhadorPorContaPropria extends ContribuienteComRendimentoDeTrabalho {

    private static double taxaRT = 0.03;
    private static final double MINIMA_TAXA_OR = 0.02;
    private static final double MAXIMA_TAXA_OR = 0.05;
    private static final int VALOR_DE_REFERENCIA = 50000;

    public TrabalhadorPorContaPropria(String nome, double rendimentosDeTrabalho, double outrosRendimentos) {
        super(nome, rendimentosDeTrabalho);
    }

    public static double getTaxaRT() {
        return taxaRT;
    }

    public static void setTaxaRT(double taxaRT) {
        TrabalhadorPorContaPropria.taxaRT = taxaRT;
    }

    public double getMINIMA_TAXA_OR() {
        return MINIMA_TAXA_OR;
    }

    public double getMAXIMA_TAXA_OR() {
        return MAXIMA_TAXA_OR;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrabalhadorPorContaPropria{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularImposto() {

        double taxaAplicada;

        if (getMINIMA_TAXA_OR() < VALOR_DE_REFERENCIA) {

            taxaAplicada = MINIMA_TAXA_OR;

        } else {

            taxaAplicada = MAXIMA_TAXA_OR;
        }
        return getRendimentosDeTrabalho() * taxaRT + getOutrosRendimentos() * taxaAplicada;
    }
}
