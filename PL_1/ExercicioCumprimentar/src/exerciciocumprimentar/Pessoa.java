package exerciciocumprimentar;

/**
 * The type Pessoa.
 */
public class Pessoa {


    /**
     * The Nome.
     */
    public String nome;
    /**
     * The Idade.
     */
    public int idade;

    /**
     * Instantiates a new Pessoa.
     *
     * @param nome  the nome
     * @param idade the idade
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Instantiates a new Pessoa.
     */
    public Pessoa() {
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
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets idade.
     *
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Sets idade.
     *
     * @param idade the idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Apresentar.
     */
    public void apresentar() {
        System.out.println("O nome é " + this.getNome() + " e tem " + this.getIdade() + " anos.");
    }

    /**
     * Cumprimentar.
     */
    public void cumprimentar() {
        System.out.println("Olá " + this.getNome() + ". " + " Tudo bem?" );
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idade=").append(idade);
        sb.append('}');
        return sb.toString();
    }
}
