package entities;

import javax.swing.*;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public boolean agendarConsulta(Consulta consulta) {
        if (consultas.size() < 10) {
            consultas.add(consulta);
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Agenda cheia! Não é possível agendar mais consultas");
            return false;
        }
    }

    public void listarConsultas() {
        String mensagem = "";
        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nenhuma consulta cadastrada");
        } else {
            for (Consulta consulta : consultas) {
                mensagem += "Animal: " + consulta.getAnimal().getClass().getSimpleName() + "\nNome: " + consulta.getAnimal().getNome() + "\nTipo: " + consulta.getTipoAtendimento() + "\nDoença: " + consulta.getDoenca() + "\n\n";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}