import java.util.ArrayList;
import java.util.List;

/**
 * The type Main contadores 2.
 */
public class MainContadores2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        List<Contador> contadores = new ArrayList<>();
        contadores.add(new ContadorGas(50, "Ana"));
        contadores.add(new ContadorEletricidadeTarifarioSimples(20, 20, "Ana"));
        contadores.add(new ContadorEletricidadeTarifarioBiHorario(50, 20, "Ana"));
        contadores.add(new ContadorGas(50, "Ana"));

        for (int i = 0; i < contadores.size(); i++) {

            System.out.println(contadores.get(i));
        }

        double total = 0;
        for (Contador c : contadores) {
            total += c.calcularCustoConsumo();
        }

        System.out.println();
        System.out.println("Total= " + total);

        double total2 = 0;
        for (Contador c : contadores) {

            if(c instanceof ContadorEletricidadeTarifarioBiHorario) {
                total += c.calcularCustoConsumo();
            }
        }
        System.out.println("Total= " + total2);
        }





    }
