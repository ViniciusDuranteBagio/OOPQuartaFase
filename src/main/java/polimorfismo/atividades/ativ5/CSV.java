package polimorfismo.atividades.ativ5;

public class CSV implements IExportar{
    @Override
    public void exportar(String dados) {
        System.out.println("os dados : " + dados +
                "\nforam importados com sucesso no seu CSV");
    }
}
