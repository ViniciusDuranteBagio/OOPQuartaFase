package Prova;

public class Animal {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
        public void fazerSom(){
            System.out.println(nome + " com " + idade + " anos de idade" + " fez um som...?");
        }

    }

/*Animal animal1 = new Animal("demiurgo", 2025);
Animal animal2 = new Animal("vovó", 99);
animal1.fazerSom();
animal2.fazerSom();
*/
