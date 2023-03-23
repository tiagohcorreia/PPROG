/**
 * The type Pessoa.
 */
public class Pessoa {

    private String nome;
    private int numeroId;

    /**
     * Instantiates a new Pessoa.
     *
     * @param nome     the nome
     * @param numeroId the numero id
     */
    public Pessoa(String nome, int numeroId) {
        this.nome = nome;
        this.numeroId = numeroId;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Gets numero id.
     *
     * @return the numero id
     */
    public int getNumeroId() {
        return numeroId;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Sets numero id.
     *
     * @param numeroId the numero id
     */
    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa { ");
        sb.append("Nome: ").append(nome).append('\'');
        sb.append(", NumeroId: ").append(numeroId);
        sb.append('}');
        return sb.toString();
    }
}
