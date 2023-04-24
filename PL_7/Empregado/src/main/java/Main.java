import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Tempo> tempos = new ArrayList<>();

        List<Empregado> empregados = new ArrayList<>();

        List<Data> datas = new ArrayList<>();

        tempos.add(new Tempo(5, 40, 20));
        tempos.add(new Tempo(9, 30, 10));


        Data d1 = new Data(2013, 12, 10);
        Tempo t1 = new Tempo(2, 20, 10);
        Tempo t2 = new Tempo(18);

        empregados.add(new Empregado("Raiden", "Ei", d1, t1, t2));

        empregados.add(new Empregado("Venti", "Kirugaya", d1, t1, t2));

        listarEmpregados(empregados);

        d1.setData(2015, 11, 22);

        System.out.println();
        listarEmpregados(empregados);

        t1.setHoras(3);
        t2.setHoras(15);

        System.out.println();
        listarEmpregados(empregados);

        System.out.println();
        System.out.println("Listagem de Tempos");
        listarTempo(tempos);

        System.out.println();
        System.out.println("Listagem de Datas");
        listarDatas(datas);

    }

    private static void listarEmpregados(List<Empregado> empregados) {
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
    private static void listarDatas(List<Data> datas) {
        for (Data data : datas) {
            System.out.println(datas);
        }
    }
    private static void listarTempo(List<Tempo> tempos) {
        for (Tempo tempo : tempos) {
            System.out.println(tempos);
        }
    }

}
