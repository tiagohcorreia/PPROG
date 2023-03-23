/**
 * The type Estudante bolseiro.
 */
public class EstudanteBolseiro extends Estudante implements Pagamento {

    private double bolsa;

    /**
     * Instantiates a new Estudante bolseiro.
     *
     * @param nome                the nome
     * @param numeroId            the numero id
     * @param numeroMecanografico the numero mecanografico
     * @param bolsa               the bolsa
     */
    public EstudanteBolseiro(String nome, int numeroId, int numeroMecanografico, double bolsa) {
        super(nome, numeroId, numeroMecanografico);
        this.bolsa = bolsa;
    }

    /**
     * Gets bolsa.
     *
     * @return the bolsa
     */
    public double getBolsa() {
        return bolsa;
    }

    /**
     * Sets bolsa.
     *
     * @param bolsa the bolsa
     */
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EstudanteBolseiro { ");
        sb.append("Nome:").append(getNome()).append('\'');
        sb.append(", NumeroId:").append(getNumeroId());
        sb.append(", NumeroMecanografico:").append(getNumeroMecanografico());
        sb.append(", Bolsa:").append(bolsa);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularPagamento() {
        return bolsa;
    }
}
