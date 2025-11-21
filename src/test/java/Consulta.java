public class Consulta {
    private Animal animal;
    private TipoAtendimento tipo;
    private String doenca;
    public Consulta(Animal animal, TipoAtendimento tipo, String doenca) throws ValidacaoException {
        if(animal==null) throw new ValidacaoException("Animal nulo");
        if(tipo==null) throw new ValidacaoException("Tipo obrigatorio");
        if(tipo==TipoAtendimento.CONSULTA){
            if(doenca==null || doenca.trim().isEmpty()) throw new ValidacaoException("Doenca obrigatoria para consulta");
        }
        this.animal = animal;
        this.tipo = tipo;
        this.doenca = (doenca==null? "" : doenca);
    }
    public Animal getAnimal(){return animal;}
    public TipoAtendimento getTipo(){return tipo;}
    public String getDoenca(){return doenca;}
    @Override public String toString(){
        String base = animal.getNome() + " - " + animal.getRaca() + " - " + animal.getIdade() + " anos - " + tipo;
        if(tipo==TipoAtendimento.CONSULTA) base += " - Doenca: " + doenca;
        return base;
    }
}
