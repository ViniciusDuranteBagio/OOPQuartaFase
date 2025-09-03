package Prova;

class Aluno extends PessoaDois {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Minha matrícula é " + matricula + ".");
    }
}
