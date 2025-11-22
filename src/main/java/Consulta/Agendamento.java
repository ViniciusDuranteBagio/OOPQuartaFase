package Consulta;

import Animal.Animal;

public class Agendamento {

    private final Animal animal;
    private final String tipoAtendimento;
    private String doenca;

    // Veterinário só em consultas
    private final Veterinario veterinario;

    // Funcionário/pet groomer só em serviços gerais
    private final Funcionario funcionario;

    // Construtor para consulta
    public Agendamento(Animal animal, String tipoAtendimento, Veterinario veterinario) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.veterinario = veterinario;
        this.funcionario = null;
    }

    // Construtor para serviços gerais (Banho/Tosa)
    public Agendamento(Animal animal, String tipoAtendimento, Funcionario funcionario) {
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.funcionario = funcionario;
        this.veterinario = null;
    }

    public Animal getAnimal() { return animal; }

    public String getTipoAtendimento() { return tipoAtendimento; }

    public Veterinario getVeterinario() { return veterinario; }

    public Funcionario getFuncionario() { return funcionario; }

    public String getDoenca() { return doenca; }

    public void setDoenca(String doenca) { this.doenca = doenca; }

    @Override
    public String toString() {
        String base = String.format("%s | Atendimento: %s", animal.getNome(), tipoAtendimento);

        if (veterinario != null) {
            base += " | Veterinário(a): " + veterinario.getNome();
            if (doenca != null && !doenca.isEmpty()) {
                base += " | Doença: " + doenca;
            }
        }

        if (funcionario != null) {
            base += " | Funcionário(a): " + funcionario.getNome();
        }

        return base;
    }
}
