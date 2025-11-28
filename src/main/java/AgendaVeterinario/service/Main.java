package AgendaVeterinario.service;

import AgendaVeterinario.exception.*;
import AgendaVeterinario.model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        int menu = 0;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            String op = JOptionPane.showInputDialog("""
                    Seja Bem-vindo ao JotaPet!
                    
                    1 - Cadastrar consulta
                    2 - Listar consultas
                    3 - Sair
                    
                    (Cancel para sair)
                    """);

            if (op == null) break;
            if (!op.matches("\\d+")) continue;

            menu = Integer.parseInt(op);
            //peguei essa logica de de ter voltar e cancel com o chat para deixar o código melhor


            switch (menu) {
                case 1:
                    try {
                        Animal animal = null;

                        while (animal == null) {
                                String TxtTipoAnimal = JOptionPane.showInputDialog(
                                        """
                                                Escolha um tipo de acordo com o seu pet:\
        
                                                1- Cachorro\
        
                                                2- Gato\
        
                                                3- Coelho
                                                
                                                0- Voltar
                                                
                                                (Cancel para sair)
                                                """);

                                if (TxtTipoAnimal == null || TxtTipoAnimal.equals("0"))
                                    break;
                                if (!TxtTipoAnimal.matches("\\d+"))
                                    continue;

                                int tipoAnimal = Integer.parseInt(TxtTipoAnimal);

                                if (tipoAnimal < 1 || tipoAnimal > 3) {
                                    JOptionPane.showMessageDialog(null, "Tipo inválido!");
                                    continue;
                                }

                                String nome = JOptionPane.showInputDialog("Nome do animal (ou Cancel para voltar):");
                                if (nome == null) continue;

                                String idadeTxt = JOptionPane.showInputDialog("Idade (ou Cancel para voltar):");
                                if (idadeTxt == null) continue;
                                if (!idadeTxt.matches("\\d+")) {
                                    JOptionPane.showMessageDialog(null, "Digite apenas números!");
                                    continue;
                                }
                                int idade = Integer.parseInt(idadeTxt);

                                String raca = JOptionPane.showInputDialog("Raça do animal (ou Cancel para voltar):");
                                if (raca == null) continue;

                                try{

                                switch (tipoAnimal) {
                                    case 1:
                                        animal = new Cachorro(nome, idade, raca);
                                        break;
                                    case 2:
                                        animal = new Gato(nome, idade, raca);
                                        break;
                                    case 3:
                                        animal = new Coelho(nome, idade, raca);
                                        break;
                                    default:
                                        throw new RuntimeException("Tipo de animal inválido!");
                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                                animal = null;
                            }
                        }

                        if (animal == null) break;

                        //tp atendimento

                        String atendimento = null;
                        while (atendimento == null){
                            try{
                                String TxtAtendimento = JOptionPane.showInputDialog("""
                                    Tipo de atendimento:
                                    
                                    1 - Banho
                                    2 - Tosa
                                    3 - Banho e Tosa
                                    4 - Consulta
                                    
                                    0 - Voltar
                                    (Cancel para voltar)
                                    """);

                                if (TxtAtendimento == null || TxtAtendimento.equals("0"))
                                    break;
                                if (!TxtAtendimento.matches("\\d+"))
                                    continue;

                                int tipoAtendimento = Integer.parseInt(TxtAtendimento);
                                switch (tipoAtendimento) {
                                    case 1:
                                        atendimento = "Banho";
                                        break;
                                    case 2:
                                        atendimento = "Tosa";
                                        break;
                                    case 3:
                                        atendimento = "Banho e Tosa";
                                        break;
                                    case 4:
                                        atendimento = "Consulta";
                                        break;
                                    default:
                                        throw new AtendimentoInvalidoException("Atendimento inválido!");
                                }
                            } catch (Exception e){
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        }

                        if (atendimento == null) break;

                        //Data

                        LocalDate data = null;

                        while (data == null) {
                                String txt = JOptionPane.showInputDialog("Data (dd/mm/aaaa) — ou Cancel para voltar:");
                                if (txt == null) break;
                            try{
                                data = LocalDate.parse(txt, formato);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Data inválida!");
                            }
                        }

                        if (data == null) break;

                        //Doença animal

                        String doenca = null;
                        if (atendimento.equals("Consulta")) {
                            doenca = JOptionPane.showInputDialog("Informe a doença (ou Cancel para voltar):" + animal.getDoencas());
                        }
                        Consulta consulta = new Consulta(animal, atendimento, doenca, data);
                        agenda.adicionarConsulta(consulta);
                        JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                    }

                    break;

                case 2:
                    if (agenda.getAgendaVeterinario().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada");
                    } else {

                        String texto = "";

                        for (Consulta c : agenda.getAgendaVeterinario()) {
                            texto += "Animal: " + c.getAnimal().getNome() +
                                    "\nTipo de atendimento: " + c.getTipoAtendimento();

                            if (c.getDoenca() != null) {
                                texto += "\nDoença: " + c.getDoenca();
                            }

                            texto += "\nData: " + c.getData();
                        }

                        JOptionPane.showMessageDialog(null, texto);
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");

            }
        } while (menu != 3);
    }
}
    


