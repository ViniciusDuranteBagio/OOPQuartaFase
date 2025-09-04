package Prova;

public class Professor extends ProvaPessoa {
    String disciplina;

    public void apresentar() {
        System.out.println("Olá, sou " + nome + ",e tenho " + idade + " anos e ministro a disciplina " + disciplina);
    }
}


