/**
 * The type Main contadores.
 */
public class MainContadores {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Contador[] contadores = new Contador[10];
        contadores[0] = new ContadorGas(100,"Shenhe");
        contadores[1] = new ContadorEletricidadeTarifarioSimples(100,230,"Beidou");
        contadores[2] = new ContadorEletricidadeTarifarioSimples(50,230,"Venti");
        contadores[3] = new ContadorEletricidadeTarifarioBiHorario(100,20,"Ganyu" );

        System.out.println("###Lista de Contadores###");
        for (int i = 0; i < contadores.length; i++) {

            if(contadores[i] != null) {

                System.out.println(contadores[i]);
            }

        }
        System.out.println();

        System.out.println("Quantidade de Contadores de Eletricidade: " + ContadorEletricidade.getTotalContadoresEletricidade() );
        System.out.println();


        //Liste os identificadores dos contadores de eletricidade com tarifário bi-horário, armazenados no contentor
        System.out.println("### Lista de Contadores de Eletricidade com tarifário bi-horário ###");

        for (int i = 0; i < contadores.length; i++) {

            if(contadores[i] != null) {

                if(contadores[i] instanceof ContadorEletricidadeTarifarioBiHorario) {

                    System.out.println(((ContadorEletricidadeTarifarioBiHorario) contadores[i]).getPREFIXO_CONTADOR_ELETRICIDADE() + contadores[i].getIdentificador());
                }
            }

        }
        System.out.println();

        //Liste os identificadores dos contadores, acompanhados do respetivo custo do consumo. Para o efeito
        //deve usar o mecanismo do polimorfismo, sem recorrer ao método reescrito toString
        System.out.println("### Lista de Identificadores com o respetivo consumo ###");
        for (int i = 0; i < contadores.length; i++) {

            if(contadores[i] != null) {

                System.out.println("Identificador: " + contadores[i].getIdentificador() + " Consumo: " + contadores[i].calcularCustoConsumo());
            }

        }

        System.out.println();

        //Mostre o maior valor consumido de gás

        //Liste os nomes dos clientes, sem repetições, que possuem contadores
        System.out.println("### Lista de Clientes com contadores ###");
        for (int i = 0; i < contadores.length; i++) {

            if(contadores[i] != null) {

                System.out.println(contadores[i].getNomeCliente());
            }

        }
    }
}
