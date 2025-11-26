package TrabalhoFinal;

import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        while (true) {

            String opcao = JOptionPane.showInputDialog(
                    "Agenda Veterinária\n\n"
                            + "1 - Listar consultas\n"
                            + "2 - Cadastrar consulta\n"
                            + "3 - Sair");

            if (opcao == null || opcao.equals("3")) {
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            }

            switch (opcao) {

                case "1":
                    if (agenda.getConsultas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma cadastrada ainda.");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (Consulta c : agenda.getConsultas()) {
                            sb.append(c).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                case "2":

                    if (agenda.cheia()) {
                        JOptionPane.showMessageDialog(null, "Agenda cheia (máx 10 consultas).");
                        break;
                    }


                    String tipoAnimal = JOptionPane.showInputDialog(
                            "Tipo de animal:\nCachorro\nGato\nCoelho");

                    if (tipoAnimal == null) break;

                    tipoAnimal = tipoAnimal.trim().toLowerCase();


                    String nome = JOptionPane.showInputDialog("Nome do animal:");
                    String idadeStr = JOptionPane.showInputDialog("Idade do animal:");
                    String raca = JOptionPane.showInputDialog("Raça do animal:");

                    int idade;
                    try {
                        idade = Integer.parseInt(idadeStr);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Idade inválida.");
                        continue;
                    }

                    Animal animal;
                    try {
                        switch (tipoAnimal) {
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
                                JOptionPane.showMessageDialog(null, "Tipo inválido.");
                                continue;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                        continue;
                    }


                    String tipo = JOptionPane.showInputDialog(
                            "Tipo da consulta:\n1 - Banho\n2 - Banho e Tosa\n3 - Tosa\n4 - Consulta");

                    String escolha;
                    switch (tipo) {
                        case "1": escolha = "Banho"; break;
                        case "2": escolha = "Banho e Tosa"; break;
                        case "3": escolha = "Tosa"; break;
                        case "4": escolha = "Consulta"; break;
                        default:
                            JOptionPane.showMessageDialog(null, "Tipo inválido.");
                            continue;
                    }

                    String doenca = null;

                    if ("Consulta".equals(escolha)) {
                        String doente = JOptionPane.showInputDialog("O animal está doente? (s/n)");
                        if (doente != null && doente.equalsIgnoreCase("s")) {
                            List<String> doencas = animal.getDoencacomuns();


                            StringBuilder sb = new StringBuilder("Escolha a doença:\n");
                            for (int i = 0; i < doencas.size(); i++) {
                                sb.append((i + 1)).append(" - ").append(doencas.get(i)).append("\n");
                            }

                            String opc = JOptionPane.showInputDialog(sb.toString());

                            try {
                                int index = Integer.parseInt(opc) - 1;
                                doenca = doencas.get(index);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                                continue;
                            }
                        }
                    }

                    Consulta c = new Consulta(animal, escolha, doenca);
                    agenda.adicionarConsulta(c);

                    JOptionPane.showMessageDialog(null, "Consulta cadastrada!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
