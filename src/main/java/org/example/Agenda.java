package org.example;

public class Agenda {

    private Consulta[] consultas = new Consulta[10];
    private int totalConsultas = 0;

    public void adicionarConsulta(Consulta consulta) throws ValidacaoException {
        if (totalConsultas >= 10) {
            throw new ValidacaoException("Agenda cheia: não há mais horários disponíveis.");
        }
        consultas[totalConsultas] = consulta;
        totalConsultas++;
    }

    public boolean possuiConsultas() {
        return totalConsultas > 0;
    }

    public Consulta[] getConsultas() {
        return consultas;
    }

    public int getTotalConsultas() {
        return totalConsultas;
    }
}
