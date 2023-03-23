/**
 * The type Contador eletricidade.
 */
public abstract class ContadorEletricidade extends Contador {

    private static final String PREFIXO_CONTADOR_ELETRICIDADE = "ELECT";
    /**
     * The constant totalContadoresEletricidade.
     */
    protected static int totalContadoresEletricidade = 1;

    /**
     * Instantiates a new Contador eletricidade.
     *
     * @param consumo     the consumo
     * @param nomeCliente the nome cliente
     */
    public ContadorEletricidade(double consumo, String nomeCliente) {
        super(PREFIXO_CONTADOR_ELETRICIDADE + totalContadoresEletricidade, consumo, nomeCliente);
        totalContadoresEletricidade++;
    }

    /**
     * Gets prefixo contador eletricidade.
     *
     * @return the prefixo contador eletricidade
     */
    public String getPREFIXO_CONTADOR_ELETRICIDADE() {
        return PREFIXO_CONTADOR_ELETRICIDADE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContadorEletricidade {");
        sb.append(" #Identificador:").append(PREFIXO_CONTADOR_ELETRICIDADE + getIdentificador());
        sb.append(" #Nome do Cliente:").append(getNomeCliente());
        sb.append(" #Consumo:").append(getConsumo());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public abstract double calcularCustoConsumo();

    /**
     * Gets total contadores eletricidade.
     *
     * @return the total contadores eletricidade
     */
    public static int getTotalContadoresEletricidade() {
        return totalContadoresEletricidade;
    }
}
