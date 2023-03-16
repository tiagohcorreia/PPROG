public class Reformado extends ContribuienteComRendimentoDeTrabalho {

    private static double taxaRT = 0.01;
    private static double taxaOR = 0.03;
    private static double outrosRendimentos;

    public Reformado(String nome, double rendimentosDeTrabalho, double outrosRendimentos) {
        super(nome, rendimentosDeTrabalho);
        this.outrosRendimentos = outrosRendimentos;
    }

    public static double getTaxaRT() {
        return taxaRT;
    }

    public static void setTaxaRT(double taxaRT) {
        Reformado.taxaRT = taxaRT;
    }

    public static double getTaxaOR() {
        return taxaOR;
    }

    public static void setTaxaOR(double taxaOR) {
        Reformado.taxaOR = taxaOR;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reformado{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularImposto() {
        return getOutrosRendimentos() * taxaRT + getOutrosRendimentos() * taxaOR;
    }
}
