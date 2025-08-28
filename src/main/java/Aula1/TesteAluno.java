public class TesteAluno {
    public static void main(String[] args) {
        // Criando aluno
        Aluno a1 = new Aluno("Babs", "2025001");
        a1.exibirStatus();

        System.out.println("----");

        a1.setNota(8.5);
        a1.exibirStatus();

        System.out.println("----");

        // Tentando definir nota inválida
        a1.setNota(15);
        a1.exibirStatus();
    }
}