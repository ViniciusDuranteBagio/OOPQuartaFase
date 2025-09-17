package Aula4;

public class Animal {
     /*String nome;
     int idade;*/
    protected String nome;
    protected int idade;

     void dormir() {
         System.out.println("O " + nome +  " está dormindo");
     }

     void exibirInforamacoes() {
         System.out.println("Nome do animal: " + nome + "\nIdade do animal: " + idade);
     }
}
