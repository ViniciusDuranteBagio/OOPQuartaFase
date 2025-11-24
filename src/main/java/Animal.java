public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    private boolean valido = true;
    private String erro = "";

    public Animal(String nome, int idade, String raca) {

        if (!validarNome(nome)) {
            valido = false;
            erro = "Nome inválido! Deve ter ao menos 2 letras e só pode conter letras e espaços.";
        } else if (idade <= 0) {
            valido = false;
            erro = "Idade deve ser maior que 0.";
        } else if (raca.isEmpty()) {
            valido = false;
            erro = "Raça não pode ser vazia.";
        }

        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    // Validação simples – SEM REGEX:
    private boolean validarNome(String nome) {
        if (nome.length() < 2) {
            return false;
        }

        for (char c : nome.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }

        return true;
    }

    public boolean isValido() {
        return valido;
    }

    public String getErro() {
        return erro;
    }

    public abstract String[] getDoencas();

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }
}