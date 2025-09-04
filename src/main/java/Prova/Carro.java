package Prova;

public class Carro {
        private String marca;
        private int ano;

        public Carro(String marca, int ano){
            this.marca = marca;
            this.ano = ano;
        }

        public Carro(){
            setMarca(marca);
            setAno(ano);
        }

        public String getMarca(){
            return marca;
        }
        public int getAno(){
            return ano;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public void exibirDados(){
            System.out.println("Marca do carro: " + marca);
            System.out.println("Ano do carro: " + ano);
        }
    }
