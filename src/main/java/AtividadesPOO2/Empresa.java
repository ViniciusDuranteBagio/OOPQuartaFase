package AtividadesPOO2;
//Atividade10 HerançaAula04
public class Empresa {
    private String nome;
    private String cidade;
    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void exibirInfo() {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Cidade: " + cidade);
    }
}

    class Loja extends Empresa {
    private String tipoDeProduto;
    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }
    public String getTipoDeProduto() {
        return tipoDeProduto;
    }
    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de Produto: " + tipoDeProduto);
        System.out.println("-------------------------");
    }
}