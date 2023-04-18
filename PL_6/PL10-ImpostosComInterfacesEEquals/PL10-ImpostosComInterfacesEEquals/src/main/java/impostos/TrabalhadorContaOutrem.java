package impostos;

public class TrabalhadorContaOutrem extends ContribuinteComRendimentosTrabalho {

    private String empresa;

    private static final String EMPRESA_POR_OMISSAO = "sem empresa";

    private static float escalao1RendimentosTrabalho = 30000;
    
    private static float taxaRendimentosTrabalho1 = 1;
    
    private static float taxaRendimentosTrabalho2 = 2;
    
    private static float taxaOutrosRendimentos = 2;

    public TrabalhadorContaOutrem(String nome,
                                  String morada, 
                                  float rendimentosTrabalho, 
                                  float outrosRendimentos, 
                                  String empresa) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
        this.empresa = empresa;
    }

    public TrabalhadorContaOutrem() {
        super();
        empresa = EMPRESA_POR_OMISSAO;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return String.format("TRABALHADOR POR CONTA DE OUTREM %n%s "
                              + "%nEmpresa: %s ", super.toString(), empresa); 
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        TrabalhadorContaOutrem outroTrabalhadorContaOutrem = 
                (TrabalhadorContaOutrem) outroObjeto;
        return empresa.equalsIgnoreCase(outroTrabalhadorContaOutrem.empresa);
    }    

    @Override
    public float obterTaxaRendimentosTrabalho() {
        return (getRendimentosTrabalho() <= escalao1RendimentosTrabalho)
                ? taxaRendimentosTrabalho1
                : taxaRendimentosTrabalho2;
    }

    @Override
    public float obterTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    public static float getEscalao1RendimentosTrabalho() {
        return escalao1RendimentosTrabalho;
    }

    public static float getTaxaRendimentosTrabalho1() {
        return taxaRendimentosTrabalho1;
    }

    public static float getTaxaRendimentosTrabalho2() {
        return taxaRendimentosTrabalho2;
    }

    public static float getTaxaOutrosRendimentos() {
        return taxaOutrosRendimentos;
    }

    public static void setEscalao1RendimentosTrabalho(float escalao1RendimentosTrabalho) {
        TrabalhadorContaOutrem.escalao1RendimentosTrabalho = escalao1RendimentosTrabalho;
    }

    public static void setTaxaRendimentosTrabalho1(float taxaRendimentosTrabalho1) {
        TrabalhadorContaOutrem.taxaRendimentosTrabalho1 = taxaRendimentosTrabalho1;
    }

    public static void setTaxaRendimentosTrabalho2(float taxaRendimentosTrabalho2) {
        TrabalhadorContaOutrem.taxaRendimentosTrabalho2 = taxaRendimentosTrabalho2;
    }

    public static void setTaxaOutrosRendimentos(float taxaOutrosRendimentos) {
        TrabalhadorContaOutrem.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }
}
