package exerc�cios_2021_06_08_Java;
/* Crie uma classe funcion�rio e apresente os atributos e m�todos 
 * referentes esta classe, em seguida crie um objeto funcion�rio, defina as 
 * instancias deste objeto e apresente as informa��es deste objeto no 
 * console.
 * */



public class Exerc�cio_04_Funcionario {
	
	private String nome;
	private String departamento;
	private String cargo;
	private int matricula;
		
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	public void Informacao () {
		System.out.println("===== Prontu�rio do Funcion�rio =====");
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + departamento);
		System.out.println("Cargo: " + cargo);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("=============== FIM ===============");
	}
			
}
