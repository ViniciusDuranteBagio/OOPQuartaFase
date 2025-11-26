import javax.swing.*;
import java.awt.*;

public class SistemaVeterinario extends JFrame {

    private final Agenda agenda = new Agenda();

    public SistemaVeterinario() {
        super("Agenda Veterinária");

        JButton botaoNovo = new JButton("Cadastrar Consulta");
        JButton botaoExibir = new JButton("Listar Consultas");

        botaoNovo.setFont(new Font("Arial", Font.BOLD, 16));
        botaoExibir.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel painel = new JPanel();
        painel.add(botaoNovo);
        painel.add(botaoExibir);
        setContentPane(painel);

        setSize(450, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botaoNovo.addActionListener(e -> abrirCadastro());
        botaoExibir.addActionListener(e -> agenda.exibirConsultas());
    }

    private void abrirCadastro() {
        try {
            String[] opcoesAnimal = {"Cachorro", "Gato", "Coelho"};
            String tipoAnimal = (String) JOptionPane.showInputDialog(
                    this, "Escolha o animal:", "Animal", JOptionPane.QUESTION_MESSAGE, null, opcoesAnimal, opcoesAnimal[0]);
            if (tipoAnimal == null) return;

            String nome = JOptionPane.showInputDialog("Nome do animal:");
            Validador.conferirNome(nome);

            String idadeStr = JOptionPane.showInputDialog("Idade do animal:");
            int idade = Integer.parseInt(idadeStr);
            Validador.conferirIdade(idade);

            String raca = JOptionPane.showInputDialog("Raça:");
            if (raca == null || raca.isBlank()) throw new ValidacaoException("Raça inválida.");

            Animal paciente = switch (tipoAnimal) {
                case "Cachorro" -> new Cachorro(nome, idade, raca);
                case "Gato" -> new Gato(nome, idade, raca);
                default -> new Coelho(nome, idade, raca);
            };

            String[] tiposAtendimento = {"Banho", "Tosa", "Banho e Tosa", "Consulta"};
            String atendimento = (String) JOptionPane.showInputDialog(
                    this, "Tipo de atendimento:", "Atendimento", JOptionPane.QUESTION_MESSAGE, null, tiposAtendimento, tiposAtendimento[0]);
            if (atendimento == null) return;

            String doenca = null;
            if ("Consulta".equals(atendimento)) {
                int opt = JOptionPane.showConfirmDialog(this, "O animal está doente?");
                if (opt == JOptionPane.YES_OPTION) {
                    String[] lista = paciente.doencas();
                    doenca = (String) JOptionPane.showInputDialog(
                            this, "Escolha a doença:", "Doenças", JOptionPane.QUESTION_MESSAGE, null, lista, lista[0]);
                }
            }

            agenda.inserir(new Consulta(paciente, atendimento, doenca));
            JOptionPane.showMessageDialog(this, "Consulta cadastrada com sucesso!");

        } catch (ValidacaoException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Idade inválida. Digite apenas números.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SistemaVeterinario().setVisible(true));
    }
}
