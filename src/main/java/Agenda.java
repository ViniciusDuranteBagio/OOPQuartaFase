
public class Agenda {

    private Consulta[] consultas = new Consulta[10]; // máximo de 10
    private int contador = 0; // quantas foram cadastradas

    public void adicionar(Consulta consulta) {
        if (contador == 10)
            throw new ValidacaoException("DEUUUUUU POR HOJE ACABOU O ESPAÇO!");

        consultas[contador] = consulta;
        contador++;
    }

    public boolean estaVazia() {
        return contador == 0;
    }

    public Consulta[] getConsultas() {
        return consultas;
    }
}
