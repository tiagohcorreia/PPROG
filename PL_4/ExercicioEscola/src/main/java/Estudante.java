/**
 * The type Estudante.
 */
public class Estudante extends Pessoa {
    private int numeroMecanografico;

    /**
     * Instantiates a new Estudante.
     *
     * @param nome                the nome
     * @param numeroId            the numero id
     * @param numeroMecanografico the numero mecanografico
     */
    public Estudante(String nome, int numeroId, int numeroMecanografico) {
        super(nome, numeroId);
        this.numeroMecanografico = numeroMecanografico;
    }

    /**
     * Gets numero mecanografico.
     *
     * @return the numero mecanografico
     */
    public int getNumeroMecanografico() {
        return numeroMecanografico;
    }

    /**
     * Sets numero mecanografico.
     *
     * @param numeroMecanografico the numero mecanografico
     */
    public void setNumeroMecanografico(int numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estudante { ");
        sb.append("Nome:").append(getNome()).append('\'');
        sb.append(", NumeroId:").append(getNumeroId());
        sb.append("NumeroMecanografico:").append(numeroMecanografico);
        sb.append('}');
        return sb.toString();
    }
}
