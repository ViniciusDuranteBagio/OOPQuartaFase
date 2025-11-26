import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AgendaVeterinario {

    private static final List<Consulta> agenda = new ArrayList<>();
    private static final int limiteConsultas = 10;

    public static void main(String[] args) {

        int opcao = 0;

        do {
            String menu = "--- Agenda Veterinária ---\n\n" +
                    "1. Listar Consultas\n" +
                    "2. Cadastrar Nova Consulta\n" +
                    "3. Sair\n\n" +
                    "Escolha uma opção:";

            String input = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);
            opcao = Integer.parseInt(input);

                switch (opcao) {
                    case 1:
                        if (agenda.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada ainda.", "Lista de Consultas", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            StringBuilder lista = new StringBuilder();
                            lista.append("--- Consultas Agendadas (").append(agenda.size()).append("/").append(limiteConsultas).append(") ---\n");

                            for (int i = 0; i < agenda.size(); i++) {
                                lista.append("-----------------------------\n");
                                lista.append("Consulta #").append(i + 1).append(":\n").append(agenda.get(i).toString()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, lista.toString(), "Consultas Agendadas", JOptionPane.PLAIN_MESSAGE);
                        }
                        break;

                    case 2:
                        if (agenda.size() >= limiteConsultas) {
                            JOptionPane.showMessageDialog(null,
                                    "*** ATENÇÃO: Agenda cheia! Não há mais horários disponíveis. ***",
                                    "Limite Atingido", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        Animal novoAnimal = null;
                        String tipoAtendimento = null;
                        String doenca = "";
                        String tipoAnimal = "";

                        try {
                            String[] tiposAnimaisOpcoes = {"Cachorro", "Gato", "Coelho"};
                            int opcaoAnimal = -1;

                            String menuAnimal = "Selecione o tipo de animal (Digite o número):\n\n" +
                                    "1. Cachorro\n" +
                                    "2. Gato\n";

                            String inputAnimal = JOptionPane.showInputDialog(null, menuAnimal, "Cadastro - Tipo", JOptionPane.QUESTION_MESSAGE);
                            if (inputAnimal == null) return;

                            opcaoAnimal = Integer.parseInt(inputAnimal);


                            if (opcaoAnimal >= 1 && opcaoAnimal <= tiposAnimaisOpcoes.length) {
                                tipoAnimal = tiposAnimaisOpcoes[opcaoAnimal - 1];
                            } else {
                                throw new ValidacaoException("Opção de animal inválida. Escolha um número de 1 a 3.");
                            }



                            String nome = JOptionPane.showInputDialog("Informe o nome do animal:");
                            String idadeStr = JOptionPane.showInputDialog("Informe a idade do animal:");
                            String raca = JOptionPane.showInputDialog("Informe a raça do animal:");

                            int idade = 0;
                            if (idadeStr != null) {
                                idade = Integer.parseInt(idadeStr);
                            } else {
                                return;
                            }

                            switch (tipoAnimal) {
                                case "Cachorro": novoAnimal = new Cachorro(nome, idade, raca); break;
                            }

                            String[] tiposAtendimentoOpcoes = {"Consulta", "Banho", "Tosa", "Banho e Tosa"};
                            int opcaoAtendimento = -1;

                            String menuAtendimento = "Selecione o tipo de atendimento (Digite o número):\n\n" +
                                    "1. Consulta\n" +
                                    "2. Banho\n" +
                                    "3. Tosa\n" +
                                    "4. Banho e Tosa";

                            String inputAtendimento = JOptionPane.showInputDialog(null, menuAtendimento, "Cadastro - Atendimento", JOptionPane.QUESTION_MESSAGE);
                            if (inputAtendimento == null) return;

                            opcaoAtendimento = Integer.parseInt(inputAtendimento);

                            if (opcaoAtendimento >= 1 && opcaoAtendimento <= tiposAtendimentoOpcoes.length) {
                                tipoAtendimento = tiposAtendimentoOpcoes[opcaoAtendimento - 1];
                            } else {
                                throw new ValidacaoException("Opção de atendimento inválida. Escolha um número de 1 a 4.");
                            }



                            if ("Consulta".equals(tipoAtendimento)) {
                                int isDoente = JOptionPane.showConfirmDialog(null, "O animal está doente (s/n)?", "Doença", JOptionPane.YES_NO_OPTION);

                                if (isDoente == JOptionPane.YES_OPTION) {
                                    String[] doencasPossiveis = novoAnimal.getDoencasPossiveis();

                                    String doencaEscolhida = (String) JOptionPane.showInputDialog(null,
                                            "Informe qual é a doença (Selecione):", "Doença",
                                            JOptionPane.QUESTION_MESSAGE, null, doencasPossiveis, doencasPossiveis[0]);

                                    if (doencaEscolhida != null) {
                                        doenca = doencaEscolhida;
                                    }
                                }
                            }

                            Consulta novaConsulta = new Consulta(novoAnimal, tipoAtendimento, doenca);
                            agenda.add(novaConsulta);

                            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso para " + novoAnimal.getNome() + "!");

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, " Erro: A idade informada não é um número válido.");
                        } catch (ValidacaoException e) { // Tratamento de Exceções
                            JOptionPane.showMessageDialog(null, "Erro de Validação: " + e.getMessage());
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage());
                        }
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Encerrando sistema...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Escolha 1, 2 ou 3.");
                }
            } while (opcao != 3);
        }
    }




