package AtividadesPOO2;
//Atividade03 HerançaAula04
public class Veiculo {
        private String marca;
        private String modelo;
        public Veiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void exibirInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
        }
    }
class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de Portas: " + quantidadeDePortas);
        System.out.println("-------------------------");
    }
}
class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("-------------------------");
    }
}