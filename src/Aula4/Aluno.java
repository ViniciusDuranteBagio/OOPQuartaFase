package Aula4;

public class Aluno extends Pessoa {
    private String matricula;
    
    // Construtor padrão
    public Aluno() {
        super();
    }
    
    // Construtor com super()
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    
    // Getter e Setter para matrícula
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /*
    Esse override ser para garantir que a função exibirInformacoes,
    que está sendo criada na classe Aluno (classe filha/ subclasse) tambem exista na classe Pessoa (classe Pai / SuperClasse)
    com essa anotação @Override, estamos garantindo que se a gente escrever o nome do metodo errado,
    como por exemplo: exibirInformacoess (com dois ss no fim), vai lançar um erro dizendo que a função não exista na classe pai,
    desse modo garantindo que não estamos criando uma nova função no filho e sim sobreescrevendo o que a função da classe pai faz.
    O que seria esse sobreescrever ?
    R = É literalmente alterar o funcionamento de uma função, escrever por cima do que a função original faz,
    ou seja, ignorar a função original e seguir essa da classe filha caso ela exista.
    Se não existir na filha vai puxar da classe pai.
    */
    @Override
    // Sobrescrevendo o método da superclasse
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + this.matricula);
    }
} 