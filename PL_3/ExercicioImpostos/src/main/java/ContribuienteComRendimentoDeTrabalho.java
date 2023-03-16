public abstract class ContribuienteComRendimentoDeTrabalho extends Contribuinte {

    private double rendimentosDeTrabalho;

    public ContribuienteComRendimentoDeTrabalho(String nome, double outrosRendimentos) {
        super(nome, outrosRendimentos);
        this.rendimentosDeTrabalho = rendimentosDeTrabalho;
    }

    public double getRendimentosDeTrabalho() {
        return rendimentosDeTrabalho;
    }

    public void setRendimentosDeTrabalho(double rendimentosDeTrabalho) {
        this.rendimentosDeTrabalho = rendimentosDeTrabalho;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContribuienteComRendimentoDeTrabalho{");
        sb.append("rendimentosDeTrabalho=").append(rendimentosDeTrabalho);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public abstract double calcularImposto();

}
