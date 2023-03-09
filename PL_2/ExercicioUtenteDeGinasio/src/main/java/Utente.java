/**
 * The type Utente.
 */
public class Utente {

    //Atributos de Instância
    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    //-----------------------------------------------------------------------------------------------------------------

    //Constantes
    private static final String NOME_POR_OMISSAO = "nome não defenido";
    private static final int IDADE_POR_OMISSAO = 1;
    private static final String GENERO_POR_OMISSAO = "género não defenido";
    private static final double ALTURA_POR_OOMISSAO = 1;
    private static final double PESO_POR_OMISSAO = 1;
    private static final String RESULTADO_MAGRO = "Magro";
    private static final String RESULTADO_SAUDAVEL = "Saudável";
    private static final String RESULTADO_OBESO = "Obeso";
    private static int VALOR_DO_IMC_MAXIMO = 25;
    private static int VALOR_DO_IMC_MINIMO = 18;

    //-----------------------------------------------------------------------------------------------------------------

    //Atributos da classe
    /**
     * Counts the number of Utentes
     */
    private static int totalUtentes = 0;

    //-----------------------------------------------------------------------------------------------------------------

    //Construtores
    public Utente() {
        this(NOME_POR_OMISSAO, IDADE_POR_OMISSAO, GENERO_POR_OMISSAO, ALTURA_POR_OOMISSAO, PESO_POR_OMISSAO);
    }

    /**
     * Instantiates a new Utente.
     *
     * @param nome  the nome
     * @param idade the idade
     */
    public Utente(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
        this.genero = GENERO_POR_OMISSAO;
        this.altura = ALTURA_POR_OOMISSAO;
        this.peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }

    /**
     * Instantiates a new Utente.
     *
     * @param nome   the nome
     * @param idade  the idade
     * @param genero the genero
     * @param altura the altura
     * @param peso   the peso
     */
    public Utente(String nome, int idade, String genero, double altura, double peso) {

        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        totalUtentes++;
    }
    //-----------------------------------------------------------------------------------------------------------------

    /**
     * Gets nome.
     *
     * @return the nome
     */
//Métodos acessres
    public String getNome() {
        return nome;
    }

    /**
     * Gets genero.
     *
     * @return the genero
     */
    public String getGenero() {
        return genero;
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
     * Gets altura.
     *
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Gets peso.
     *
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }
    //-----------------------------------------------------------------------------------------------------------------

    // Métodos setters

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Sets genero.
     *
     * @param genero the genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
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
     * Sets altura.
     *
     * @param altura the altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Sets peso.
     *
     * @param peso the peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //-----------------------------------------------------------------------------------------------------------------

    //Método toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Utente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", idade=").append(idade);
        sb.append(", altura=").append(altura);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    //-----------------------------------------------------------------------------------------------------------------

    //Outros Métodos

    /**
     * Calcular diferença de idade entre dois utentes int.
     *
     * @param outroUtente the outro utente
     * @return the int
     */
    public int calcularDiferençaDeIdadeEntreDoisUtentes(Utente outroUtente) {

        return idade - outroUtente.getIdade();
    }

    /**
     * Calcular imc double.
     *
     * @return the double
     */

    public double calcularIMC() {

        return peso / Math.pow(altura, 2);
    }

    /**
     * Deterimnar grau de obesidade string.
     *
     * @return the string
     */

    public String deterimnarGrauDeObesidade() {

        double imc = calcularIMC();
        String resultado = "";

        if (imc < VALOR_DO_IMC_MINIMO) {

            System.out.println("Magro");
            resultado = RESULTADO_MAGRO;

        } else if (imc <= VALOR_DO_IMC_MAXIMO) {

            System.out.println("Saudável");
            resultado = RESULTADO_SAUDAVEL;

        } else {

            System.out.println("Obeso");
            resultado = RESULTADO_OBESO;

        }
        return resultado;
    }

    /**
     * Verificar resultado saudavel boolean.
     *
     * @return the boolean
     */
//verificar se um utente tem, relativamente ao grau de obesidade, a classificação “Saudável”
    public boolean verificarResultadoSaudavel() {

        return deterimnarGrauDeObesidade().equals(RESULTADO_SAUDAVEL);
    }

    /**
     * Determinar utente mais novo utente.
     *
     * @param outroUtente the outro utente
     * @return the utente
     */

    public Utente DeterminarUtenteMaisNovo(Utente outroUtente) {

        if (this.idade < outroUtente.idade) {

            return this;

        } else if (this.idade > outroUtente.getIdade()) {

            return outroUtente;

        } else {

            return null;

        }

    }

    /**
     * Gets total utentes.
     *
     * @return the total utentes
     */
    public static int getTotalUtentes() {
        return totalUtentes;
    }

    /**
     * Sets imc minimo.
     *
     * @param valor the valor
     */
    public static void setImcMinimo(int valor) {
        VALOR_DO_IMC_MINIMO = valor;
    }

    /**
     * Sets imc maximo.
     *
     * @param valor the valor
     */
    public static void setImcMaximo(int valor) {
        VALOR_DO_IMC_MAXIMO = valor;
    }


}
