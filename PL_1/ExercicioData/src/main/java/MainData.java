public class MainData {
    public static void main(String[] args) {

        //a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje
        Data data1 = new Data(2023, 3, 2);

        //b) Mostre data1 usando o formato por extenso
        data1.toAnoMesDiaString();

        //c) Crie outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974
        Data data2 = new Data(1974, 4, 25);

        //d) Mostre data2 no formato "ano/mês/dia"
        System.out.println(data2);

        //e) Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que data2
        if(data1.isMaior(data2)) {
            System.out.println("data1 > data2");
        } else {
            System.out.println("data2 > data1");
        }

        //f) Determine o número de dias entre data1 e data2
        System.out.println(data1.calcularDiferenca(data2));

        //g) Determine o número de dias que faltam para o Natal, usando o método que recebe, por parâmetro, o dia, o mês e o ano de uma data
        System.out.println(data1.calcularDiferenca(2023,12,25));

        //h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.
        System.out.println(data2.determinarDiaDaSemana());

        //i) Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:
        //▪ Através do objeto data2;
        //▪ Através da classe Data
        System.out.println(Data.isAnoBissexto(data2.getAno()));
        System.out.println(data2.isAnoBissexto(data2.getAno()));
    }
}
