public class Animal {
    private String nome;
    private double idade;
    private String raça;

    public Animal(String nome,double idade,String raça){
        this.nome=nome;
        this.idade=idade;
        this.raça=raça;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setidade(double idade) {
        this.idade = idade;
    }

    public double getidade() {
        return idade;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    @Override
    public String toString(){
        return "Animal: " + nome +
                "\nRaça: " + raça +
                "\nIdade: "+idade;

    }
    public String[] getDoencas() {
        return new String[0];
}
}
