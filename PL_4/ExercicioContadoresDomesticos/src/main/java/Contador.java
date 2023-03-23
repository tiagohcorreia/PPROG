/**
 * The type Contador.
 */
public abstract class Contador {

    private double consumo;
    private String nomeCliente;
    private String identificador;

    /**
     * Instantiates a new Contador.
     *
     * @param identificador the identificador
     * @param consumo       the consumo
     * @param nomeCliente   the nome cliente
     */
    public Contador(String identificador, double consumo, String nomeCliente) {
        this.identificador = identificador;
        this.consumo = consumo;
        this.nomeCliente = nomeCliente;
    }

    /**
     * Gets consumo.
     *
     * @return the consumo
     */
    public double getConsumo() {
        return consumo;
    }

    /**
     * Sets consumo.
     *
     * @param consumo the consumo
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * Gets nome cliente.
     *
     * @return the nome cliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Sets nome cliente.
     *
     * @param nomeCliente the nome cliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Gets identificador.
     *
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Sets identificador.
     *
     * @param identificador the identificador
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contador {");
        sb.append("Identificador: ").append(identificador);
        sb.append("Nome do Cliente: ").append(nomeCliente);
        sb.append("Consumo: ").append(consumo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Calcular custo consumo double.
     *
     * @return the double
     */
    public abstract double calcularCustoConsumo();
}
