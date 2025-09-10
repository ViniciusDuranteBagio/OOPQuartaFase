package encapsulamento;

public class main {
    public static void main(String[] args) {

        //metodos

    contaBancaria conta = new contaBancaria();
    conta.atribuirSaldo(100);
        System.out.println(conta.verSaldo());


        //get e set

        person pessoa = new person();
        pessoa.setAge(5);
        System.out.println(pessoa.getAge());

        pessoa.setName("sabao");
        System.out.println(pessoa.getName());

    }

}
