public class Exercicio5 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.idade = 3;
        
        cachorro.exibirInformacoes();
        cachorro.dormir();
        cachorro.latir();
        cachorro.brincar();
    }
}

