package Atividades_Aula_5.src;

public class PDF implements Exportador{
    @Override
    public void exportar() {
        System.out.println("O arquivo está sendo exportado em PDF");
    }
}