
public class Carro {
    private String marca;
    private int ano;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Erro: a marca não pode ser vazia.");
        }
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1885) {
            this.ano = ano;
        } else {
            System.out.println("Erro: ano inválido para um carro.");
        }
    }


    public void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }
}
