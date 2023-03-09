public class Main {
    public static void main(String[] args) {

        //a) crie um conjunto de instâncias de utentes

        //Utente u1 =
        //Utente u2 =
        //Utente u3 =
        //Utente u4 =
        //Utente u5 =

        //-------------------------------------------------------------------------------------------------------------

        //b) armazene estas instâncias num contentor do tipo array
        Utente[] utentes = new Utente[10];

        utentes[0] = new Utente();
        utentes[1] = new Utente("Nuno", 21, "Masculino", 1.59, 63);
        utentes[2] = new Utente("João", 31, "Masculino", 1.65, 60);
        utentes[3] = new Utente("Maria", 101, "Femenino", 1.50, 65);
        utentes[4] = new Utente("Alex", 18, "Femenino", 1.60, 68);

        //-------------------------------------------------------------------------------------------------------------

        //c)

        //i. obter a representação textual e legível de cada utente
        System.out.println("Listagem de Utentes");

        for (int i = 0; i < utentes.length; i++) {

            if(utentes[i] != null) {
                System.out.println(utentes[i]);
            }

        }
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("Número Total de Utentes = " + Utente.getTotalUtentes());
        System.out.println("-----------------------------------------------------");
        System.out.println();

        //ii. obter o nome, valor do IMC e grau de obesidade de cada utente
        System.out.println("Nome | IMC | Grau de obesidade");

        for (int i = 0; i < utentes.length; i++) {

            if(utentes[i] != null) {

                System.out.println("Nome = " + utentes[i].getNome() + " | IMC = "+ utentes[i].calcularIMC() +
                                   " | Classificação = " + utentes[i].deterimnarGrauDeObesidade());

            }
        }
        System.out.println();

        //iii. obter o nome e o grau de obesidade de cada utente que não tenha a classificação “Saudável”

        System.out.println("-----------------------------------------------------------");
        System.out.println("Utentes não Saudáveis");

        for (int i = 0; i < utentes.length; i++) {

            if(utentes[i] != null) {

                if(!utentes[i].verificarResultadoSaudavel()) {

                    System.out.println(utentes[i]);
                }
            }
        }
        System.out.println("-------------------------------------------------------------");

        //invoque o método para determinar qual dois utentes, usados na alínea anterior, é o mais novo. Implemente código para apresentar uma mensagem adequada
        System.out.println("Qual o utente mais novo?");
        System.out.println(utentes[1].calcularDiferençaDeIdadeEntreDoisUtentes(utentes[2]));
        System.out.println("-------------------------------------------------------------");

        System.out.println("Alteração da idade de um Utente");
        utentes[0].setIdade(utentes[2].getIdade());
        System.out.println(utentes[0]);



    }
}
