package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Consulta> consultas;

    public Agenda(){
        consultas = new ArrayList<>();
    }
    public boolean addConsulta (Consulta consulta){
        if (consultas.size() >=10){
            return false;
        }
        consultas.add(consulta);
        return true;
    }

    public boolean vazio(){
        return consultas.isEmpty();
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}
