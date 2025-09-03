package Prova;

public class Prova {

    public class Pessoa {
        private String nome;
        private int idade;

        public String getNome(String nome) {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade(int idade) {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void apresentar() {
            System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
        }
    }

}
