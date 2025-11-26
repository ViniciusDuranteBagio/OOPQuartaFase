public class Consulta {

    private String tipoAtendimento;
    private String nomeCliente;
    private String nomePet;
    private String data;
    private String doenca;

    public Consulta(String tipoAtendimento, String nomeCliente, String nomePet, String data, String doenca) {
        this.tipoAtendimento = TipoAtendimento.fromString(tipoAtendimento);
        this.nomeCliente = nomeCliente;
        this.nomePet = nomePet;
        this.data = data;
        this.doenca = doenca;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = TipoAtendimento.fromString(tipoAtendimento);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        return "Consulta {" +
                "tipoAtendimento='" + tipoAtendimento + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", nomePet='" + nomePet + '\'' +
                ", data='" + data + '\'' +
                ", doenca='" + doenca + '\'' +
                '}';
    }
}


