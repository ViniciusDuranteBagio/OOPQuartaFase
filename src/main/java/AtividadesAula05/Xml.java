package AtividadesAula05;

public class Xml implements Exportadores {
    @Override
    public void exportar(String dados){
        System.out.println("Exportando dados para XML: " + dados);
    }
}
