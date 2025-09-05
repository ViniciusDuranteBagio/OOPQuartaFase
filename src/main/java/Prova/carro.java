package Prova;

public class carro {
        private String marca;
        private int ano;

        public carro(String marca, int ano){
            this.marca = marca;
            this.ano = ano;
        }
        public String getMarca(){
            return marca;
        }
        public void setMarca(String marca){
            this.marca = marca;
        }
        public int getAno(){
            return ano;
        }
        public void setAno(int ano){
            this.ano = ano;
        }
        public void exibirDados(){
            System.out.println("Marca" + getMarca());
            System.out.println("Ano" + getAno());
        }
    }

