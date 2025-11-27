package Aula1.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Consulta> consultas = new ArrayList<>();
    private static final int limite = 10;

    public void adicionarConsulta(Consulta consulta) throws  ValidacaoException{
        if(consultas.size() > limite){
            throw new ValidacaoException("Limite ce consultas atingido!");
        }
        consultas.add(consulta);
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
}
