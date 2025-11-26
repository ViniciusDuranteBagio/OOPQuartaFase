import javax.swing.*;

public class Main {
  public static Consulta[]agenda= new Consulta[10];
  public  static int ttConsultas=0;

  public static void main(String[] args) {
    boolean agendando= true;

    while(agendando){
      String opção= JOptionPane.showInputDialog("Menu principal:\n"+
              "1- Listar Atendimentos\n"+"2-Cadastrar Atendimentos\n"+"3 -Sair");
    if (opção==null){
      break;
    }
    switch (opção){
      case"1":
        ListarAtendimentos();
        break;
      case "2":
        CadastrarAtendimentos();

        break;
      case "3":
        agendando=false;
        break;
      default:
        JOptionPane.showMessageDialog(null,
                "Opção selcionada inválida!");
      }
    }
  }
  private static void ListarAtendimentos(){
   if(ttConsultas==0){
     JOptionPane.showMessageDialog(null,"Sem nenhum atendimento " +
             "cadastrado até o momento");
     return;
   }
   String listaatendimentos="Atendimentos agendados:\n";
   for(int i=0;i<ttConsultas;i++){
     listaatendimentos+=(i+1)+(" - ")+agenda[i].toString()+("\n");
   }
   JOptionPane.showMessageDialog(null,listaatendimentos);

  }
  private static void CadastrarAtendimentos(){
    if(ttConsultas==agenda.length){
      JOptionPane.showMessageDialog
              (null,"A agenda de hoje está lotada, você pode visualizalá!");
      return;}
    String[] tpBichinho={"Cachorro","Gato","Coelhinho"};
    String tipoAnimal = (String) JOptionPane.showInputDialog(
            null,
            "Selecione o tipo do animal:",
            "Tipo de Animal",
            JOptionPane.QUESTION_MESSAGE,
            null,
            tpBichinho,
            tpBichinho[0]);
        if(tipoAnimal==null){
          return;
        }
        String nome=JOptionPane.showInputDialog("Qual o nome do animal?");
    try {
      Validar.validarNome(nome);
    } catch (ValidacaoException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
      return;
    }
    double idade;
    try {
      idade=Double.parseDouble(JOptionPane.showInputDialog("Ensira a idade do animal:(anos.meses)"));
      Validar.validarIdade(idade);
    } catch (ValidacaoException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
      return;
    }

    String raça=JOptionPane.showInputDialog("Qual a raça do animal?");
    try{
      Validar.validarraça(raça);
    }catch (ValidacaoException e){
      JOptionPane.showMessageDialog(null,e.getMessage());
      return;
    }

    Animal animal = null;
    if(tipoAnimal.equals("Cachorro")){
      animal=new Cachorro(nome,idade,raça);

    }else if(tipoAnimal.equals("Gato")){
      animal= new Gato(nome,idade,raça);

    }else if(tipoAnimal.equals("Coelhinho")){
      animal= new Coelhinho(nome, idade,raça);
    }
    //DEFININDO E SELECIONANDO OS ATENDIEMNTOS
    String[]tipodeAtendimentos= {"Banho", "Banho e Tosa","Tosa","Consulta"};
    String SeleçãodoAtendimento=(String)JOptionPane.showInputDialog
            (null, "Selecione o tipo de atendidmento abaixo:",
            "Atendimento:",JOptionPane.QUESTION_MESSAGE,null,tipodeAtendimentos,
            tipodeAtendimentos[0]);
    if(SeleçãodoAtendimento == null){
      return;
    }
    String doenca= "Não se aplica";
    if(SeleçãodoAtendimento.equals("Consulta")){
     String StatusAnimal=JOptionPane.showInputDialog("O animal esta doente ?(s/n)");
     if(StatusAnimal== null)
       return;
       StatusAnimal =StatusAnimal.trim().toLowerCase();

     if(StatusAnimal.equalsIgnoreCase("s")){
       String[] listadeDoenças = animal.getDoencas();
       doenca=(String)JOptionPane.showInputDialog(null,
               "Selecione a doença do animal:","Doenças: ",
               JOptionPane.QUESTION_MESSAGE,null,listadeDoenças,listadeDoenças[0]);
               if(doenca==null)return;
               
     } else if (StatusAnimal.equalsIgnoreCase("n")){
       doenca=JOptionPane.showInputDialog("Informe o motivo da consulta:");
       if(doenca==null ||doenca.trim().isEmpty()){
         JOptionPane.showMessageDialog(null,
                 "Você deve informar o motivo da consulta!");
         return;
       }
     }else{
       JOptionPane.showMessageDialog(null,"Digite apenas S ou N");
       return;

    }
    Consulta consulta = new Consulta(SeleçãodoAtendimento, doenca, animal);
    agenda[ttConsultas] = consulta;
    ttConsultas++;
    JOptionPane.showMessageDialog(null,
            "Atendimento cadastrado!");
}


}}
