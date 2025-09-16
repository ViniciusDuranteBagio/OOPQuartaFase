public class ValidadoresDados {
    public static void main(String[] args) {
        Validador cpfValidador = new ValidadorCPF();
        Validador emailValidador = new ValidadorEmail();
        Validador cnpjValidador = new ValidadorCNPJ();
        
        System.out.println("CPF válido: " + cpfValidador.validar("12345678901"));
        System.out.println("Email válido: " + emailValidador.validar("teste@email.com"));
        System.out.println("CNPJ válido: " + cnpjValidador.validar("12345678000199"));
    }
}

