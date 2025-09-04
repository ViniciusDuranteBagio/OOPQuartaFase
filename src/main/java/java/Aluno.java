package java;

	public class Aluno extends Pessoa{
		
		protected String matricula;
		
		public Aluno(String nome, Integer idade, String matricula) {
			super(nome, idade);
			this.matricula = matricula;
		}

		public String getMatricula() {
			return matricula;
		}

		@Override
		public String toString() {
			return "Aluno " + getNome() + "\nIdade: " + getIdade() + "\nMatricula: " + getMatricula();
		}
		
		

}
