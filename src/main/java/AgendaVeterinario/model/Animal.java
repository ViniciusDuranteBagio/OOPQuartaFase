package AgendaVeterinario.model;

import AgendaVeterinario.exception.ValidarNomeException;
import AgendaVeterinario.exception.ValidarIdadeException;

import javax.swing.*;
import java.util.List;

public abstract class Animal {

    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {

        validarNome(nome);
        validarIdade(idade);
        validarRaca(raca);

        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public abstract List<String> getDoencas();

    public void validarNome(String nome){
        if (nome.length() <2){
            throw new ValidarNomeException("O nome deve conter no mínimo 2 caracteres!");
        }
        if (nome == null || nome .isBlank()){
            throw new ValidarNomeException("O nome não pode ser nulo ou vazio!");
        }
        if (!nome.matches("[a-zA-Zá-úÁ-Ú ]+")){
            throw new ValidarNomeException("O nome não pode conter números ou símbolos!");
        }
    }

    public void validarIdade(int idade){
        if (idade <=0){
            throw new ValidarIdadeException("A idade não pode ser negativa ou igual a zero!");
        }
    }

    public void validarRaca(String raca) {
        //peguei esse blank com o chat pq aparentemente é melhor para validar se é vazio ou nao

        if (raca == null || raca.isBlank()) {
            throw new ValidarNomeException("A raça não pode ser vazia!");
        }

        if (raca.length() < 2) {
            throw new ValidarNomeException("A raça deve ter pelo menos 2 caracteres!");
        }

        if (!raca.matches("[a-zA-Zá-úÁ-Ú ]+")) {
            throw new ValidarNomeException("A raça não pode conter números ou símbolos!");
        }
    }









}