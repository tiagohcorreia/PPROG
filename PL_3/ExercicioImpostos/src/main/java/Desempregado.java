public class Desempregado extends Contribuinte{

    private static double taxaOutrosRendimentos = 0.02;

    public Desempregado(String nome, double outrosRendimentos) {
        super(nome, outrosRendimentos);
    }

    public static double getTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    public static void setTaxaOutrosRendimentos(float taxaOutrosRendimentos) {
        Desempregado.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desempregado{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularImposto() {
        return getTaxaOutrosRendimentos() * taxaOutrosRendimentos;
    }
}
