public class Aluno1 extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("Erro: a matrícula não pode ser vazia.");
        }
    }


    public void apresentar() {
        System.out.println("Olá, sou " + getNome() + ", tenho " + getIdade() + " anos e minha matrícula é " + this.matricula + ".");
    }
}
