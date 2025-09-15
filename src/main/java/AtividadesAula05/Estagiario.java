package AtividadesAula05;

public class Estagiario extends Funcionario {

        public Estagiario(String nome, double salario) {
            super(nome, salario);
        }

        @Override
        public double calcularSalario() {
            return salario;
        }
    }

