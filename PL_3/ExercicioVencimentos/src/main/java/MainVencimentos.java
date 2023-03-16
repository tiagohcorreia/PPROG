public class MainVencimentos {
    public static void main(String[] args) {

        //Objeto do tipo TrabalhadorPeca, de nome Jorge Silva que produziu 53 peças do tipo 1 e 62 do tipo 2;
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 53, 62);

        //Objeto do tipo TrabalhadorComissao, de nome Susana Ferreira, com o salário base de 650,00€
        //e uma comissão de 4,25% sobre as vendas efetuadas que totalizaram o valor de 2731,50€;
        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 650, 2731.50f, 4.25f);

        //Objeto do tipo TrabalhadorHora, de nome Carlos Miguel, que ganha por hora 4,50€ e com um
        //total de horas de trabalho igual a 168
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);

        //Crie um contentor de objetos para guardar os objetos existentes. Este contentor deve ser um array do
        //tipo Object com comprimento 10
        Trabalhador[] trabalhadores = new Trabalhador[10];
        trabalhadores[0] = tp;
        trabalhadores[1] = tc;
        trabalhadores[2] = th;

        for (int i = 0; i < trabalhadores.length; i++) {

            System.out.println();

            if (trabalhadores[i] != null) {

                System.out.println(trabalhadores[i]);
                System.out.printf("Nome: %s tem um vencimento de:%.2f", trabalhadores[i].getNome(),trabalhadores[i].calcularVencimento());
                System.out.println();

                if (trabalhadores[i] instanceof TrabalhadorPeca) {

                    System.out.println("Lista de Trabalhadores à Peça");
                    System.out.println(trabalhadores[i]);
                }
            }

        }

    }
}
