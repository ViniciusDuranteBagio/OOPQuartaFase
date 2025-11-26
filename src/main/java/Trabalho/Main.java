package Trabalho;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ValidacaoException {

        int inputUsuario = -1;
        ArrayList<String> agenda = new ArrayList<>(10);
        int indiceAtual = -1;
        String tipoAnimal = "";
        String tipoAtendimento = "";
        String tipoDoenca = "";

        String menu = "Menu\n 0 - Sair \n 1 - Cadastrar Consulta " +
                "\n 2 - Visualizar Consultas";

        String menuAnimal = "Qual o Animal?\n 1 - Cachorro \n 2 - Gato " +
                "\n 3 - Coelho";

        String menuAtendimento = "Qual o Atendimento?\n 1 - Banho \n 2 - Tosa " +
                "\n 3 - Banho e Tosa \n 4- Consulta";

        while (inputUsuario != 0) {

            try {
                inputUsuario = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
                continue;
            }

            if (inputUsuario == 1) {

                try {
                    if (agenda.size() == 10) {
                        throw new ValidacaoException("Agenda cheia! Não é possível cadastrar mais consultas.");
                    }
                } catch (ValidacaoException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    continue;
                }

                Animal animalParaCadastrar = null;

                try {

                    int animal = Integer.parseInt(JOptionPane.showInputDialog(null,menuAnimal));

                    if (animal == 1) animalParaCadastrar = new Cachorro();
                    else if (animal == 2) animalParaCadastrar = new Gato();
                    else if (animal == 3) animalParaCadastrar = new Coelho();
                    else throw new ValidacaoException("Tipo de animal inválido!");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Animal inválido!");
                    continue;
                }

                try {

                    String nome = JOptionPane.showInputDialog(null, "Qual o nome do seu Animal?");
                    animalParaCadastrar.setNome(nome);

                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade do(a) " + nome + "?"));
                    animalParaCadastrar.setIdade(idade);

                    String raca = JOptionPane.showInputDialog(null, "Qual a raça do(a) " + nome + "?");
                    animalParaCadastrar.setRaca(raca);

                } catch (ValidacaoException ve) {
                    JOptionPane.showMessageDialog(null, ve.getMessage());
                    continue;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro nos dados do animal!");
                    continue;
                }

                try {

                    int atendimento = Integer.parseInt(JOptionPane.showInputDialog(null,menuAtendimento));

                    if (atendimento == 1) tipoAtendimento = "Banho";
                    else if (atendimento == 2) tipoAtendimento = "Tosa";
                    else if (atendimento == 3) tipoAtendimento = "Banho e Tosa";
                    else if (atendimento == 4) {

                        tipoAtendimento = "Consulta";

                        try {

                            int doenca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Doença: \n" + animalParaCadastrar.doencas()));
                            if ((doenca!= 1) & (doenca!= 2) & (doenca!= 3) & (doenca!= 4) & (doenca!= 5) & (doenca!= 6)){
                                throw new ValidacaoException("Doença inválida!");
                            }
                            tipoDoenca = animalParaCadastrar.retornaDoenca(doenca);

                        } catch (ValidacaoException ve) {
                            JOptionPane.showMessageDialog(null, ve.getMessage());
                            continue;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Erro ao selecionar doença.");
                            continue;
                        }
                    } else throw new ValidacaoException("Atendimento inválido!");

                } catch (ValidacaoException ve) {
                    JOptionPane.showMessageDialog(null, ve.getMessage());
                    continue;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao selecionar atendimento.");
                    continue;
                }

                Consulta consulta = new Consulta(animalParaCadastrar, tipoAtendimento, tipoDoenca);
                agenda.add(consulta.toString());

                if (indiceAtual == -1) {
                    indiceAtual = 0;
                }
            } else if (inputUsuario == 2) {
                if (agenda.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhuma cadastrada ainda!");
                } else {
                    String listaDados = "Consultas: \n";
                    for (String lista1 : agenda) {
                        listaDados = listaDados + lista1 + "\n";
                    }
                    listaDados = listaDados + "\n \n Aperte Entrer para voltar." + "\n";
                    JOptionPane.showMessageDialog(null, listaDados);
                }
            }
        }
    }
}