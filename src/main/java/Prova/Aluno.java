package Prova;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno (String nome, int idade, String matricula) {
super(nome, idade);
this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        super.apresentar();
            System.out.println("minha matricula é " + matricula);
    }
}
/*Aluno aluno1 = new Aluno("nivaldo", 24, "5255");
        aluno1.apresentar();
*/
