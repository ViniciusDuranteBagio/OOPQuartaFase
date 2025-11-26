import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        if (!agenda.validarAcesso()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Acesso negado! Encerrando o sistema.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }

        Musica musica = new Musica(1.0f);
        musica.loop();

        MenuPrincipal.criarMenu(agenda, musica);
    }
}
