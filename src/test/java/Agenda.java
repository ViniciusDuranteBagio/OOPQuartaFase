import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private final int LIMITE = 10;
    private List<Consulta> consultas = new ArrayList<>();
    public void adicionar(Consulta c) throws ValidacaoException {
        if(consultas.size() >= LIMITE) throw new ValidacaoException("Agenda cheia");
        if(c==null) throw new ValidacaoException("Consulta nula");
        consultas.add(c);
    }
    public List<Consulta> listar(){ return new ArrayList<>(consultas); }
    public int tamanho(){ return consultas.size(); }
}

