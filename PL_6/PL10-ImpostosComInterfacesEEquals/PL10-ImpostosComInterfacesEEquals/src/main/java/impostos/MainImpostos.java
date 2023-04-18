package impostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainImpostos {

    public static void main(String[] args) {

        //1)
        List<Contribuinte> contribuintes = new ArrayList<>();

        //2)
        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorContaOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));

        //-------------------------------------------------------------------------------------------------------------

        //3)
        System.out.println("### Listagem de Contribuintes ###");
        for(Contribuinte c : contribuintes) {
            System.out.println(c);
        }
        listar("lista", contribuintes);
        System.out.println();

        //-------------------------------------------------------------------------------------------------------------

        //4)
        Contribuinte c1 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        contribuintes.remove(c1);

        listar("### Lista Com Contribuinte Removido ###", contribuintes);

        System.out.println();

        //-------------------------------------------------------------------------------------------------------------

        //8)
        System.out.println("### Equals1 ###");
        Contribuinte c2 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        Contribuinte c3 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        System.out.println(c2.equals(c3));
        System.out.println();

        System.out.println("### Equals2 ###");
        Contribuinte c4 = new Desempregado("Raiden", "Inazuma", 230, 1);
        Contribuinte c5 = new Desempregado("Kirara", "Lisboa", 830, 7);
        System.out.println(c4.equals(c5));
        System.out.println();


        System.out.println("### Equals3 ###");
        Contribuinte c6 = new Reformado("Lito Vidal", "Lisboa", 230, 1);
        Contribuinte c7 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        System.out.println(c6.equals(c7));
        System.out.println();

        //-----------------------------------------------------------------------------------------------------------

        //9)

        Collections.sort(contribuintes,new criterioPorOrdemAlfabetica());
        listar("Listagem Por ordem Alfabética", contribuintes);


        Collections.sort(contribuintes,Collections.reverseOrder(new criterioPorTipoDepoisPorNome()));
        listar("Listagem Por Tipo e Por Ordem Alfabética", contribuintes);

    }

    private static void listar(String titulo, List<Contribuinte> a) {
        System.out.println("\n" + titulo);
        for (Contribuinte c : a) {
            //System.out.println("\n" + c + "\nImposto: " + c.calcularImposto() + "€");
            System.out.println(c.getNome());
        }
    }
}
