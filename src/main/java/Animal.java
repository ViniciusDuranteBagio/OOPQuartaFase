public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;
    private boolean estaDoente;
    private String doenca;

    public Animal(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.estaDoente = false;
        this.doenca = null;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public boolean estaDoente() {
        return estaDoente;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public abstract String[] getPossiveisDoencas();

    @Override
    public String toString(){
        String texto = "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nRaça: " + getRaca() +
                "\nDoente: " + (estaDoente() ? "Sim" : "Não");
        if(estaDoente() && getDoenca() != null){
            texto += "\nDoença: " + getDoenca();
        }
        return texto;
    }

}
