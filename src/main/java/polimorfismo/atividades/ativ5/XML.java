package polimorfismo.atividades.ativ5;

public class XML implements IExportar{
    @Override
    public void exportar(String dados) {
        System.out.println("os dados : " + dados +
                "\nforam importados com sucesso no seu XML");
    }
}
