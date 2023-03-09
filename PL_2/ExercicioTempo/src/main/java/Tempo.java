import org.w3c.dom.ls.LSOutput;

/**
 * The type Tempo.
 */
public class Tempo {

    //Atributos e Instância
    private int segundo;
    private int minuto;
    private int hora;

    //-----------------------------------------------------------------------------------------------------------------

    //Constantes
    private static final int SEGUNDO_POR_OMISSAO = 0;
    private static final int MINUTO_POR_OMISSAO = 0;
    private static final int HORA_POR_OMISSAO = 0;
    private static final int VALOR_MAXIMO_SEGUNDO = 60;
    private static final int VALOR_MAXIMO_MINUTO = 60;
    private static final int VALOR_MAXIMO_HORA = 24;

    //-----------------------------------------------------------------------------------------------------------------

    /**
     * Instantiates a new Tempo.
     *
     * @param segundo the segundo
     * @param minuto  the minuto
     * @param hora    the hora
     */
//Construtor
    public Tempo(int segundo, int minuto, int hora) {
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
    }
    //-----------------------------------------------------------------------------------------------------------------

    /**
     * Gets segundo.
     *
     * @return the segundo
     */
//getters
    public int getSegundo() {
        return segundo;
    }

    /**
     * Gets minuto.
     *
     * @return the minuto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Gets hora.
     *
     * @return the hora
     */
    public int getHora() {
        return hora;
    }
    //-----------------------------------------------------------------------------------------------------------------

    /**
     * Sets tempo.
     *
     * @param segundo the segundo
     * @param minuto  the minuto
     * @param hora    the hora
     */
//setters
    public void setTempo(int segundo, int minuto, int hora) {
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
    }

    /**
     * Sets segundo.
     */
    public void setSegundo() {
        this.segundo++;
    }
    //-----------------------------------------------------------------------------------------------------------------

    //Método toString

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tempo{");
        sb.append("segundo=").append(segundo);
        sb.append(", minuto=").append(minuto);
        sb.append(", hora=").append(hora);
        sb.append('}');
        return sb.toString();
    }
    //-----------------------------------------------------------------------------------------------------------------

    /**
     * To segundo minuto hora string string.
     *
     * @return the string
     */
//Outros Métodos
    public String toSegundoMinutoHoraString() {

        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    /**
     * Acrescentar segundo.
     */
    public void acrescentarSegundo() {
        this.segundo++;
    }

    /**
     * Verificar maior tempo tempo.
     *
     * @param outroTempo the outro tempo
     * @return the tempo
     */
    public Tempo verificarMaiorTempo(Tempo outroTempo) {

        if (this.minuto > outroTempo.getMinuto()) {

            return this;

        } else if (this.segundo > outroTempo.getSegundo()) {

            return this;

        } else {

            return outroTempo;
        }

    }

    /**
     * Calcular diferenca entre tempos int.
     *
     * @param outroTempo the outro tempo
     * @return the int
     */
    public int calcularDiferencaEntreTempos(Tempo outroTempo) {

        int totalDeSegundos1 = this.segundo + this.minuto * 60 + this.hora * 3600;
        int totalDeSegundos2 = outroTempo.getSegundo() + getMinuto() * 60 + this.getHora() * 3600;

        return Math.abs(totalDeSegundos1 - totalDeSegundos2);

    }

    /**
     * Is tempo maior string.
     *
     * @param hora    the hora
     * @param minuto  the minuto
     * @param segundo the segundo
     * @return the string
     */
    public String isTempoMaior(int hora, int minuto, int segundo) {

        if (this.hora < hora) {

            if (this.minuto < minuto) {

                if (this.segundo < segundo) {

                    System.out.println("O tempo " + hora + ":" + minuto + ":" + segundo + " é maior");
                }
            }
        }
        return "O tempo " + this + " é maior";
    }


}
