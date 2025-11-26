package TrabalhoFinal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || !nome.trim().matches("[A-Za-zÀ-ÿ ]{2,}")) {
            throw new IllegalArgumentException(
                    "O nome deve conter apenas letras e espaços e ter no mínimo 2 caracteres."
            );
        }
        this.nome = nome.trim();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade deve ser um número positivo.");
        }
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || !raca.trim().matches("[A-Za-zÀ-ÿ ]{2,}")) {
            throw new IllegalArgumentException(
                    "Raça deve ser informada e conter apenas letras."
            );
        }
        this.raca = raca.trim();
    }

    protected List<String> criarDoenca(String... doencas) {
        List<String> lista = new ArrayList<>();
        for (String s : doencas) {
            lista.add(s);
        }
        return lista;
    }

    public abstract List<String> getDoencacomuns();
}
