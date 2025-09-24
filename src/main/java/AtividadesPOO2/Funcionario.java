package AtividadesPOO2;
//Atividade06 HerançaAula04
public class Funcionario {
        private String nome;
        private double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public void aumentarSalario(double porcentagem) {
            if (porcentagem > 0) {
                salario += salario * (porcentagem / 100);
                System.out.println("Salário aumentado em " + porcentagem + "%");
            } else {
                System.out.println("Porcentagem inválida!");
            }
        }

        public void exibirInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Salário: R$ " + salario);
        }
    }
class Gerente extends Funcionario {
    private String departamento;
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Departamento: " + departamento);
        System.out.println("------------------------");
    }
}