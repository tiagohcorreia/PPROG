public class TrabalhadorPorContaOutrem extends ContribuienteComRendimentoDeTrabalho{

    private double taxaRT;
    private static double taxaOR = 0.02;
    private double outrosRendimentos;
    private static final double MINIMA_TAXA_RT = 0.01;
    private static final double MAXIMA_TAXA_RT = 0.02;

    public TrabalhadorPorContaOutrem(String nome, double rendimentosDeTrabalho, double outrosRendimentos) {
        super(nome, rendimentosDeTrabalho);
        this.outrosRendimentos = outrosRendimentos;
    }

    public double getTaxaRT() {
        return taxaRT;
    }

    public void setTaxaRT(double taxaRT) {
        this.taxaRT = taxaRT;
    }

    public static double getTaxaOR() {
        return taxaOR;
    }

    public static void setTaxaOR(double taxaOR) {
        TrabalhadorPorContaOutrem.taxaOR = taxaOR;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrabalhadorPorContaOutrem{");
        sb.append("taxaRT=").append(taxaRT);
        sb.append(", outrosRendimentos=").append(outrosRendimentos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularImposto() {

        double taxaAplicada;

        if(getRendimentosDeTrabalho() > 30000) {

            taxaAplicada = MINIMA_TAXA_RT;

        } else {

            taxaAplicada = MAXIMA_TAXA_RT;
        }
        return getRendimentosDeTrabalho() * taxaAplicada + getOutrosRendimentos() * taxaOR;
    }
}
