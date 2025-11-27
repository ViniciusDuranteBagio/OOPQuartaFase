public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;
    protected String[] doencas;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        validarNome(nome);
        validarIdade(idade);
        validarRaca(raca);
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ValidacaoException {
        validarNome(nome);
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws ValidacaoException {
        validarIdade(idade);
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) throws ValidacaoException {
        validarRaca(raca);
        this.raca = raca;
    }

    public String[] getDoencas() {
        return doencas;
    }

    public boolean isDoencaValida(String doenca) {
        if (doencas == null) {
            return false;
        }
        for (String d : doencas) {
            if (d.equalsIgnoreCase(doenca)) {
                return true;
            }
        }
        return false;
    }

    private void validarNome(String nome) throws ValidacaoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ValidacaoException("Nome nao pode ser vazio, teu bixo nao tem nome nao?");
        }
        if (nome.trim().length() < 2) {
            throw new ValidacaoException("Nome deve ter no minimo 2 caracteres, ou vai dizer q essa coisa ai se chama 'x'?");
        }
        for (char c : nome.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                throw new ValidacaoException("Nome deve conter apenas letras e espacos, ta achando q é o elon musk pra por letras estranhas?");
            }
        }
    }

    private void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser um numero inteiro positivo maior que zero, ta tentando tirar com a minha cara colocando 0 ou menos ne?");
        }
    }

    private void validarRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raca deve ser informada, mesmo ele parecendo uma mistura meio estranha de vaca com cavalo.");
        }
    }

    @Override
    public String toString() {
        return nome + " | " + idade + " anos | " + raca;
    }
}


