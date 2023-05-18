package com.example.exerciciodatasgui.domain;

import java.util.Calendar;

public class Data implements Comparable<Data> {

    private int ano;

    private Mes mes;

    private int dia;

    private static final int ANO_POR_OMISSAO = 1;

    private static final Mes MES_POR_OMISSAO = Mes.JANEIRO;

    private static final int DIA_POR_OMISSAO = 1;


    public Data(int ano, int mes, int dia) {
        setData(ano, mes, dia);
    }

    public Data() {
        ano = ANO_POR_OMISSAO;
        mes = MES_POR_OMISSAO;
        dia = DIA_POR_OMISSAO;
    }

    public Data(Data outraData) {
        ano = outraData.ano;
        mes = outraData.mes;
        dia = outraData.dia;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes.ordinal() + 1;
    }

    public int getDia() {
        return dia;
    }

    public final void setData(int ano, int mes, int dia) {

        if (mes < 1 || mes > 12) {
            throw new MesInvalidoException("Mês " + mes + " é inválido!!");
        }

        if (dia < 1 || dia > Mes.obterMes(mes).numeroDeDias(ano)) {
            throw new DiaInvalidoException("Dia " + ano + "/" + mes + "/" + dia
                    + " é inválido!!");
        }

        this.ano = ano;
        this.mes = Mes.obterMes(mes);
        this.dia = dia;
    }

    @Override
    public String toString() {
        return String.format("%s, %d de %s de %d", diaDaSemana(), dia, mes, ano);
    }

    public String toAnoMesDiaString() {
        return String.format("%04d/%02d/%02d", ano, mes.ordinal() + 1, dia);
    }

    @Override
    public boolean equals(Object outroObjeto) {

        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }

        Data outraData = (Data) outroObjeto;
        return ano == outraData.ano && mes.equals(outraData.mes)
                && dia == outraData.dia;
    }

    @Override
    public int compareTo(Data outraData) {
        return (outraData.isMaior(this)) ? -1 : (isMaior(outraData)) ? 1 : 0;
    }

    public String diaDaSemana() {
        int totalDias = contaDias();
        totalDias = totalDias % 7;

        return DiaDaSemana.designacaoDiaDaSemana(totalDias);
    }


    public boolean isMaior(Data outraData) {
        int totalDias = contaDias();
        int totalDias1 = outraData.contaDias();

        return totalDias > totalDias1;
    }

    public int diferenca(Data outraData) {
        int totalDias = contaDias();
        int totalDias1 = outraData.contaDias();

        return Math.abs(totalDias - totalDias1);
    }

    public int diferenca(int ano, int mes, int dia) {
        int totalDias = contaDias();
        Data outraData = new Data(ano, mes, dia);
        int totalDias1 = outraData.contaDias();

        return Math.abs(totalDias - totalDias1);
    }

    public static boolean isAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    public static Data dataAtual() {
        Calendar hoje = Calendar.getInstance();
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH) + 1;    // janeiro é representado por 0.
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        return new Data(ano, mes, dia);
    }

    private int contaDias() {

        int totalDias = 0;

        for (int i = 1; i < ano; i++) {
            totalDias += isAnoBissexto(i) ? 366 : 365;
        }

        for (int i = 1; i < mes.ordinal() + 1; i++) {
            totalDias += Mes.obterMes(i).numeroDeDias(ano);
        }

        totalDias += dia;

        return totalDias;
    }
}
