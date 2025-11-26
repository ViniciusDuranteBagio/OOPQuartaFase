public class Consulta {
    private Animal animal;
    private String TPatendimentos;
    private String doenças;

    public Consulta(String TPatendimentos,String doenças,Animal animal){
        this.animal= animal;
        this.TPatendimentos=TPatendimentos;
        this.doenças=doenças;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public String getTPatendimentos() {
        return TPatendimentos;
    }
    public void setTPatendimentos(String TPatendimentos) {
        this.TPatendimentos =TPatendimentos;
    }
    public String getDoenças() {
        return doenças;
    }
    public void setDoenças(String doenças) {
        this.doenças = doenças;
    }
    @Override
    public String toString(){
        return "Animal : "+animal.getnome()+" / "+animal.getClass().getSimpleName()+
                "\nIdade: "+animal.getidade()+ "  Raça: "+animal.getRaça()+
                "\nTipo : "+TPatendimentos+ " Doença/Motivo: " + doenças;
    }
}
