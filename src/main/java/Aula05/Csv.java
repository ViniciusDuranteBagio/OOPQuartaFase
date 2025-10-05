package Aula05;

public class Csv implements Arquivos {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando arquivo " + dados + ".csv");
    }
}
