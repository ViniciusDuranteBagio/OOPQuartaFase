package trabalhofinal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        AgendaConsultas agendaConsult = new AgendaConsultas();
        int opcao = 0;

        do {
            String menuConsulta = "--- AGENDA DE CONSULTAS ---\n"
                    + "1 - Cadastro de Consulta\n"
                    + "2 - Listar Consultas\n"
                    + "3 - Sair do sistema\n"
                    + "Escolha uma opção (Cancelar para sair)";

            String opcaoStr = JOptionPane.showInputDialog(menuConsulta);

            if (opcaoStr == null) {
                JOptionPane.showMessageDialog(null, "Encerrando sistema.");
                break;
            }

            try {
                opcao = Integer.parseInt(opcaoStr);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro!\n Digite apenas números de 1 a 3");
                continue;
            }

            if (opcao < 1 || opcao > 3) {
                JOptionPane.showMessageDialog(null,
                        "Opção Inválida!\n Escolha apenas 1, 2 ou 3. \n(Cancelar para sair)");
            }

            // Ações que o menu deve fazer



            switch (opcao) {

                case 1:
                    try{
                        int tipoAnimal;

                        while (true){
                            String tipoAnimalStr = JOptionPane.showInputDialog("Digite o tipo de animal: \n 1- Cachorro\n 2- Gato\n 3- Coelho");
                        if (tipoAnimalStr == null) {
                            return;
                        }
                        try {
                            tipoAnimal = Integer.parseInt(tipoAnimalStr);
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Erro!\n" + "Digite apenas números 1, 2 ou 3");
                            continue;
                        }

                        if (tipoAnimal < 1 || tipoAnimal > 4) {
                            JOptionPane.showMessageDialog(null, "Opção Inválida!\n Escolha apenas 1, 2 ou 3");
                            continue;
                        }
                        break;
                        }

                        String nome;
                        while (true){
                            nome = JOptionPane.showInputDialog("Digite o nome do Animal: ");
                            if (nome == null) {
                                JOptionPane.showMessageDialog(null, "Nome deve ser inserido!");
                                continue;
                            }
                            nome = nome.trim();
                            break;
                        }


                        int idade;

                        while (true){
                           String idadeString = JOptionPane.showInputDialog("Idade do Animal: ");
                           if (idadeString == null || idadeString.trim().isEmpty()) {
                               JOptionPane.showMessageDialog(null, "Idade deve ser inserido!");
                               continue;
                           }

                           try{
                               idade = Integer.parseInt(idadeString);

                               if (idade < 0) {
                                   JOptionPane.showMessageDialog(null, " A idade não deve ser negativa");
                               }

                               break;
                           }catch (NumberFormatException e){
                               JOptionPane.showMessageDialog(null, "Erro!\n Insira apenas números para idade");
                           }
                        }

                        String raca;

                        while (true){
                            String racaString = JOptionPane.showInputDialog("Digite a raça do animal:");
                            if (racaString == null ) {
                                JOptionPane.showMessageDialog(null, "A raça deve ser informada");
                                continue;
                            }

                            // Validação
                            if (!racaString.matches("[a-zA-Z\\s]+")) {
                                JOptionPane.showMessageDialog(null, "Raça é inválida!\n Use apenas Letras");
                                continue;
                            }
                            raca = racaString.trim();
                            break;
                        }

                        Animal animal = null;

                        switch (tipoAnimal) {
                            case 1 -> animal = new Cachorro(nome, idade, raca);
                            case 2 -> animal = new Gato(nome, idade, raca);
                            case 3 -> animal = new Coelho(nome, idade, raca);
                            default -> JOptionPane.showMessageDialog(null, "Opção inválida");
                        }

                        int opcaoAtendimento;

                        while (true){
                            String tipoAtendimentoString = JOptionPane.showInputDialog("""
                                    Atendimentos da Clínica: 
                                    1. Banho
                                    2. Tosa
                                    3. Banho e Tosa
                                    4. Consulta
                                    """);
                            if (tipoAtendimentoString == null) {
                                return;
                            }

                            try{
                                opcaoAtendimento = Integer.parseInt(tipoAtendimentoString);

                            }catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "Erro!\n Insira apenas 1, 2, 3 ou 4");
                                continue;
                            }

                            if (opcaoAtendimento < 1 || opcaoAtendimento > 4) {
                                JOptionPane.showMessageDialog(null, "Opção Inválida!\n Escolha apenas 1, 2, 3 ou 4");
                                continue;
                            }
                            break;
                        }

                        String tipoAtendimento = switch (opcaoAtendimento) {
                            case 1 -> "Banho";
                            case 2 -> "Tosa";
                            case 3 -> "Banho e Tosa";
                            case 4 -> "Consulta";
                            default -> "Não Encontrado";
                        };

                        String doenca = null;

                        if (opcaoAtendimento == 4) {
                            while (true){
                                String animalDoente = JOptionPane.showInputDialog("Animal está doente?(s/n) ");
                                if (animalDoente == null) {
                                    JOptionPane.showMessageDialog(null, "Informação obrigatória. Informe 's' ou 'n'");
                                    continue;
                                }

                                animalDoente = animalDoente.trim();
                                if (animalDoente.equals("s")) {
                                    doenca = animal.doencasParaTratar();
                                    break;
                                }else if (animalDoente.equals("n")) {
                                    doenca = null;
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Digite 's' sim ou 'n' não");
                                }

                            }

                        }


                        Consulta consulta = new Consulta(animal, tipoAtendimento, doenca);
                        agendaConsult.adicionarConsulta(consulta);
                        JOptionPane.showMessageDialog(null, "Consulta realizada com sucesso!");


                    } catch (ValidacaoException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;


                case 2:
                    if (agendaConsult.listasDeConsultas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma consulta foi encontrada!");
                    } else {
                        StringBuilder consultas = new StringBuilder("-- CONSULTAS --\n\n");

                        for (Consulta c : agendaConsult.listasDeConsultas()) {
                            consultas.append(c).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, consultas.toString());
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "SAIR DO SISTEMA");
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }

        }while(opcao!=4);
    }
}
