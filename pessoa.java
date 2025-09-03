package Prova;
/*
Crie uma classe chamada Pessoa com os atributos nome e idade, e um método apresentar() que imprime: “Olá, meu nome é e tenho anos.”
 */

/*
Crie uma classe Pessoa, com os atributos nome e idade, com um método apresentar() que vai falar "Olá sou, {nome}, e minha tenho {idade} anos".
Crie uma classe Aluno que herda de Pessoa. Adicione o atributo matricula.
Sobrescreva o método apresentar() para imprimir também a matrícula.
 */
public class pessoa {
    public String nome;
    public int idade;


    public void metodoApresentar(){
        System.out.println("Olá, sou," + ":" + nome + "\n" + " e minha tenho " +  " : " +   idade + " " + "anos.");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
