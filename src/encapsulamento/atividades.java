package encapsulamento;

public class atividades {


    /* conta bancaria

    public atividades(int numeroConta){
        this.numeroConta = numeroConta;
    }
    private int numeroConta;
    private double saldo;
    private String titular;


    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }




    public void depositar(double valor){
        saldo += valor;
        System.out.println(saldo + " foi adicionado na conta " + numeroConta + " da pessoa " + titular);
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("saldo insuficiente");
        }else {
            saldo -= valor;
            System.out.println(valor + " foi removido da conta " + numeroConta + " da pessoa " + titular);
        }
    }

    public void exibirSaldo(){
        System.out.println("seu saldo é de : " + saldo);
    }

     */

    /* construtores

    private String nome;
    private int idade;
    private int cpf;

    public atividades(String nome, int idade, int cpf){
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public int getCpf(){
        return cpf;
    }

     */

    /* encapsulamento e validação

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        System.out.println("nome : " + nome);
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        }else {
            System.out.println("preço invalido");
        }
    }

    public int getQuantidadeEmEstoque(){
        return  quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0){
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }else {
            System.out.println("erro, quantidade menor que zero");
        }
    }


    public void adicionarEstoque(int quantidade){
        quantidadeEmEstoque += quantidade;
        System.out.println("quantidade adicionada " + quantidade);
    }

    public void vender(int quantidade){
        quantidadeEmEstoque -= quantidade;
        System.out.println("quantidade removida : " + quantidade);
    }

     */

    /* construtor e encapsulamento

    private String nome;
    private int matricula;
    private double nota;

    public atividades(String nome, int matricula){
        this.nota = 0;
        this.nome = nome;
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }else {
            System.out.println("nota invalida");
        }
    }

    public void exibirStatus(){
        System.out.println("nome : " + nome +
                "\nmatricula : " + matricula +
                "\nnota : " + nota);
    }

     */

    /* encapsulamento e metodos

    private double largura;
    private double altura;

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("ERRO!");
        }
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void calcularArea(){
        double area = 0;
        area = largura * altura;
        System.out.println("area : " + area);
    }

    public void calcularPerimetro(){
        double perimetro = 0;
        perimetro = 2 * (altura * largura);
        System.out.println("perimetro : " + perimetro);
    }

     */

    /* construtor e encapsulamento avançado */

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public atividades(String titulo, String autor, int anoPublicacao){
        this.autor = autor;
        this.titulo = titulo;

        if (anoPublicacao > 0){
            this.anoPublicacao  = anoPublicacao;
        }else {
            System.out.println("data invalida");
            this.anoPublicacao = 0;
        }
    }

    public void exibirDetalhes(){
        System.out.println("nome : " + titulo +
                "\nautor : " + autor +
                "\nano de publicação : " + anoPublicacao);

    }
}
