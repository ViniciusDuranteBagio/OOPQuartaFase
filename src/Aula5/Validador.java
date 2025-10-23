package Aula5;


public interface Validador {
    boolean validar(String valor);
}


class ValidadorCPF implements Validador {
    @Override
    public boolean validar(String valor) {
        boolean valido = valor != null && valor.matches("\\d{11}");
        System.out.println("CPF válido? " + valido);
        return valido;
    }
}

class ValidadorEmail implements Validador {
    @Override
    public boolean validar(String valor) {
        boolean valido = valor != null && valor.contains("@") && valor.contains(".");
        System.out.println("Email válido? " + valido);
        return valido;
    }
}


class ValidadorCNPJ implements Validador {
    @Override
    public boolean validar(String valor) {
        boolean valido = valor != null && valor.matches("\\d{14}");
        System.out.println("CNPJ válido? " + valido);
        return valido;
    }
}
