package AtividadesPOO3;
//Atividade06 PolimorfismoAula05
public interface Validador {
    boolean validar(String valor);
}
    class ValidadorCPF implements Validador {
    @Override
    public boolean validar(String valor) {
        if (valor != null && valor.matches("\\d{11}")) {
            System.out.println("CPF válido: " + valor);
            return true;
        } else {
            System.out.println("CPF inválido: " + valor);
            return false;
        }
    }
}
    class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String valor) {
        if (valor != null && valor.contains("@") && valor.contains(".")) {
            System.out.println("Email válido: " + valor);
            return true;
        } else {
            System.out.println("Email inválido: " + valor);
            return false;
        }
    }
}
    class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {
        if (valor != null && valor.matches("\\d{14}")) {
            System.out.println("CNPJ válido: " + valor);
            return true;
        } else {
            System.out.println("CNPJ inválido: " + valor);
            return false;
        }
    }
}