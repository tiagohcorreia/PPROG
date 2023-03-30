import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);
        System.out.println();


        /*Comparator<Trabalhador> criterioPorVencimento = new Comparator<Trabalhador>() {
            @Override
            public int compare(Trabalhador t1, Trabalhador t2) {
                if (t1.calcularVencimento() > t2.calcularVencimento()) {

                    return 1;

                } else if (t1.calcularVencimento() < t2.calcularVencimento()) {

                    return -1;

                } else {

                    return 0;
                }
            }
        };*/

        criterioPorVencimento cpv = new criterioPorVencimento();

        System.out.println("### Lista de Trabalhadores por ordem crescente dos Vencimentos ###");
        Collections.sort(trabs, new criterioPorVencimento());
        //Collections.sort(trabs, new cpv());
        listar(trabs);
        System.out.println();

        System.out.println("### Lista de Trabalhadores por ordem decrecente dos Vencimentos");
        Collections.sort(trabs,Collections.reverseOrder(new criterioPorVencimento()));
        listar(trabs);
        System.out.println();


        /*Comparator<Trabalhador> criterioPorOrdemAlfabetica = new Comparator<Trabalhador>() {
            @Override
            public int compare(Trabalhador t1, Trabalhador t2) {
                return t1.getNome().compareToIgnoreCase(t2.getNome());
            }
        };*/

        System.out.println("### Lista de Trabalhadores por ordem Alfabética ###");
        Collections.sort(trabs, new criterioPorOrdemAlfabetica());
        listar(trabs);
        System.out.println();


    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(), trab.calcularVencimento());
            }
        }
    }

}
