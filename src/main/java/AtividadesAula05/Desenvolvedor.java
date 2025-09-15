package AtividadesAula05;

public class Desenvolvedor extends Funcionario {

        public Desenvolvedor(String nome, double salario) {
            super(nome, salario);
        }

        @Override
        public double calcularSalario() {
            return salario * 1.8;
        }
    }

