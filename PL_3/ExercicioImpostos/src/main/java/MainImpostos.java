public class MainImpostos {
    public static void main(String[] args) {

        TrabalhadorPorContaPropria tcp = new TrabalhadorPorContaPropria("Hiro", 10000,5000);
        TrabalhadorPorContaOutrem tco = new TrabalhadorPorContaOutrem( "ZeroTwo", 90000, 5000);
        Reformado reformado = new Reformado("Raiden Shugun", 6000, 3000);
        Desempregado desempregado = new Desempregado("Venti", 3000);

        Contribuinte[] contribuientes = new Contribuinte[10];
        contribuientes[0] = tcp;
        contribuientes[1] = tco;
        contribuientes[2] = reformado;
        contribuientes[3] = desempregado;

        for (int i = 0; i < contribuientes.length; i++) {

            System.out.println();

            if (contribuientes[i] != null) {

                System.out.println(contribuientes[i]);
                System.out.println(contribuientes[i].calcularImposto());
            }

            if (contribuientes[i] instanceof Desempregado) {

                    System.out.println("Lista de contribuintes desempregados com os seus respetivos impostos");
                    System.out.println(contribuientes[i].getNome() + contribuientes[i].calcularImposto());

            }

        }


    }
}
