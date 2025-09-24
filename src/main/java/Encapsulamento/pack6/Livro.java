package Encapsulamento.pack6;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPub;

    public Livro(String titulo, String autor, int anoPub){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
    }

    public Livro(){
        setTitulo(titulo);
        setAutor(autor);
        setAno(anoPub);
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int setAno(int i){
        return anoPub;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAnoPub(int anoPub){
        if (anoPub > 0){
            this.anoPub = anoPub;
        }else {
            System.out.println("erro: O ano de publicação da obra deve ser maior que zero.");
        }
    }
    public void exibirDetalhes(){
        System.out.println("Titulo da obra: " + titulo);
        System.out.println("Autor da obra: " + autor);
        System.out.println("Ano de publicação da obra: " + anoPub);
    }
}
