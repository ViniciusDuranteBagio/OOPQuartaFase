package TrabalhoFinal;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Consulta> consultas = new ArrayList<>();

        while (true) {
            String opcao = JOptionPane.showInputDialog("1 - Cadastrar Consulta\n2 - Listar Consultas\n3 - Sair");
            if (opcao == null) break;

            switch (opcao) {
                case "1":
                    if (consultas.size() >= 10) {
                        JOptionPane.showMessageDialog(null, "Agenda cheia!");
                        break;
                    }
                    String tipoAnimal = JOptionPane.showInputDialog("Tipo de animal: Cachorro, Gato ou Coelho");
                    String nome = JOptionPane.showInputDialog("Nome do animal:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do animal:"));
                    String raca = JOptionPane.showInputDialog("Raça do animal:");

                    Animal animal;
                    switch (tipoAnimal.toLowerCase()) {
                        case "cachorro":
                            animal = new Cachorro(nome, idade, raca);
                            break;
                        case "gato":
                            animal = new Gato(nome, idade, raca);
                            break;
                        case "coelho":
                            animal = new Coelho(nome, idade, raca);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Tipo de animal inválido!");
                            continue;
                    }

                    String tipoAtendimento = JOptionPane.showInputDialog("Tipo de atendimento: Banho, Tosa, Banho e Tosa, Consulta");
                    String doenca = null;
                    if (tipoAtendimento.equalsIgnoreCase("Consulta")) {
                        String doencaInput = JOptionPane.showInputDialog("O animal está doente? (s/n)");
                        if (doencaInput.equalsIgnoreCase("s")) {
                            doenca = JOptionPane.showInputDialog("Qual é a doença?");
                        }
                    }

                    consultas.add(new Consulta(animal, tipoAtendimento, doenca));
                    JOptionPane.showMessageDialog(null, "Consulta cadastrada!");
                    break;

                case "2":
                    if (consultas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada ainda.");
                    } else {
                        StringBuilder lista = new StringBuilder();
                        for (Consulta consulta : consultas) {
                            lista.append("Animal: ").append(consulta.getAnimal().getNome()).append("\n");
                            lista.append("Tipo de Atendimento: ").append(consulta.getTipoAtendimento()).append("\n");
                            if (consulta.getDoenca() != null) {
                                lista.append("Doença: ").append(consulta.getDoenca()).append("\n");
                            }
                            lista.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}