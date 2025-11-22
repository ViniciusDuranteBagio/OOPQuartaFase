import Consulta.Consulta;
import Consulta.Veterinario;
import Consulta.Funcionario;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Executa a interface gráfica na thread de eventos do Swing
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(null, "Seja bem-vindo à Clínica Veterinária!");

            // Cria o veterinário responsável
            Veterinario vet;
            try {
                vet = new Veterinario("Carlos", 25);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao criar veterinário: " + e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Cria o funcionário responsável por Banho/Tosa
            Funcionario func;
            try {
                func = new Funcionario("Maria");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao criar funcionário: " + e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Cria e inicia a consulta com veterinário e funcionário
            Consulta consulta = new Consulta(vet, func);
            consulta.iniciar();
        });
    }
}
