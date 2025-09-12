package polimorfismo.atividades.ativ6;

public class main {
    public static void main(String[] args) {

        IValidador cpf = new CPF();
        IValidador cnpj = new CNPJ();
        IValidador email = new Email();

        System.out.println(cpf.validar("78915678778"));
        System.out.println();
        System.out.println(cnpj.validar("1894984-47"));
        System.out.println();
        System.out.println(email.validar("dwadfwa@fes"));

    }
}
