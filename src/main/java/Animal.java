public abstract class Animal {

    private String nome;
    private int idade;
    private String raca;

    //-- Construtores --\\

    //utilizei direto os setters para que a validação já seja feita aqui e não precise duplicar meu código de exception
    public Animal(String nome, int idade, String raca)  throws ValidacaoException {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    //-- Métodos Get e Set --\\
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ValidacaoException("Nome inválido! Informe um nome com pelo menos 2 letras.");
        }

        String nomeLimpo = nome.trim();

        if (nomeLimpo.length() < 2) {
            throw new ValidacaoException("Nome muito curto! Deve conter no mínimo 2 letras.");
        }

        //os comandos abaixo aprendi com uso do chatGPT, entendi seus conceitos e utilizei no código
        if (!nomeLimpo.matches("^[A-Za-zÀ-ÿ ]+$")) {
            throw new ValidacaoException("Nome inválido! Use apenas letras e espaços.");
        }
        this.nome = nome;
    }


    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade Inválida: a idade deve ser maior que zero.");
        }
        this.idade = idade;
    }


    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça Inválida! Informe uma raça existente.");
        }
        this.raca = raca;
    }
    ////////////////////////////////////////////////
// Metodo abstrato para polimorfismo
   public abstract String[] getDoencasComuns();
//   @Override
//   public String toString() {
//        return "Nome: " + nome + ", Idade: " + idade + ", Raça: " + raca;
//    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", Raça: " + raca;
    }


}
