package impostos;

public class Reformado extends ContribuinteComRendimentosTrabalho {

    private static float taxaRendimentosTrabalho = 1;
    
    private static float taxaOutrosRendimentos = 3;

    public Reformado(String nome, String morada, float rendimentosTrabalho, float outrosRendimentos) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
    }

    public Reformado() {
        super();
    }

    @Override
    public String toString() {
        return String.format("REFORMADO %n%s ", super.toString()); 
    }


    @Override
    public float obterTaxaRendimentosTrabalho() {
        return taxaRendimentosTrabalho;
    }

    @Override
    public float obterTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    public static float getTaxaRendimentosTrabalho() {
        return taxaRendimentosTrabalho;
    }

    public static float getTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    public static void setTaxaRendimentosTrabalho(float taxaRendimentosTrabalho) {
        Reformado.taxaRendimentosTrabalho = taxaRendimentosTrabalho;
    }

    public static void setTaxaOutrosRendimentos(float taxaOutrosRendimentos) {
        Reformado.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }
}
