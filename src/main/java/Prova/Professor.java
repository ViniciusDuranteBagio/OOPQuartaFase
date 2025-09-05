package main.java.Prova;

public class Professor extends Pessoa{
    public String disciplina;

    @Override
    public void Apresentar(){
        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos e dou aulas de " + disciplina);
    }
}
