import javax.swing.*;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido, insira um valor válido");
        } else {
            this.anoPublicacao = anoPublicacao;
        }
    }
    public void exibirDetalhes(){
        JOptionPane.showMessageDialog(null, "O livro " + titulo + " publicado por " + autor
                + " foi publicado em " + anoPublicacao);
    }
}
