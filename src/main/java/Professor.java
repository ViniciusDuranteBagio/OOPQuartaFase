public class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.isEmpty()) {
            this.disciplina = disciplina;
        } else {
            System.out.println("Erro: a disciplina não pode ser vazia.");
        }
    }


    public void apresentar() {
        System.out.println("Olá, sou " + getNome() + ", tenho " + getIdade() + " anos e Sou Professora de " + disciplina + ".");
    }
}

