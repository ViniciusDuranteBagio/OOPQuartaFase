import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Musica {

    private Clip clip;
    private float volumeAtual;
    private float volumeAnterior;
    private boolean musicaAtiva;

    public Musica(float volumeInicial) {
        this.volumeAtual = volumeInicial;
        this.volumeAnterior = volumeInicial;
        this.musicaAtiva = volumeInicial > 0;

        try {
            File arquivo = new File("src/assets/musicatopdotrabalho.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(arquivo);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao carregar música: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loop() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            setVolume(volumeAtual);
        }
    }

    public void setVolume(float v) {
        this.volumeAtual = v;
        if (v > 0) this.volumeAnterior = v;
        this.musicaAtiva = v > 0;

        if (clip != null) {
            try {
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                float dB = (float) (Math.log(v == 0 ? 0.0001 : v) / Math.log(10.0) * 20.0);
                gainControl.setValue(dB);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao ajustar volume: " + e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public float getVolume() {
        return volumeAtual;
    }

    @SuppressWarnings("unused")
    public boolean isAtiva() {
        return musicaAtiva;
    }

    public void menuSom(JPanel painelGif) {
        int sliderInicial = musicaAtiva ? (int) (volumeAtual * 100) : 0;
        JSlider sliderVolume = new JSlider(0, 100, sliderInicial);
        sliderVolume.setMajorTickSpacing(10);
        sliderVolume.setPaintTicks(true);
        sliderVolume.setPaintLabels(true);

        JCheckBox checkBoxMusica = new JCheckBox("Música", musicaAtiva);

        sliderVolume.addChangeListener(_ -> {
            if (!sliderVolume.getValueIsAdjusting()) {
                int valor = sliderVolume.getValue();
                if (valor == 0) {
                    checkBoxMusica.setSelected(false);
                    setVolume(0);
                } else {
                    if (!checkBoxMusica.isSelected()) checkBoxMusica.setSelected(true);
                    setVolume(valor / 100f);
                }
                painelGif.setVisible(valor > 0);
            }
        });

        checkBoxMusica.addActionListener(_ -> {
            if (checkBoxMusica.isSelected()) {
                setVolume(volumeAnterior);
                sliderVolume.setValue((int) (volumeAnterior * 100));
                musicaAtiva = true;
            } else {
                setVolume(0);
                sliderVolume.setValue(0);
                musicaAtiva = false;
            }
            painelGif.setVisible(musicaAtiva);
        });

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(Box.createVerticalStrut(10));
        checkBoxMusica.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        painel.add(checkBoxMusica);
        painel.add(Box.createVerticalStrut(10));
        sliderVolume.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        painel.add(sliderVolume);

        JOptionPane.showMessageDialog(null, painel, "Controle de Volume", JOptionPane.PLAIN_MESSAGE);
    }
}
