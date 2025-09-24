package org.Prova;/*import javax.swing.JOptionPane;
import java.sql.SQLClientInfoException;
import java.util.LinkedList;

public class Atividade01 {
    public static void main(String[] args) {
        LinkedList<SQLClientInfoException> fila = new LinkedList<>();

        int quantidade;
        try {
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes deseja cadastrar?"));
        } catch (Exception e) {
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            String nome = JOptionPane.showInputDialog("Nome do cliente " + (i + 1) + ":");
            if (nome == null) return;
            String tipo = JOptionPane.showInputDialog("Tipo de atendimento (normal/prioritário):");
            if (tipo == null) return;

            tipo = tipo.trim().toLowerCase();

            boolean isPrioritario = tipo.equals("prioritário") || tipo.equals("prioritario") || tipo.equals("p");

            if (isPrioritario) {
                int lastPriorIndex = -1;
                for (int j = 0; j < fila.size(); j++) {
                    if (fila.get(j).Ti.equals("prioritario")) lastPriorIndex = j;
                }
                if (lastPriorIndex == -1) {
                    fila.addFirst(new Cliente(nome, "prioritario"));
                } else {
                    fila.add(lastPriorIndex + 1, new Cliente(nome, "prioritario"));
                }
            } else {
                fila.addLast(new Cliente(nome, "normal"));
            }
        }

        StringBuilder ordem = new StringBuilder("Ordem de atendimento:\n");
        int consecutivosPrioritarios = 0;

        while (!fila.isEmpty()) {
            if (consecutivosPrioritarios < 3) {
                if (!fila.isEmpty() && fila.getFirst().tipo.equals("prioritario")) {
                    Cliente c = fila.removeFirst();
                    ordem.append(c.nome).append(" → ");
                    consecutivosPrioritarios++;
                } else {
                    Cliente c = fila.removeFirst();
                    ordem.append(c.nome).append(" → ");
                    consecutivosPrioritarios = 0;
                }
            } else {
                int idxNormal = indexOfFirstNormal(fila);
                if (idxNormal != -1) {
                    Cliente normal = fila.remove(idxNormal);
                    ordem.append(normal.nome).append(" → ");
                    consecutivosPrioritarios = 0;
                } else {
                    Cliente c = fila.removeFirst();
                    ordem.append(c.nome).append(" → ");
                    consecutivosPrioritarios++;
                }
            }
        }

        if (ordem.toString().endsWith(" → ")) ordem.setLength(ordem.length() - 3);

        JOptionPane.showMessageDialog(null, ordem.toString());
    }

    private static int indexOfFirstNormal(LinkedList<Cliente> fila) {
        for (int i = 0; i < fila.size(); i++) {
            if (fila.get(i).tipo.equals("normal")) return i;
        }
        return -1;
    }

    private static String filaToString(LinkedList<Cliente> fila) {
        StringBuilder sb = new StringBuilder();
        for (Cliente c : fila) sb.append(c.toString()).append("\n");
        return sb.toString();
    }
}*/