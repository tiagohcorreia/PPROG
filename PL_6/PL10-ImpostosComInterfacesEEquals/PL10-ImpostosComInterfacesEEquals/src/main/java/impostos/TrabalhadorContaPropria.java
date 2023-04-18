package impostos;

public class TrabalhadorContaPropria extends ContribuinteComRendimentosTrabalho {

    private String profissao;

    private static final String PROFISSAO_POR_OMISSAO = "sem profissão";

    private static float escalao1OutrosRendimentos = 50000;
    
    private static float taxaRendimentosTrabalho = 3;
    
    private static float taxaOutrosRendimentos1 = 2;
    
    private static float taxaOutrosRendimentos2 = 5;

    public TrabalhadorContaPropria(String nome,
                                     String morada, 
                                     float rendimentosTrabalho, 
                                     float outrosRendimentos,
                                     String profissao) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
        this.profissao = profissao;
    }

    public TrabalhadorContaPropria() {
        super();
        profissao = PROFISSAO_POR_OMISSAO;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return String.format("TRABALHADOR POR CONTA PROPRIA %n%s"
                             + "%nProfissao: %s ", super.toString(), profissao);
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        TrabalhadorContaPropria outroTrabalhadorContaPropria = 
                (TrabalhadorContaPropria) outroObjeto;
        return profissao.equalsIgnoreCase(outroTrabalhadorContaPropria.profissao);
    }    

    @Override
    public float obterTaxaRendimentosTrabalho() {
        return taxaRendimentosTrabalho;
    }

    @Override
    public float obterTaxaOutrosRendimentos() {
        return (getOutrosRendimentos() <= escalao1OutrosRendimentos)
                ? taxaOutrosRendimentos1
                : taxaOutrosRendimentos2;
    }

    public static float getEscalao1OutrosRendimentos() {
        return escalao1OutrosRendimentos;
    }

    public static float getTaxaRendimentosTrabalho() {
        return taxaRendimentosTrabalho;
    }

    public static float getTaxaOutrosRendimentos1() {
        return taxaOutrosRendimentos1;
    }

    public static float getTaxaOutrosRendimentos2() {
        return taxaOutrosRendimentos2;
    }

    public static void setTaxaRendimentosTrabalho(float taxaRendimentosTrabalho) {
        TrabalhadorContaPropria.taxaRendimentosTrabalho = taxaRendimentosTrabalho;
    }

    public static void setTaxaOutrosRendimentos1(float taxaOutrosRendimentos1) {
        TrabalhadorContaPropria.taxaOutrosRendimentos1 = taxaOutrosRendimentos1;
    }

    public static void setTaxaOutrosRendimentos2(float taxaOutrosRendimentos2) {
        TrabalhadorContaPropria.taxaOutrosRendimentos2 = taxaOutrosRendimentos2;
    }

    public static void setEscalao1OutrosRendimentos(float escalao1OutrosRendimentos) {
        TrabalhadorContaPropria.escalao1OutrosRendimentos = escalao1OutrosRendimentos;
    }
}
