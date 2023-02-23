package exerciciocumprimentar;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Rony",18);
        p1.apresentar();
        p1.cumprimentar();
        p1.toString();
    }
}
