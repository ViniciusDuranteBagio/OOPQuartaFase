package Aula5;

public abstract class Exportador {
    public abstract void exportar(String dados);

    public interface Exportador {
        void exportar(String dados);
    }
}
