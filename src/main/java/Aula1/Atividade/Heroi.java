package Aula1.Atividade;

public class Heroi {
        private String nome;
        private String classe;

        public Heroi(String nome, String classe) {
            this.nome = nome;
            this.classe = classe;
        }

        public void lutar() {
            System.out.println(nome + " (" + classe + ") atacou!");
        }




}
