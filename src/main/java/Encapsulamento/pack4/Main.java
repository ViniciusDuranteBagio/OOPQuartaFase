package Encapsulamento.pack4;

public class Main {
    public static void main(String[] args) {

        aluno a1 = new aluno("Danilo", 123456);

        a1.setNota(15);
        a1.setNota(8.5);
        a1.setNome("Libério Silvio Silva da Costa Silva e Silva");
        a1.setMatricula(514231);

        a1.exibirStatus();
    }
}
