package Aula5Atividades;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Programador p1 = new Programador();
//        p1.trabalhar();
//        p1.descansar();

//        Caixa<String> caixa1 = new Caixa<>();
//        caixa1.guardar("Bom dia Pessoal");
//        System.out.println(caixa1.pegar());
//
//        Caixa<Integer> caixa2 = new Caixa<>();
//        caixa2.guardar(752);
//        System.out.println(caixa2.pegar());
//
//        Caixa<Programador> caixa3 = new Caixa<>();
//        caixa3.guardar(new Programador());
//        caixa3.pegar().trabalhar();

//        System.out.println("====== ATIVIDADE 1 - FUNCIONÁRIO ======");
//        List<Funcionario> func = new ArrayList<>();
//
//        func.add(new Gerente("Evelyn", 5000));
//        func.add(new Desenvolvedor("João", 3500));
//        func.add(new Estagiando("Maria", 1200));
//
//        for (Funcionario f : func) {
//            f.exibirOsDados();
//        }

        System.out.println("====== ATIVIDADE 2 - Veículos ======");
        Car carro = new Car ("FJD-2341", "Gol");
        Motorcicle moto = new Motorcicle ("OLT-1212", "Harley Davidson");
        Truck caminhao = new Truck ("BND-1594", "Volvo FH", 90, 4.72);

        List<Veiculos> vehicles = new ArrayList<>();
        vehicles.add(carro);
        vehicles.add(moto);
        vehicles.add(caminhao);

        for (Veiculos veiculos : vehicles) {
            veiculos.ligarMotor();
            veiculos.abasteca();
            System.out.println("Consumo médio " + veiculos.calcularConsumo() + "km/L");
            System.out.println("\n");
        }
    }
}
