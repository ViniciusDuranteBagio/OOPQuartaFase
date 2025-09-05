package Prova;
//Crie uma classe Pessoa, com os atributos nome e idade, com um método apresentar()
// que vai falar "Olá sou, {nome}, e minha tenho {idade} anos".
//Crie uma classe Aluno que herda de Pessoa. Adicione o atributo matricula.
// Sobrescreva o método apresentar() para imprimir também a matrícula.

public class Pessoa2 {
        private String nome;
        private Integer idade;

                public Pessoa2(String nome, Integer idade) {
                    this.nome = nome;
                    this.idade = idade;
                }

                public String getNome() {
                    return nome;
                }

                 public Integer getIdade() {
                     return idade;
                 }

    public void apresentar(){
        System.out.println("Olá sou," + getNome() + " e tenho " + getIdade() + " anos");
    }
}