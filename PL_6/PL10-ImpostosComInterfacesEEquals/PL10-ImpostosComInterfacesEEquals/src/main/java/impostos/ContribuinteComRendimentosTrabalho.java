package impostos;

public abstract class ContribuinteComRendimentosTrabalho extends Contribuinte {

    private float rendimentosTrabalho;
    
    private static final float RENDIMENTOS_TRABALHO_POR_OMISSAO = 0;

    public ContribuinteComRendimentosTrabalho(String nome,
                                              String morada, 
                                              float rendimentosTrabalho, 
                                              float outrosRendimentos) {
        super(nome, morada, outrosRendimentos);
        this.rendimentosTrabalho = rendimentosTrabalho;
    }

    public ContribuinteComRendimentosTrabalho() {
        super();
        rendimentosTrabalho = RENDIMENTOS_TRABALHO_POR_OMISSAO;
    }

    public float getRendimentosTrabalho() {
        return rendimentosTrabalho;
    }

    public void setRendimentosTrabalho(float rendimentosTrabalho) {
        this.rendimentosTrabalho = rendimentosTrabalho;
    }

    @Override
    public String toString() {
        return String.format("%s %nRendimentos do Trabalho: %.2f€"
                                + "%nTaxa sobre Rendimento do Trabalho: %.1f%%"
                                + "%nTaxa sobre Outros Rendimentos: %.1f%%",
                                super.toString(), 
                                rendimentosTrabalho,
                                obterTaxaRendimentosTrabalho(),
                                obterTaxaOutrosRendimentos());
    }

    @Override
    public boolean equals(Object outroObjeto) {

        if (!super.equals(outroObjeto)) return false;

        ContribuinteComRendimentosTrabalho outroContribuinteRT = (ContribuinteComRendimentosTrabalho) outroObjeto;

        return rendimentosTrabalho == outroContribuinteRT.rendimentosTrabalho;
    }    
    
    @Override
    public float calcularImposto() {
        return (rendimentosTrabalho * obterTaxaRendimentosTrabalho() + 
                getOutrosRendimentos() * obterTaxaOutrosRendimentos()) / 100;
    }
    
    public abstract float obterTaxaRendimentosTrabalho();

    public abstract float obterTaxaOutrosRendimentos();
}
