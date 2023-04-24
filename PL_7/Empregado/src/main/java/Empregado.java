import java.util.Objects;

public class Empregado {

    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    private final int NUMERO_DIAS_TRABALHO = 5;

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public Data getDataContrato() {
        return new Data(dataContrato);
    }

    public Tempo getHoraEntrada() {
        return  new Tempo(horaEntrada);
    }

    public Tempo getHoraSaida() {
        return new Tempo(horaSaida);
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = new Data(dataContrato);
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = new Tempo(horaEntrada);
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = new Tempo(horaSaida);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empregado{");
        sb.append("primeiroNome='").append(primeiroNome).append('\'');
        sb.append(", ultimoNome='").append(ultimoNome).append('\'');
        sb.append(", dataContrato=").append(dataContrato);
        sb.append(", horaEntrada=").append(horaEntrada);
        sb.append(", horaSaida=").append(horaSaida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return Objects.equals(primeiroNome, empregado.primeiroNome) && Objects.equals(ultimoNome, empregado.ultimoNome) && Objects.equals(dataContrato, empregado.dataContrato) && Objects.equals(horaEntrada, empregado.horaEntrada) && Objects.equals(horaSaida, empregado.horaSaida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primeiroNome, ultimoNome, dataContrato, horaEntrada, horaSaida);
    }

    /*public double calcularHorasTrabalhoSemanais() {

        return (this.horaSaida - this.horaEntrada) * NUMERO_DIAS_TRABALHO;
    }*/

    public void determinarTempoDeContrato() {


    }

    public int horasDiarias() {
        return (horaSaida.diferencaEmSegundos(horaEntrada)) / 3600;
    }


}
