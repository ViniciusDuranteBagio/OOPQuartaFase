import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int inputUsuario1 = -1;
        int animal = -1;
        int tipoServico= -1;

        ArrayList<String> agenda =  new ArrayList<>(10);

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Coelho coelho = new Coelho();
        Consulta consulta = new Consulta();

        String menu1 = "--- Menu ---\n" +
                "1- Cadastrar animal para consulta\n" +
                "2- Listar consultas\n" +
                "0- Sair do sistema";

        String menu2 = "Selecione o animal para ser cadastrado\n" +
                "1- Cachorro\n" +
                "2- Gato\n" +
                "3- Coelho\n" +
                "0- Voltar para o menu";

        String menu3 = "Selecione o tipo de serviço\n" +
                "1- Banho\n" +
                "2- Banho e Tosa\n" +
                "3- Tosa\n" +
                "4- Consulta\n";

        while (inputUsuario1 != 0 || animal != 0 || tipoServico != 0) {

            inputUsuario1 = Integer.parseInt(JOptionPane.showInputDialog(menu1));

            if (inputUsuario1 == 1) {
                animal = Integer.parseInt(JOptionPane.showInputDialog(menu2));

                if (animal == 1) {
                    cachorro.setNome(JOptionPane.showInputDialog("Digite o nome do(a) cachorro(a)"));
                    cachorro.setIdade(Double.parseDouble(JOptionPane.showInputDialog("Digite a idade do(a) cachorro(a)")));
                    cachorro.setRaca(JOptionPane.showInputDialog(("Digite a raça do(a) cachorro(a)")));
                }
                else if (animal == 2) {
                    gato.setNome(JOptionPane.showInputDialog("Digite o nome do(a) gato(a)"));
                    gato.setIdade(Double.parseDouble(JOptionPane.showInputDialog("Digite a idade do(a) gato(a)")));
                    gato.setRaca(JOptionPane.showInputDialog(("Digite a raça do(a) gato(a)")));
                }
                else if (animal == 3) {
                    coelho.setNome(JOptionPane.showInputDialog("Digite o nome do(a) coelho(a)"));
                    coelho.setIdade(Double.parseDouble(JOptionPane.showInputDialog("Digite a idade do(a) coelho(a)")));
                    coelho.setRaca(JOptionPane.showInputDialog(("Digite a raça do(a) coelho(a)")));
                }
            } else if (inputUsuario1 == 2) {
                if (agenda.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada.");
                }
            } else if (inputUsuario1 == 0) {
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,"Número inválido");
            }
        }
    }
}