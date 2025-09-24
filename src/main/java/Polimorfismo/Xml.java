package Polimorfismo;

public class Xml implements  Arquivos{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando arquivo Xml " + dados);
    }
}
