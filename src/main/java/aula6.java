public class aula6 {
    //exercicio 6
    import java.util.;

    class Calculadora {
        public double dividir(double a, double b) throws ArithmeticException {
            if (b == 0) throw new ArithmeticException("Ei! Não dá pra dividir por zero, né?");
            return a / b;
        }
    }

    class Conversor {
        public int converter(String texto) throws NumberFormatException {
            return Integer.parseInt(texto);
        }
    }

    class IdadeInvalidaException extends Exception {
        public IdadeInvalidaException(String msg) { super(msg); }
    }

    class Pessoa {
        private int idade;
        public void setIdade(int idade) throws IdadeInvalidaException {
            if (idade < 0) throw new IdadeInvalidaException("Idade negativa? Isso é impossível, nem nos filmes!");
            this.idade = idade;
        }
    }

    class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String msg) { super(msg); }
    }

    class Conta {
        private double saldo;
        public Conta(double saldo) { this.saldo = saldo; }
        public void sacar(double valor) throws SaldoInsuficienteException {
            if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente! Sonhar é de graça, mas sacar não.");
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: R$" + saldo);
        }
    }

    class VetorNumeros {
        private int[] numeros = {10, 20, 30, 40, 50};
        public int acessar(int indice) throws ArrayIndexOutOfBoundsException {
            return numeros[indice];
        }
    }

    class CalculadoraMatematica {
        public double raizQuadrada(double num) throws Exception {
            if (num < 0) throw new Exception("Raiz de número negativo? Só no mundo invertido!");
            return Math.sqrt(num);
        }
    }

    class NomeInvalidoException extends Exception {
        public NomeInvalidoException(String msg) { super(msg); }
    }

    class Usuario {
        private String nome;
        public void setNome(String nome) throws NomeInvalidoException {
            if (nome == null || nome.trim().isEmpty()) throw new NomeInvalidoException("Nome vazio? Assim não dá!");
            this.nome = nome;
        }
    }

    class Operacoes {
        public double dividirTexto(String num1, String num2) {
            try {
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                if (b == 0) throw new ArithmeticException("Tentando dividir por zero de novo? Corajoso!");
                return (double) a / b;
            } catch (NumberFormatException e) {
                System.out.println("Isso não é número! Digita direito!");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            return 0;
        }
    }

    class DocumentoInvalidoException extends Exception {
        public DocumentoInvalidoException(String msg) { super(msg); }
    }

    class ValidadorDocumento {
        public void validarCPF(String cpf) throws DocumentoInvalidoException {
            if (cpf.length() != 11) throw new DocumentoInvalidoException("CPF inválido! Tem que ter 11 dígitos certinhos.");
        }
    }

    class UsuarioNaoEncontradoException extends Exception {
        public UsuarioNaoEncontradoException(String msg) { super(msg); }
    }

    class SenhaIncorretaException extends Exception {
        public SenhaIncorretaException(String msg) { super(msg); }
    }

    class Login {
        private Map<String, String> usuarios = new HashMap<>();
        public Login() {
            usuarios.put("admin", "1234");
            usuarios.put("tamara", "abc123");
        }
        public void logar(String usuario, String senha) throws UsuarioNaoEncontradoException, SenhaIncorretaException {
            if (!usuarios.containsKey(usuario)) throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
            if (!usuarios.get(usuario).equals(senha)) throw new SenhaIncorretaException("Senha incorreta! Tentou a de aniversário?");
            System.out.println("Login bem-sucedido! Bem-vindo(a), " + usuario + "!");
        }
    }

    class ContaBancaria {
        private double saldo;
        public ContaBancaria(double saldo) { this.saldo = saldo; }
        public void depositar(double valor) throws Exception {
            if (valor < 0) throw new Exception("Depósito negativo? Tá de brincadeira?");
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado! Saldo: R$" + saldo);
        }
        public void transferir(double valor) throws Exception {
            if (valor > saldo) throw new Exception("Transferência maior que o saldo! Sem limite infinito aqui.");
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " concluída! Saldo restante: R$" + saldo);
        }
    }

    class ErroComCodigoException extends Exception {
        private int codigo;
        public ErroComCodigoException(String msg, int codigo) {
            super(msg);
            this.codigo = codigo;
        }
        public int getCodigo() { return codigo; }
    }

    public class Main {
        public static void main(String[] args) {
            try {
                Calculadora calc = new Calculadora();
                System.out.println("Divisão: " + calc.dividir(10, 2));

                Conversor conv = new Conversor();
                System.out.println("Conversão: " + conv.converter("42"));

                Pessoa p = new Pessoa();
                p.setIdade(25);

                Conta conta = new Conta(100);
                conta.sacar(50);

                VetorNumeros vetor = new VetorNumeros();
                System.out.println("Elemento no índice 3: " + vetor.acessar(3));

                CalculadoraMatematica cm = new CalculadoraMatematica();
                System.out.println("Raiz de 9: " + cm.raizQuadrada(9));

                Usuario u = new Usuario();
                u.setNome("Tamara");

                Operacoes op = new Operacoes();
                op.dividirTexto("10", "0");

                ValidadorDocumento vd = new ValidadorDocumento();
                vd.validarCPF("12345678901");

                Login login = new Login();
                login.logar("tamara", "abc123");

                ContaBancaria cb = new ContaBancaria(300);
                cb.depositar(100);
                cb.transferir(200);

                throw new ErroComCodigoException("Erro misterioso detectado!", 404);

            } catch (Exception e) {
                if (e instanceof ErroComCodigoException) {
                    ErroComCodigoException erro = (ErroComCodigoException) e;
                    System.out.println("Erro " + erro.getCodigo() + ": " + erro.getMessage());
                } else {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
    }
}
