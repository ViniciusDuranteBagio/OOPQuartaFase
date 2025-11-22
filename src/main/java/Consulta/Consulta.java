package Consulta;

import Animal.Animal;
import Animal.Cachorro;
import Animal.Gato;
import Animal.Coelho;
import Exceptions.ValidacaoOperacaoException;

import javax.swing.*;
import java.util.regex.Pattern;

public class Consulta {

    private final Agenda agenda = new Agenda();
    private final Veterinario vet; // Veterinário principal
    private final Funcionario func; // Funcionário para banho/tosa
    private final Pattern nomePattern = Pattern.compile("^[A-Za-zÀ-ú ]{2,}$");

    public Consulta(Veterinario vet, Funcionario func) {
        this.vet = vet;
        this.func = func;
    }

    // Menu principal
    public void iniciar() {
        String menuPrincipal = "O que deseja fazer?\n" +
                "1. Listar agendamentos\n" +
                "2. Cadastrar agendamento\n" +
                "0. Sair";

        int opc = -1;
        do {
            String entrada = JOptionPane.showInputDialog(null, menuPrincipal, "Agenda Veterinária", JOptionPane.QUESTION_MESSAGE);
            if (entrada == null) return;

            try { opc = Integer.parseInt(entrada.trim()); }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (opc) {
                case 1 -> listarConsultas();
                case 2 -> cadastrarAgendamento();
                case 0 -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opc != 0);
    }

    // Listagem de agendamentos
    private void listarConsultas() {
        if (agenda.tamanho() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum agendamento cadastrado.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Agendamento a : agenda.listar()) {
            sb.append(i++).append(") ").append(a).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Agendamentos", JOptionPane.INFORMATION_MESSAGE);
    }

    // Cadastro
    private void cadastrarAgendamento() {
        if (agenda.tamanho() >= 10) {
            JOptionPane.showMessageDialog(null, "Agenda cheia.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String tipoAnimal = escolherTipoAnimal();
        if (tipoAnimal == null) return;

        String nome = pedirNome(); if (nome == null) return;
        Integer idade = pedirIdade(); if (idade == null) return;
        String raca = pedirRaca(); if (raca == null) return;

        Animal animal;
        try {
            animal = switch (tipoAnimal) {
                case "Cachorro" -> new Cachorro(nome, idade, raca);
                case "Gato" -> new Gato(nome, idade, raca);
                case "Coelho" -> new Coelho(nome, idade, raca);
                default -> throw new RuntimeException("Tipo inválido.");
            };
        } catch (ValidacaoOperacaoException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar animal: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tipoAtendimento = escolherTipoAtendimento();
        if (tipoAtendimento == null) return;

        Agendamento ag;
        if ("Consulta".equalsIgnoreCase(tipoAtendimento)) {
            ag = new Agendamento(animal, tipoAtendimento, vet);

            int doente = JOptionPane.showConfirmDialog(null, "O animal está doente?", "Doença", JOptionPane.YES_NO_OPTION);
            if (doente == JOptionPane.YES_OPTION) {
                String doenca = escolherDoenca(animal);
                if (doenca != null) ag.setDoenca(doenca);
                else { JOptionPane.showMessageDialog(null, "Cadastro cancelado."); return; }
            }

        } else { // Banho/Tosa → funcionário
            ag = new Agendamento(animal, tipoAtendimento, func);
        }

        if (agenda.adicionar(ag)) {
            JOptionPane.showMessageDialog(null, "Agendamento cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar agendamento.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Métodos de input simplificados
    private String escolherTipoAnimal() {
        String[] opcoes = {"Cachorro", "Gato", "Coelho"};
        return (String) JOptionPane.showInputDialog(null, "Escolha o tipo de animal:", "Animal",
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }

    private String pedirNome() {
        while (true) {
            String nome = JOptionPane.showInputDialog(null, "Nome do animal:");
            if (nome == null) return null;

            nome = nome.trim();
            if (!nomePattern.matcher(nome).matches()) {
                JOptionPane.showMessageDialog(null, "Nome inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            return nome;
        }
    }

    private Integer pedirIdade() {
        while (true) {
            String s = JOptionPane.showInputDialog(null, "Idade do animal:");
            if (s == null) return null;

            try {
                int idade = Integer.parseInt(s.trim());
                if (idade <= 0 || idade > 100) {
                    JOptionPane.showMessageDialog(null, "Idade inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                return idade;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private String pedirRaca() {
        while (true) {
            String raca = JOptionPane.showInputDialog(null, "Raça do animal:");
            if (raca == null) return null;

            raca = raca.trim();
            if (raca.isEmpty() || raca.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Raça inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            return raca;
        }
    }

    private String escolherTipoAtendimento() {
        String[] opcoes = {"Banho", "Banho e Tosa", "Tosa", "Consulta"};
        return (String) JOptionPane.showInputDialog(null, "Escolha o atendimento:", "Atendimento",
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }

    private String escolherDoenca(Animal animal) {
        String[] doencas = animal.getDoencasPossiveis();
        return (String) JOptionPane.showInputDialog(null, "Selecione a doença:", "Doenças",
                JOptionPane.QUESTION_MESSAGE, null, doencas, doencas[0]);
    }
}
