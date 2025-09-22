public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("João", 20, "2023001");
        System.out.println(a.getNome() + " - " + a.getIdade() + " anos - Matrícula: " + a.getMatricula());

        Carro c = new Carro("Toyota", "Corolla", 4);
        System.out.println(c.getMarca() + " " + c.getModelo() + " - Portas: " + c.getQuantidadeDePortas());

        Moto m = new Moto("Honda", "CB500", 500);
        System.out.println(m.getMarca() + " " + m.getModelo() + " - Cilindrada: " + m.getCilindrada());

        Cachorro dog = new Cachorro("Rex", 3);
        dog.exibirInformacoes();
        dog.dormir();
        dog.latir();
        dog.brincar();

        Gerente g = new Gerente("Maria", 5000, "Vendas");
        g.aumentarSalario(10);
        System.out.println("Gerente: " + g.getNome() + " - Salário: " + g.getSalario() + " - Dept: " + g.getDepartamento());

        Eletronico e = new Eletronico("Celular", 2000, 12);
        e.exibirDetalhes();

        ContaCorrente cc = new ContaCorrente("Ana", 1500, 25);
        System.out.println("Conta Corrente - Titular: " + cc.getTitular() + " - Saldo: " + cc.getSaldo() + " - Taxa: " + cc.getTaxaManutencao());

        ContaPoupanca cp = new ContaPoupanca("Carlos", 2000, 0.5);
        System.out.println("Conta Poupança - Titular: " + cp.getTitular() + " - Saldo: " + cp.getSaldo() + " - Juros: " + cp.getTaxaJuros());

        Guerreiro gw = new Guerreiro("Thor", 50, 100);
        System.out.println("Guerreiro: " + gw.getNome() + " - Nível: " + gw.getNivel() + " - Força: " + gw.getForca());

        Mago mg = new Mago("Gandalf", 80, 200);
        System.out.println("Mago: " + mg.getNome() + " - Nível: " + mg.getNivel() + " - Mana: " + mg.getMana());

        Loja l = new Loja("Tech Store", "São Paulo", "Eletrônicos");
        System.out.println("Loja: " + l.getNome() + " - Cidade: " + l.getCidade() + " - Tipo: " + l.getTipoDeProduto());
    }
}
