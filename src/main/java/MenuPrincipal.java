import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;
import java.io.File;
import javax.sound.sampled.*;

public class MenuPrincipal {


    public static void criarMenu(Agenda agenda, Musica musica) {
        JFrame frame = new JFrame("Sistema de Agenda Veterinária");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                if (confirmarFechar()) System.exit(0);
            }
        });

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);

        Dimension tamanhoMinimo = new Dimension(900, 600);
        frame.setMinimumSize(tamanhoMinimo);

        frame.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                int largura = Math.max(frame.getWidth(), tamanhoMinimo.width);
                int altura = Math.max(frame.getHeight(), tamanhoMinimo.height);
                frame.setSize(largura, altura);
            }
        });

        ImageIcon iconeMenu = new ImageIcon("src/assets/icons8-pegada-de-cachorro-32.png");
        frame.setIconImage(iconeMenu.getImage());

        JLabel lblContador = new JLabel();
        lblContador.setFont(new Font("Arial", Font.BOLD, 20));
        lblContador.setForeground(Color.BLACK);
        lblContador.setText("<html>CONSULTAS<br>" + agenda.getNumeroConsultas() + " / 10</html>");

        JPanel painelContador = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelContador.setBackground(new Color(240, 248, 255));
        painelContador.add(lblContador);

        ImageIcon gifIcon = new ImageIcon("src/assets/gifbb.gif");
        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gifLabel.setVerticalAlignment(SwingConstants.CENTER);

        JPanel painelGif = new JPanel(new BorderLayout());
        painelGif.add(gifLabel, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(20, 0, 20, 0);

        JButton btnCadastrar = criarBotaoEstilizado("Cadastrar Consulta", _ -> {
            tocarSom();
            agenda.cadastrarConsulta();
            lblContador.setText("<html>CONSULTAS<br>" + agenda.getNumeroConsultas() + " / 10</html>");
        });

        JButton btnListar = criarBotaoEstilizado("Listar Consultas", _ -> {
            tocarSom();
            agenda.listarConsultas();
            lblContador.setText("<html>CONSULTAS<br>" + agenda.getNumeroConsultas() + " / 10</html>");
        });

        JButton btnSom = criarBotaoEstilizado("Som", _ -> {
            tocarSom();
            musica.menuSom(painelGif);
        });

        JButton btnSair = criarBotaoEstilizado("Sair", _ -> {
            tocarSom();
            if (confirmarFechar()) System.exit(0);
        });

        gbc.gridy = 0;
        painelBotoes.add(btnCadastrar, gbc);
        gbc.gridy = 1;
        painelBotoes.add(btnListar, gbc);
        gbc.gridy = 2;
        painelBotoes.add(btnSom, gbc);
        gbc.gridy = 3;
        painelBotoes.add(btnSair, gbc);

        JPanel painelHorizontal = new JPanel(new GridLayout(1, 2));
        painelHorizontal.add(painelGif);
        painelHorizontal.add(painelBotoes);

        JPanel painelPrincipal = new JPanel(new BorderLayout());
        painelPrincipal.add(painelContador, BorderLayout.NORTH);
        painelPrincipal.add(painelHorizontal, BorderLayout.CENTER);

        JLabel lblDataHora = new JLabel();
        lblDataHora.setFont(new Font("Arial", Font.BOLD, 20));
        lblDataHora.setForeground(Color.BLACK);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");

        Timer relogio = new Timer(1000, _ -> {
            String agora = LocalDateTime.now().format(formato);
            lblDataHora.setText(" " + agora);
        });
        relogio.start();

        JPanel painelInferior = new JPanel(new BorderLayout());
        painelInferior.setBackground(new Color(240, 248, 255));
        painelInferior.add(lblDataHora, BorderLayout.WEST);

        painelPrincipal.add(painelInferior, BorderLayout.SOUTH);

        frame.setContentPane(painelPrincipal);
        frame.setVisible(true);

        painelGif.setVisible(musica.getVolume() > 0);

        Timer verificarDia = new Timer(1000, _ -> {
            LocalDate hoje = LocalDate.now();
            if (!hoje.equals(agenda.getUltimaData())) {
                agenda.limparConsultasParaNovoDia();
                lblContador.setText("<html>CONSULTAS<br>0 / 10</html>");
            }
        });
        verificarDia.start();
    }

    private static boolean confirmarFechar() {
        Object[] opcoes = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Você realmente deseja fechar o sistema?",
                "Confirmar Saída",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[1]
        );
        return escolha == 0;
    }

    private static JButton criarBotaoEstilizado(String texto, java.awt.event.ActionListener acao) {
        JButton botao = new JButton(texto) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getModel().isRollover() ? new Color(65, 105, 225) : new Color(30, 144, 255));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
                g2.dispose();
                super.paintComponent(g);
            }
        };

        Dimension tamanho = new Dimension(400, 90);
        botao.setMaximumSize(tamanho);
        botao.setPreferredSize(tamanho);
        botao.setMinimumSize(tamanho);

        botao.setFont(new Font("Arial", Font.BOLD, 24));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setContentAreaFilled(false);
        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botao.addActionListener(acao);
        botao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        botao.addMouseListener(new java.awt.event.MouseAdapter() {
            private boolean hoverTocado = false;

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                if (!hoverTocado) {
                    tocarSomHover();
                    hoverTocado = true;
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                hoverTocado = false;
            }
        });

        return botao;
    }

    private static void tocarSom() {
        try {
            File arquivoSom = new File("src/assets/somdebotaowav.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoSom);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.err.println("Erro ao tocar som: " + e.getMessage());
        }
    }

    private static void tocarSomHover() {
        try {
            File arquivoSom = new File("src/assets/sombotaogta.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoSom);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.err.println("Erro ao tocar som de hover: " + e.getMessage());
        }
    }


}
