package Polimorfismo;

public class Pdf implements Arquivos{
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando arquivo PDF " + dados);

    }
}
