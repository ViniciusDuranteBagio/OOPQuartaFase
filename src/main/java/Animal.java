public abstract class Animal {
    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed) throws ValidacaoException {
        setName(name);
        setAge(age);
        setBreed(breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ValidacaoException {
        if (name == null || name.trim().length() < 2) {
            throw new ValidacaoException("Nome deve ter pelo menos 2 caracteres.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ValidacaoException {
        if (age < 0) {
            throw new ValidacaoException("Idade deve ser maior que 0.");
        }
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) throws ValidacaoException {
        if (breed == null || breed.trim().isEmpty()) {
            throw new ValidacaoException("Raca deve ser informada.");
        }
        this.breed = breed;
    }

    protected java.util.List<String> createDiseaseList(String... diseases) {
        java.util.List<String> list = new java.util.ArrayList<>();
        for (String disease : diseases) {
            list.add(disease);
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
