public class Agenda {

    private Consulta[] consultas = new Consulta[10];
    private int quantidade = 0;

    public void adicionarConsulta(Consulta consulta) throws ValidacaoException {

        //Verifica agenda cheia
        if (quantidade == consultas.length) {
            throw new ValidacaoException("A agenda está cheia! Máximo de 10 consultas atingido.");
        }

        consultas[quantidade] = consulta;
        quantidade++;
    }

    public void listarConsultas() {
        if (quantidade == 0) {
            System.out.println("Nenhuma consulta cadastrada.");
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Consulta " + (i + 1) + ": " + consultas[i].toString());
        }
    }

    // fiz esse metodo para mostrar no menu a quantidade de consultas atuais
    public int getConsultasCadastradas() {
        return quantidade;
    }

}
