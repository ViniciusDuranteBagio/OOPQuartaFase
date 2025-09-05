package Prova;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nomeInical, int idadeIncial, int matriculaInicial) {
        super(nomeInical, idadeIncial);
        this.matricula = matriculaInicial;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("minha matricula é "+matricula);;
    }
}
