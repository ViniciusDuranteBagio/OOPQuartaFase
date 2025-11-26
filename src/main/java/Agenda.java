import javax.swing.*;
import java.awt.*;

public class Agenda {

    public static final int MAX_CONSULTAS = 10;
    private final Consulta[] registros = new Consulta[MAX_CONSULTAS];
    private int contador = 0;

    public void inserir(Consulta c) throws Exception {
        if (contador >= registros.length) throw new Exception("Agenda cheia. Não há mais horários disponíveis.");
        registros[contador++] = c;
    }

    public boolean estaVazia() {
        return contador == 0;
    }

    public String[] gerarListaStrings() {
        String[] saida = new String[contador];
        for (int i = 0; i < contador; i++) {
            saida[i] = registros[i].toString();
        }
        return saida;
    }

    public void exibirConsultas() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(i + 1).append(" - ").append(registros[i]).append("\n\n");
        }
        JTextArea area = new JTextArea(sb.toString());
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(420, 300));
        JOptionPane.showMessageDialog(null, scroll, "Consultas", JOptionPane.PLAIN_MESSAGE);
    }
}