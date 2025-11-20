public class AgendaVeterinario {

    private Consulta[] consultas = new Consulta[10];
    private int total = 0;

    public void adicionar(Consulta c) throws ValidacaoException {
        if (total == 10) {
            throw new ValidacaoException("A agenda já está cheia.");
        }
        consultas[total] = c;
        total++;
    }

    public void listar() {
        if (total == 0) {
            System.out.println("Nenhuma cadastrada ainda");
            return;
        }

        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + " - " + consultas[i]);
        }
    }
}
