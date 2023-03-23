/**
 * The type Professor.
 */
public class Professor extends Pessoa implements Pagamento {
    private static double salarioBase = 1500;
    private String categoria;
    private static final String ASSISTENTE = "Assistente";
    private static final String COORDENADOR = "Coordenador";
    private static final String ADJUNTO = "Adjunto";
    private static final double MAJORACAO_ADJUNTO = 0.2;
    private static final double MAJORACAO_COORDENADOR = 0.5;


    /**
     * Instantiates a new Professor.
     *
     * @param nome      the nome
     * @param numeroId  the numero id
     * @param categoria the categoria
     */
    public Professor(String nome, int numeroId, String categoria) {
        super(nome, numeroId);
        this.categoria = categoria;
    }

    /**
     * Gets salario base.
     *
     * @return the salario base
     */
    public static double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Sets salario base.
     *
     * @param salarioBase the salario base
     */
    public static void setSalarioBase(double salarioBase) {
        Professor.salarioBase = salarioBase;
    }

    /**
     * Gets categoria.
     *
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets categoria.
     *
     * @param categoria the categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Professor { ");
        sb.append("Nome: ").append(getNome()).append('\'');
        sb.append(", NumeroId: ").append(getNumeroId());
        sb.append("categoria='").append(categoria).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private double calcularMajoracao() {

        if (this.categoria.equalsIgnoreCase(ASSISTENTE)) {

            return 0;

        } else if (this.getCategoria().equalsIgnoreCase(ADJUNTO)) {

            return salarioBase * MAJORACAO_ADJUNTO;

        } else if (this.categoria.equalsIgnoreCase(COORDENADOR)) {

            return salarioBase * MAJORACAO_COORDENADOR;
        }
        return 0;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + calcularMajoracao();
    }
}
