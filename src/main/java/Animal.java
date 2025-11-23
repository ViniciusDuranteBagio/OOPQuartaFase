public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || nome.trim().length() < 2) {
            throw new ValidacaoException("Nome deve ter pelo menos 2 caracteres.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser maior que 0.");
        }
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raca deve ser informada.");
        }
        this.raca = raca;
    }

    protected java.util.List<String> criarListaDoencas(String... doencas) {
        java.util.List<String> list = new java.util.ArrayList<>();
        for (String doenca : doencas) {
            list.add(doenca);
        }
        return list;
    }

    public abstract java.util.List<String> getCommonDiseases();


    public String escolherDoenca() {
        java.util.List<String> diseases = getCommonDiseases();
        StringBuilder mensagem = new StringBuilder("Escolha a doenca:\n");
        for (int i = 0; i < diseases.size(); i++) {
            mensagem.append(i + 1).append(" - ").append(diseases.get(i)).append("\n");
        }
        String opcao = javax.swing.JOptionPane.showInputDialog(mensagem.toString());
        int indice = Integer.parseInt(opcao) - 1;
        return diseases.get(indice);
    }
}
