package org.example;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Agenda agendar = new Agenda();
        boolean rodar = true;

        while (rodar){
            String opcao = JOptionPane.showInputDialog("AGENDA DE VETERINÁRIO\n"+
                                                     "1- Cadastrar nova consulta\n"+
                                                     "2- Listar consultas\n"+
                                                     "3- Sair\n\n"+
                                                      "Escolha uma opção: ");
            if (opcao == null)
                break;

            switch (opcao){
                case "1":
                cadastrarConsulta(agendar);
                break;

                case "2":
                listarConsulta(agendar);

                case "3":
                rodar = false;
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
     private static void cadastrarConsulta(Agenda agenda){
        if (agenda.getConsultas().size()>=10){
            JOptionPane.showMessageDialog(null,"Impossível cadastrar mais consultas, a agenda está cheia.");
            return;
        }

         String[] animais = {"Cachorro", "Gato","Coelho"};
        String escolhaAnimal = (String) JOptionPane.showInputDialog(null, "Selecione o animal:",
                                                                "Animal", JOptionPane.QUESTION_MESSAGE, null,
                                                                     animais, animais[0]);
        if (escolhaAnimal == null)
            return;

        String nome = JOptionPane.showInputDialog("Qual o nome do animal:");
        if (!Validacao.validarNome(nome)){
            JOptionPane.showMessageDialog(null, "Nome inválido.");
            return;
        }

        String idadeAnimal = JOptionPane.showInputDialog("Qual a idade do animal:");
        int idade = 0;

        try {
            idade = Integer.parseInt(idadeAnimal);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Idade inválida!");
        }

        String raca = JOptionPane.showInputDialog("Qual a raça do animal");
        if (!Validacao.validarRaca(raca)){
            JOptionPane.showMessageDialog(null, "Raça inválida.");
            return;
        }

        Animal animal = null;
         if (escolhaAnimal.equals("Cachorro")) animal = new Cachorro(nome, idade, raca);
         if (escolhaAnimal.equals("Gato")) animal = new Gato(nome, idade, raca);
         if (escolhaAnimal.equals("Coelho")) animal = new Coelho(nome, idade, raca);

         String[] atendimeto = {"Banho", "Tosa", "Banho e Tosa", "Consulta"};
         String tipoAtender = (String) JOptionPane.showInputDialog(null,"Tipo de atendimento",
                                                                   "Atendimento", JOptionPane.QUESTION_MESSAGE,
                                                                 null, atendimeto, atendimeto[0]);

         if (tipoAtender == null)
             return;

         String doenca = null;
         if (tipoAtender.equals("Consulta")){
             String[] doentes = animal.getDoenca();
             doenca = (String) JOptionPane.showInputDialog(null, "Selecione a doença:", "Doença",JOptionPane.QUESTION_MESSAGE,
                                                             null, doentes, doentes[0]);
             if (doenca == null)
                 return;
         }

         Consulta consulta = new Consulta(animal,tipoAtender,doenca);

         if (agenda.addConsulta(consulta)){
             JOptionPane.showMessageDialog(null,"Consulta cadastrada.");
         }else {
             JOptionPane.showMessageDialog(null, "A agenda está cheia.");
         }

     }
     private static void listarConsulta(Agenda agenda){
        if (agenda.vazio()){
            JOptionPane.showMessageDialog(null,"Lista de consultas vazia. Nenhuma consultaa cadastrada ainda");
            return;
        }
        StringBuilder string = new StringBuilder();
        string.append("CONSULTAS CADASTRADAS\n\n");

        for (Consulta c : agenda.getConsultas()){
            string.append(c.toString());
            string.append("\n-----------//----------\n");
        }
        JOptionPane.showMessageDialog(null, string.toString());

     }

}
