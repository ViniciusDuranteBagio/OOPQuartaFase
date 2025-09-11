package Aula5Atividades;

public class Caixa<T>{
    private T conteudo;

    public void guardar(T valor){
        this.conteudo = valor;
    }
    public T pegar(){
        return conteudo;
    }
}
