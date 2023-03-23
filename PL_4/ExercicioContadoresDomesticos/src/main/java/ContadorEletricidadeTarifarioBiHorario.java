/**
 * The type Contador eletricidade tarifario bi horario.
 */
public class ContadorEletricidadeTarifarioBiHorario extends ContadorEletricidade {

    private double consumo2;
    private static final double HORA_DE_VAZIO = 0.066;
    private static final double HORA_FORA_DE_VAZIO = 0.14;

    /**
     * Instantiates a new Contador eletricidade tarifario bi horario.
     *
     * @param consumo     the consumo
     * @param consumo2    the consumo 2
     * @param nomeCliente the nome cliente
     */
    public ContadorEletricidadeTarifarioBiHorario(double consumo, double consumo2, String nomeCliente) {
        super(consumo, nomeCliente);
        this.consumo2 = consumo2;
        totalContadoresEletricidade++;
    }

    /**
     * Gets consumo 2.
     *
     * @return the consumo 2
     */
    public double getConsumo2() {
        return consumo2;
    }

    /**
     * Sets consumo 2.
     *
     * @param consumo2 the consumo 2
     */
    public void setConsumo2(double consumo2) {
        this.consumo2 = consumo2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContadorEletricidadeTarifarioBiHorario { ");
        sb.append(" #Identificador: ").append(getPREFIXO_CONTADOR_ELETRICIDADE() + getIdentificador());
        sb.append(" #Consumo: ").append(getConsumo());
        sb.append(" #Nome Cliente: ").append(getNomeCliente());
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public double calcularCustoConsumo() {
        return getConsumo() * HORA_DE_VAZIO + getConsumo2() * HORA_FORA_DE_VAZIO;
    }
}
