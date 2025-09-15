package exercicio_6;

public class Main {
    public static void main(String[] args) {
        IValidador cpf = new ValidadorCPF();
        IValidador cnpj = new ValidadorCNPJ();
        IValidador email = new ValidadorEmail();

        String valorCPF = "12345678901";
        String valorCNPJ = "12345678901234";
        String valorEmail = "exemplo@unibave.com";

        System.out.println("CPF válido? " + cpf.validar(valorCPF));
        System.out.println("CNPJ válido? " + cnpj.validar(valorCNPJ));
        System.out.println("Email válido? " + email.validar(valorEmail));
    }
}
