package encapsulamento;

public class person {

    private int age;
    private String name;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // SET para crir e pegar o valor  coloca o dado
    // GET para retornar o valor, imprimir   pega o dado

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("idade invalida");
        }
    }
}
