
public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();


        // EXEMPLO 1: Cadastrar um cachorro para Banho
        Animal dog1 = new Cachorro("cloe", 3, "poodle toy"); // cria o animal
        Consulta c1 = new Consulta(dog1, "Banho", null);   // cria a consulta
        agenda.adicionar(c1);

        // EXEMPLO 2: Cadastrar um gato para Consulta com doença
        Animal gato1 = new Gato("joey", 2, "Persa");

        // Escolhi manualmente uma das doenças possíveis:
        String doencaGato = gato1.getDoencasPossiveis()[1]; // "Rinotraqueíte"

        Consulta c2 = new Consulta(gato1, "Consulta", doencaGato);
        agenda.adicionar(c2);


        // EXEMPLO 3: Cadastrar um coelho para Tosa
        Animal coelho1 = new Coelho("Sansão", 1, "Florida White");
        Consulta c3 = new Consulta(coelho1, "Tosa", null);
        agenda.adicionar(c3);

        // LISTAR TUDO QUE FOI CADASTRADO
        System.out.println("Foi Cadastrado carai");
        for (Consulta c : agenda.getConsultas()) {
            if (c != null)
                System.out.println(c);
        }
    }
}
