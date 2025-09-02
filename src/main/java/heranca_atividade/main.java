package heranca_atividade;

public class main {
    public static void main(String[] args) {


        /* atividade 1
        Aluno aluno = new Aluno();
        aluno.idade = 20;
        aluno.matricula = 15876;
        aluno.nome = "Cauã";

        System.out.println("nome : " + aluno.nome +
                "\n idade : " + aluno.idade +
                "\n matricula : " + aluno.matricula);

         */

        /* atividade 2
        Aluno aluno1 = new Aluno("Cauã", 20, 78651);
        System.out.println(aluno1.nome+ "\n" + aluno1.idade + "\n" + aluno1.matricula);

         */

        Carro car = new Carro();
        car.marca = "fiat";
        car.modelo = "argo";
        car.qtdPortas = 4;

        System.out.println(car.marca + "\n" + car.modelo + "\n" + car.qtdPortas);

        Moto moto = new Moto();
        moto.marca = "honda";
        moto.modelo = "cg";
        moto.qtdCc = 124.99;

        System.out.println(moto.marca + "\n" + moto.modelo + "\n" + moto.qtdCc);



    }
}
