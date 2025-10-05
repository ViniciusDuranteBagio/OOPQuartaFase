package Aula05;

public class Xml implements Arquivos {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando arquivo " + dados + ".xml");
    }
}
