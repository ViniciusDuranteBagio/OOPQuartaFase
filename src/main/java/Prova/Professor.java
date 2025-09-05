package Prova;

public class Professor extends Pessoa2 {
    String disciplina;
    @Override
    void apresentar() {
        System.out.println(nome + disciplina + " De História " );
    }
}
