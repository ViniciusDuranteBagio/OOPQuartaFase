package Prova;
/*
Crie uma classe Professor que herda de Pessoa.
Adicione o atributo disciplina.
Sobrescreva o método apresentar() para imprimir também a disciplina
 */
public class professor extends pessoa{
    public String disciplina;

    public void metodoApresentar(){
        System.out.println("Olá, sou," + ":" + nome + "\n" + " e minha tenho " +  " : " +   idade + " " + "anos" + "\n" + "e faço a disciplina" + ":" + " " + disciplina);
    }
}
