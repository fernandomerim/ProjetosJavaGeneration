package exerc�cios_2021_06_08_Java;

/* Crie uma classe cliente e apresente os atributos e m�todos referentes 
 * esta classe, em seguida crie um objeto cliente, defina as instancias deste 
 * objeto e apresente as informa��es deste objeto no console.
 */

public class Exerc�cio_01_TesteCliente {

	public static void main(String[] args) {
		
		Exerc�cio_01_Cliente cliente = 	new Exerc�cio_01_Cliente(); //objeto criado
		
		cliente.setNomeCliente("Janaina");
		cliente.setProfissao("Contadora");
		cliente.setIdade(29);
		cliente.setNumeroCPF(123456789);
		cliente.setTelefoneContato(99999123);
		
		System.out.println("Nome: "+ cliente.getNomeCliente());
		System.out.println("Profiss�o: "+ cliente.getProfissao());
		System.out.println("Idade: "+ cliente.getIdade());
		System.out.println("CPF: "+ cliente.getNumeroCPF());
		System.out.println("Telefone: "+ cliente.getTelefoneContato());
	
	}
	
	
	
}