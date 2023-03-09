public class Main {
    public static void main(String[] args) {

        //a)
        Tempo t1 = new Tempo(12,30,5);

        //b)
        System.out.println(t1.toSegundoMinutoHoraString());

        //c)
        t1.setSegundo();

        //d)
        System.out.println(t1.toSegundoMinutoHoraString());

        //e)
        Tempo t2 = new Tempo(20,5,18);

        //f)
        System.out.println(t2.toSegundoMinutoHoraString());
        System.out.println();

        //g)
        System.out.println(t1.verificarMaiorTempo(t2));
        System.out.println();

        //h)
        System.out.println(t1.isTempoMaior(18,5,20));
        System.out.println();

        //i)
        System.out.println("A diferença em sengundos é de " + t1.calcularDiferencaEntreTempos(t2));
        System.out.println();



    }
}
