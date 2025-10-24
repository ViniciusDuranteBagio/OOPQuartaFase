package Atvd_aula6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //1
        Calculadora calculo = new Calculadora();

        double resultado = calculo.divisao(8.6, 0);
        System.out.println(resultado);

     //2

        Scanner scan = new Scanner(System.in);
        Conversor converter = new Conversor();
        int num = -1;

        while (num == -1) {
            System.out.println("Coloque um número inteiro: ");
            String entrada = scan.nextLine();
            num = converter.converter(entrada);
        }
        System.out.println("Número válido inserido. " + num);

    //3

        Pessoa pss = new Pessoa();

        try{
            pss.setIdade(-5);
            System.out.println("Idade cadastrada: "+pss.getIdade());
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro encontrado: "+e.getMessage());
        }

   //4

        Conta conta = new Conta(2500.00);

        try {
            conta.sacar(3000.0);
        }catch (SaldoInsuficienteException e){
            System.out.println("Erro encontraado: "+ e.getMessage());
        }

    //5

        VetorNumeros vetor = new VetorNumeros();
        System.out.println("Acessando índice 2: ");
        System.out.println("Valor: " + vetor.indiceAcesso(2));

        System.out.println("Acessando índice 8: ");
        System.out.println("Valor: " + vetor.indiceAcesso(8));


    //6

        CalculadoraMatematica raiz = new CalculadoraMatematica();
        double[]numeros = {15,36,9,-4,};

        for (double numer : numeros) {
            try {
                double resultadoo = raiz.calcularRaiz(numer);
                System.out.println("A raiz quadrada de " + numer + " é " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao calcular a raiz de " + numer + ": " + e.getMessage());
            }
        }


    //7

            try {
                int resultadooo = 10/20;
                String nome = "";
                Usuario user = new Usuario(nome);
                System.out.println("Nome cadastrado: "+ user.nome);
            }catch (NomeInvalidoException e) {
                System.out.println("erro: "+e.getMessage());
            }catch (ArithmeticException e){
                System.out.println("erro: impossível dividir por 0.");
        }


    //8

        Operacoes opera = new Operacoes();
        String[] texto = {"25", "aaaa", "50"};
        double[] divisor = {2,5,0};

        for (int i = 0; i<texto.length; i++){
          try {
              double result = opera.converteDivide(texto[i], divisor[i]);
              System.out.println("Resultado: "+texto[i]+ " / "+ divisor[i]+ " = "+ result);
          }catch (Exception e){
              System.out.println(e.getMessage());
          }
        }


    //9

        ValidadorDocumento valid = new ValidadorDocumento();
        valid.validardoc("123.456.789-03");
        valid.validardoc("1523");



    //10

        Login logar = new Login();
        logar.log("teste", "2468");
        logar.log("lumi", "222");
        logar.log("lumi", "2468");


     //11

        ContaBancaria contar = new ContaBancaria();

        contar.depositar(-50);
        contar.sacar(200);
        contar.depositar(50);
        contar.sacar(80);


    //12

        ValidadorEntrada validar = new ValidadorEntrada();
        validar.validarNum(-5);
        validar.validarNum(6);



   //13

        try {
            throw new ErroComCodigoException("erro encontrado!", 404);
        } catch (ErroComCodigoException e) {
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Código: " + e.getCod());
        }




    }
}
