package OOPQuartaFase.src.Prova;

public class Professora extends Pessoa{

    String disciplina = "Matemática";

    @Override
    public void apresentar() {
        System.out.println("Olá meu nome é " + nome +
                " e tenho " + idade + " anos" + ", leciono a disciplina de " + disciplina);
    }
}
