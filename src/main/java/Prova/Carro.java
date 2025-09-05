package Prova;

public class Carro {
        private String marca;
        private int ano;

        public Carro(String marcaCarro, int anoCarro) {
            this.marca = marcaCarro;
            this.ano = anoCarro;
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ExibirDados() {
        System.out.println("A marca do carro é " + marca
                + " e o ano dele é " + ano);
    }
}
