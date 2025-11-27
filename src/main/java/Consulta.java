public class Consulta {
    private Animal animal;
    private TipoAtendimento tipoAtendimento;
    private String doenca;
    private int numero;

    public Consulta(int numero, Animal animal, TipoAtendimento tipoAtendimento) {
        this.numero = numero;
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.doenca = null;
    }

    public Consulta(int numero, Animal animal, TipoAtendimento tipoAtendimento, String doenca) {
        this(numero, animal, tipoAtendimento);
        this.doenca = doenca;
    }

    public Animal getAnimal() { return animal; }
    public TipoAtendimento getTipoAtendimento() { return tipoAtendimento; }
    public String getDoenca() { return doenca; }
    public int getNumero() { return numero; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Consulta #").append(numero).append("\n");
        sb.append("Animal: ").append(animal.toString()).append("\n");
        sb.append("Tipo: ").append(tipoAtendimento.getDescricao());

        if (doenca != null) {
            sb.append("\nDoença: ").append(doenca);
        }

        return sb.toString();
    }
}
