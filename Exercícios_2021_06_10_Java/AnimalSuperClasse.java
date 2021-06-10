package Exercícios_2021_06_10_Java;

public abstract class AnimalSuperClasse implements AnimalInter {

		private String nome;
		private String idade;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getIdade() {
			return idade;
		}
		public void setIdade(String idade) {
			this.idade = idade;
		}
		
}
