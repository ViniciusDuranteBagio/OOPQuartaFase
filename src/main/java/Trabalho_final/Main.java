package Trabalho_final;

import javax.swing.JOptionPane;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        while (true) {

            String menu =
                    "AGENDA VETERINÁRIA\n\n" +
                            "1 - Listar Consultas\n" +
                            "2 - Cadastrar Consulta\n" +
                            "3 - Sair\n\n" +
                            "Digite a opção:";

            String opStr = JOptionPane.showInputDialog(menu);
            if (opStr == null) break;

            int opcao = Integer.parseInt(opStr);


            if (opcao == 1) {
                List<Consulta> consultas = agenda.listarConsultas();

                if (consultas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada.");
                } else {
                    StringBuilder sb = new StringBuilder();

                    for (int i = 0; i < consultas.size(); i++) {
                        sb.append("Consulta ").append(i + 1).append(":\n")
                                .append(consultas.get(i)).append("\n\n");
                    }

                    JOptionPane.showMessageDialog(null, sb.toString());
                }
            }


            else if (opcao == 2) {
                try {

                    String tipoAnimalStr = JOptionPane.showInputDialog(
                            "Escolha o animal:\n" +
                                    "1 - Cachorro\n" +
                                    "2 - Gato\n" +
                                    "3 - Coelho");
                    if (tipoAnimalStr == null) continue;

                    int tipoAnimal = Integer.parseInt(tipoAnimalStr);

                    String nome = JOptionPane.showInputDialog("Nome do animal:");
                    String idadeStr = JOptionPane.showInputDialog("Idade do animal:");
                    String raca = JOptionPane.showInputDialog("Raça do animal:");

                    int idade = Integer.parseInt(idadeStr);

                    Animal animal;

                    if (tipoAnimal == 1) {
                        animal = new Cachorro(nome, idade, raca);
                    } else if (tipoAnimal == 2) {
                        animal = new Gato(nome, idade, raca);
                    } else {
                        animal = new Coelho(nome, idade, raca);
                    }

                    String tipoServicoStr = JOptionPane.showInputDialog(
                            "Tipo de serviço:\n" +
                                    "1 - CONSULTA\n" +
                                    "2 - BANHO\n" +
                                    "3 - TOSA\n" +
                                    "4 - BANHO E TOSA");
                    if (tipoServicoStr == null) continue;

                    int tipoServ = Integer.parseInt(tipoServicoStr);

                    TipoServico tipoServico;

                    if (tipoServ == 1) {
                        tipoServico = TipoServico.CONSULTA;
                    }
                    else if (tipoServ == 2) {
                        tipoServico = TipoServico.BANHO;
                    }
                    else if (tipoServ == 3) {
                        tipoServico = TipoServico.TOSA;
                    }
                    else {
                        tipoServico = TipoServico.BANHO_E_TOSA;
                    }

                    boolean doente = false;
                    String doenca = null;

                    if (tipoServico == TipoServico.CONSULTA) {
                        String resp = JOptionPane.showInputDialog(
                                "O animal está doente?\n1 - Sim\n2 - Não");

                        if (resp != null && resp.equals("1")) {
                            doente = true;

                            String[] doencas = animal.getDoencas();
                            StringBuilder lista = new StringBuilder("Escolha a doença:\n");

                            for (int i = 0; i < doencas.length; i++) {
                                lista.append(i + 1)
                                        .append(" - ")
                                        .append(doencas[i])
                                        .append("\n");
                            }

                            String escolhaDoencaStr = JOptionPane.showInputDialog(lista.toString());
                            int escolhaDoenca = Integer.parseInt(escolhaDoencaStr);

                            doenca = doencas[escolhaDoenca - 1];
                        }
                    }

                    Consulta consulta = new Consulta(animal, tipoServico, doente, doenca);
                    agenda.adicionarConsulta(consulta);

                    JOptionPane.showMessageDialog(null, " Consulta cadastrada com sucesso!");

                } catch (ValidacaoException e) {
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Dados inválidos!");
                }
            }


            else if (opcao == 3) {
                break;
            }

            else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
