/**
 * The type Contador gas.
 */
public class ContadorGas extends Contador {

    private static final String PREFIXO_CONTADOR_GAS = "GAS-";

    private static final double CUSTO_UNITARIO = 0.8;

    private static int totalContadoresGas = 1;

    /**
     * Instantiates a new Contador gas.
     *
     * @param consumo     the consumo
     * @param nomeCliente the nome cliente
     */
    public ContadorGas(double consumo, String nomeCliente) {
        super(PREFIXO_CONTADOR_GAS + totalContadoresGas, consumo, nomeCliente);
        totalContadoresGas++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContadorGas: ");
        sb.append(" #Nome Cliente: ").append(getNomeCliente());
        sb.append(" #Identificador: ").append(PREFIXO_CONTADOR_GAS + getIdentificador());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularCustoConsumo() {
        return CUSTO_UNITARIO * getConsumo();
    }

    /**
     * Gets total contadores gas.
     *
     * @return the total contadores gas
     */
    public static int getTotalContadoresGas() {
        return totalContadoresGas;
    }
}
