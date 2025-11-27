package Trabalho;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Consulta[] consultas = new Consulta[10];
        int qtdConsultas = 0;
        boolean continuar = true;

        while (continuar) {

            if (qtdConsultas >= 10) {
                JOptionPane.showMessageDialog(null, "Limite de 10 consultas atingido");
            }

            try {
                int escolha = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "O que deseja fazer?\n" +
                                        "1. Listar Consultas\n" +
                                        "2. Cadastrar Consulta\n" +
                                        "3. Encerrar"));

                switch (escolha) {

                    case 1:
                        if (qtdConsultas == 0) {
                            JOptionPane.showMessageDialog(null, "Nenhuma cadastrada ainda");
                            break;
                        }

                        StringBuilder lista = new StringBuilder();

                        for (int i = 0; i < qtdConsultas; i++) {
                            Consulta c = consultas[i];
                            lista.append("Nome: ").append(c.getAnimal().getNome())
                                    .append(" | Raça: ").append(c.getAnimal().getRaca())
                                    .append(" | Idade: ").append(c.getAnimal().getIdade())
                                    .append(" | Tipo de consulta: ").append(c.getTipoConsulta())
                                    .append(" | Doença: ").append(c.getDoenca())
                                    .append("\n");
                        }

                        JOptionPane.showMessageDialog(null, lista.toString());
                        break;

                    case 2:
                        if (qtdConsultas >= 10) {
                            JOptionPane.showMessageDialog(null, "Limite de consultas atingido");
                            break;
                        }

                        Consulta nova = new Consulta();
                        nova.cadastrarConsulta();
                        consultas[qtdConsultas] = nova;
                        qtdConsultas++;
                        break;

                    case 3:
                        continuar = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        break;
                }

            } catch (ValidacaoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            }
        }
    }
}