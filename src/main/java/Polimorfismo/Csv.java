package Polimorfismo;

public class Csv implements Arquivos {
    @Override
    public void exportar(String dados) {
        System.out.println("Exportando arquivo CSV " + dados);

    }
}
