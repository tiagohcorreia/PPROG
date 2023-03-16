public abstract class Contribuinte {

    //Atributos
    private String nome;
    private String morada;
    private double outrosRendimentos;
    private final String NOME_POR_OMISSAO = "sem nome";
    private final String MORADA_POR_OMISSAO = "sem morada";
    private final double RENDIMENTOS_POR_OMISSAO = 0;


    //-------------------------------------------------------------------------------------------------------------

    //Construtores
    public Contribuinte(String nome, double outrosRendimentos) {
        this.nome = nome;
        this.outrosRendimentos = outrosRendimentos;
    }

    public Contribuinte() {
        this.nome = NOME_POR_OMISSAO;
        this.outrosRendimentos = RENDIMENTOS_POR_OMISSAO;
    }

    //-------------------------------------------------------------------------------------------------------------

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public double getOutrosRendimentos() {
        return outrosRendimentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setOutrosRendimentos(double outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }
    //--------------------------------------------------------------------------------------------------------------

    //toString

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contribuinte{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", moreda='").append(morada).append('\'');
        sb.append('}');
        return sb.toString();
    }
    //-------------------------------------------------------------------------------------------------------------

    //Métodos
    public abstract double calcularImposto();
}
