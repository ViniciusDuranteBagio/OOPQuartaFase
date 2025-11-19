import javax.swing.*;

public class Agenda {

    private Consulta[] consultas = new Consulta[10];
    private int total = 0;

    // Adiciona uma consulta à agenda
    public void adicionar(Consulta consulta) throws Exception {
        if (total >= 10)
            throw new Exception("Agenda cheia! Máximo de 10 consultas.");
        consultas[total++] = consulta;
    }

    // Verifica se está vazia
    public boolean vazia() {
        return total == 0;
    }

    // Retorna todas as consultas como array de Strings para a interface
    public String[] toStringArray() {
        String[] array = new String[total];
        for (int i = 0; i < total; i++) {
            array[i] = consultas[i].toString();
        }
        return array;
    }

    // Faz as consultas com JOptionPane
    public void listar() {
        if (total == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada.");
            return;
        }

        StringBuilder sb = new StringBuilder("Consultas agendadas:\n\n");

        for (int i = 0; i < total; i++) {
            sb.append((i + 1))
                    .append(". ")
                    .append(consultas[i])
                    .append("\n\n");
        }

        JTextArea txt = new JTextArea(sb.toString());
        txt.setEditable(false);

        JScrollPane scroll = new JScrollPane(txt);
        scroll.setPreferredSize(new java.awt.Dimension(400, 300));

        JOptionPane.showMessageDialog(null, scroll, "Consultas", JOptionPane.PLAIN_MESSAGE);
    }
}


