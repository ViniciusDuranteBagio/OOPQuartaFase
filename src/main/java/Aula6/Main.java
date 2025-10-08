package Aula6;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.dividir();

        Conversor conv = new Conversor();
        conv.converter();

        Pessoa pessoa = new Pessoa();
        pessoa.definirIdade();

        Conta conta = new Conta(500);
        conta.sacar(600);
        conta.sacar(200);

        VetorNumeros vetor = new VetorNumeros();
        vetor.acessarIndice();

        CalculadoraMatematica calcMat = new CalculadoraMatematica();
        calcMat.calcularRaiz();

        Usuario usuario = new Usuario();
        usuario.cadastrarNome();

        Operacoes operacoes = new Operacoes();
        operacoes.converterEDividir();

        ValidadorDocumento validador = new ValidadorDocumento();
        validador.validarCPF();

        Login login = new Login();
        login.fazerLogin();

        ContaBancaria contaBancaria = new ContaBancaria(1000);
        contaBancaria.depositar(-50);
        contaBancaria.sacar(1200);
        contaBancaria.depositar(500);
        contaBancaria.sacar(300);

        ValidadorEntrada valEntrada = new ValidadorEntrada();
        int numeroPositivo = valEntrada.lerNumeroPositivo();
        System.out.println("Número positivo digitado: " + numeroPositivo);

        ErroComCodigoException.testar();
    }
}