public abstract class Animal {

    private String apelido;
    private int anos;
    private String tipoRaca;

    public Animal(String apelido, int anos, String tipoRaca) {
        this.apelido = apelido;
        this.anos = anos;
        this.tipoRaca = tipoRaca;
    }

    public abstract String[] doencas();

    public String getApelido() {
        return apelido;
    }

    public int getAnos() {
        return anos;
    }

    public String getTipoRaca() {
        return tipoRaca;
    }

    @Override
    public String toString() {
        return apelido + " - " + anos + " anos - Raça: " + tipoRaca;
    }
}