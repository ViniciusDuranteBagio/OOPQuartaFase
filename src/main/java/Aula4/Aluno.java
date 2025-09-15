package Aula4;

//aluno herdou da classe pessoa
public class Aluno extends Pessoa{

    //atributo matricula
    private int matricula;

    //construtor do exercicio2
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    //metodos getter e setter para o atributo matricula que é privado
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


}
