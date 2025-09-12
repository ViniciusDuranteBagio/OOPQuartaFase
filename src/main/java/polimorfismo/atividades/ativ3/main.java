package polimorfismo.atividades.ativ3;

public class main {
    public static void main(String[] args) {


        Loja livro = new Livro("arca de noe", 74.90, 550);
        Loja eletronico = new Eletronico("celular", 799.90, 320);
        Loja roupas = new Roupas("blusa", 49.90, 1225);

        livro.exibirResumo();
        System.out.println();
        eletronico.exibirResumo();
        System.out.println();
        roupas.exibirResumo();
    }
}
