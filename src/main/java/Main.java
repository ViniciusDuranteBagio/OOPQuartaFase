import javax.swing.JOptionPane;


public class Main {
  public static void main(String[] args){
    Agenda agenda = new Agenda();

    while(true){
      String menu = "MENU\n"
              + "1 - Listar consultas\n"
              + "2 - Cadastrar consulta\n"
              + "3 - Sair\n";

      String op = JOptionPane.showInputDialog(menu);
      if(op == null) System.exit(0);

      switch(op){
        case "1":
          if(agenda.tamanho()==0) JOptionPane.showMessageDialog(null,"Nenhuma cadastrada ainda");
          else{
            StringBuilder sb = new StringBuilder();
            int i=1;
            for (Consulta c : agenda.listarConsultas()) {
              sb.append(i++).append(") ").append(c.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
          }
          break;

        case "2":
          String tipoAnimal = JOptionPane.showInputDialog("Tipo de animal: Cachorro / Gato / Coelho");
          if(tipoAnimal == null) break;

          try{
            String nome = JOptionPane.showInputDialog("Nome do animal");
            String idadeS = JOptionPane.showInputDialog("Idade");
            String raca = JOptionPane.showInputDialog("Raça");

            int idade = Integer.parseInt(idadeS);

            Animal animal;
            if(tipoAnimal.equalsIgnoreCase("Cachorro")) animal = new Cachorro(nome,idade,raca);
            else if(tipoAnimal.equalsIgnoreCase("Gato")) animal = new Gato(nome,idade,raca);
            else if(tipoAnimal.equalsIgnoreCase("Coelho")) animal = new Coelho(nome,idade,raca);
            else throw new ValidacaoException("Tipo inválido");

            String atendimento = JOptionPane.showInputDialog("Atendimento: Banho / Tosa / Banho e Tosa / Consulta");
            String doenca = "";
            if(atendimento.toLowerCase().equals("consulta")){
              int resp = JOptionPane.showConfirmDialog(null,"O animal está doente?");
              if(resp == JOptionPane.YES_OPTION){
                String[] poss = animal.getDoencasPossiveis();
                String escolha = (String) JOptionPane.showInputDialog(null,"Escolha a doença","Doenças",
                        JOptionPane.PLAIN_MESSAGE,null,poss,poss[0]);
                if(escolha == null) throw new ValidacaoException("Doença não selecionada");
                doenca = escolha;
              }
            }

            Consulta c = new Consulta(animal,atendimento,doenca);
            agenda.adicionarConsulta(c);
            JOptionPane.showMessageDialog(null,"Consulta cadastrada");

          } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage());
          }
          break;

        case "3":
          System.exit(0);
          break;

        default:
          JOptionPane.showMessageDialog(null,"Opção inválida");
      }
    }
  }
}