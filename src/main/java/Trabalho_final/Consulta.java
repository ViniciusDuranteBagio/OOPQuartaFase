package Trabalho_final;

public class Consulta {
    private Animal animal;
    private TipoServico tipo;
    private boolean doente;
    private String doenca;

    public Consulta(Animal animal, TipoServico tipo, boolean doente, String doenca) {
        this.animal = animal;
        this.tipo = tipo;
        this.doente = doente;
        this.doenca = doenca;
    }

    public Animal getAnimal() {
        return animal;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public boolean isDoente() {
        return doente;
    }

    public String getDoenca() {
        return doenca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal: ").append(animal.toString()).append("\n");
        sb.append("Tipo de Serviço: ").append(tipo).append("\n");
        if (tipo == TipoServico.CONSULTA) {
            sb.append("Doente: ").append(doente ? "Sim" : "Não").append("\n");
            if (doente) {
                sb.append("Doença: ").append(doenca).append("\n");
            }
        }
        return sb.toString();
    }
}
