package Trabalho;

import javax.swing.*;

public class Consulta {
    private Animal animal;
    private String tipoAnimal;
    private String doenca = "Nenhuma";
    private String tipoConsulta;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public void validarTexto(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= '0' && c <= '9') {
                throw new ValidacaoException("Insira somente texto.");
            }
        }
        if (texto.length() < 2) {
            throw new ValidacaoException("Deve conter dois ou mais caracteres");
        }
    }

    public void cadastrarConsulta() {

        switch (JOptionPane.showInputDialog(
                "Qual o tipo de animal?\n" +
                        "1. Cachorro\n" +
                        "2. Gato\n" +
                        "3. Coelho")) {

            case "1":
                tipoAnimal = "Cachorro";
                animal = new Cachorro();
                break;

            case "2":
                tipoAnimal = "Gato";
                animal = new Gato();
                break;

            case "3":
                tipoAnimal = "Coelho";
                animal = new Coelho();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                return;
        }

        String nome = JOptionPane.showInputDialog("Qual o nome do " + tipoAnimal.toLowerCase() + "?");
        validarTexto(nome);
        animal.setNome(nome);

        String raca = JOptionPane.showInputDialog("Qual a raça do " + tipoAnimal.toLowerCase() + "?");
        validarTexto(raca);
        animal.setRaca(raca);

        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do " + tipoAnimal.toLowerCase() + "?"));
            if (idade < 0) {
                throw new ValidacaoException("Idade tem que ser maior ou igual a 0.");
            }
            animal.setIdade(idade);

        } catch (NumberFormatException e) {
            throw new ValidacaoException("Idade deve ser um número");
        }

        switch (JOptionPane.showInputDialog(
                "Escolha o tipo de consulta:\n" +
                        "1. Banho\n" +
                        "2. Banho e Tosa\n" +
                        "3. Tosa\n" +
                        "4. Consulta")) {

            case "1":
                JOptionPane.showMessageDialog(null, "Banho marcado");
                tipoConsulta = "Banho";
                break;

            case "2":
                JOptionPane.showMessageDialog(null, "Banho e tosa marcados");
                tipoConsulta = "Banho e tosa";
                break;

            case "3":
                JOptionPane.showMessageDialog(null, "Tosa marcada");
                tipoConsulta = "Tosa";
                break;

            case "4":
                String possuiDoenca = JOptionPane.showInputDialog("Possui alguma doença?\n1. Sim\n2. Não");

                if (possuiDoenca.equals("1")) {

                    String[] lista = animal.getListaDoenca();
                    String menu = "Qual doença?\n";

                    for (int i = 0; i < lista.length; i++) {
                        menu += (i + 1) + ". " + lista[i] + "\n";
                    }

                    int escolhaDoenca = Integer.parseInt(JOptionPane.showInputDialog(menu));
                    doenca = lista[escolhaDoenca - 1];
                }

                JOptionPane.showMessageDialog(null, "Consulta marcada");
                tipoConsulta = "Consulta";
                break;
        }
    }
}