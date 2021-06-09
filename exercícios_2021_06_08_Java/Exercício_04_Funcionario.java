package exercícios_2021_06_08_Java;
/* Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto funcionário, defina as 
 * instancias deste objeto e apresente as informações deste objeto no 
 * console.
 * */



public class Exercício_04_Funcionario {
	
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
		System.out.println("===== Prontuário do Funcionário =====");
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + departamento);
		System.out.println("Cargo: " + cargo);
		System.out.println("Matrícula: " + matricula);
		System.out.println("=============== FIM ===============");
	}
			
}
