/**
 * The type Contador eletricidade tarifario simples.
 */
public class ContadorEletricidadeTarifarioSimples extends ContadorEletricidade {

    private double potenciaContratada;
    private static final double VALOR_REFERENCIA_POTENCIA = 6.9;
    private static final double MAXIMO_TARIFARIO_SIMPLES = 0.16;
    private static final double MINIMO_TARIFARIO_SIMPLES = 0.13;

    /**
     * Instantiates a new Contador eletricidade tarifario simples.
     *
     * @param consumo            the consumo
     * @param potenciaContratada the potencia contratada
     * @param nomeCliente        the nome cliente
     */
    public ContadorEletricidadeTarifarioSimples(int consumo, double potenciaContratada, String nomeCliente) {
        super(consumo, nomeCliente);
        this.potenciaContratada = potenciaContratada;
        totalContadoresEletricidade++;
    }

    /**
     * Gets potencia contratada.
     *
     * @return the potencia contratada
     */
    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    /**
     * Sets potencia contratada.
     *
     * @param potenciaContratada the potencia contratada
     */
    public void setPotenciaContratada(double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContadorEletricidadeTarifarioSimples {");
        sb.append(" #Identificador: ").append(getPREFIXO_CONTADOR_ELETRICIDADE() + getIdentificador());
        sb.append(" #Nome do Cliente: ").append(getNomeCliente());
        sb.append(" #Consumo: ").append(getConsumo());
        sb.append(" #Potencia Contratada: ").append(potenciaContratada);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularCustoConsumo() {

        double taxaAplicada;

        if (this.potenciaContratada < VALOR_REFERENCIA_POTENCIA) {

            taxaAplicada = MINIMO_TARIFARIO_SIMPLES;

        } else {

            taxaAplicada = MAXIMO_TARIFARIO_SIMPLES;
        }
        return taxaAplicada * getConsumo();
    }
}
