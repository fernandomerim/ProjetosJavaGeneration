package exerc�cios_2021_06_08_Java;
/* Crie uma classe funcion�rio e apresente os atributos e m�todos 
 * referentes esta classe, em seguida crie um objeto funcion�rio, defina as 
 * instancias deste objeto e apresente as informa��es deste objeto no 
 * console.
 * */

import java.util.Scanner;

public class Exerc�cio_04_TesteFuncion�rio {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		Exerc�cio_04_Funcionario funcionario = new Exerc�cio_04_Funcionario ();
		
		System.out.println("Digite o seu nome: ");
		funcionario.setNome(entrada.next());
		
		System.out.println("Digite o seu departamento: ");
		funcionario.setDepartamento(entrada.next());
		
		System.out.println("Digite o seu cargo: ");
		funcionario.setCargo(entrada.next());
		
		System.out.println("Digite a sua matr�cula: ");
		funcionario.setMatricula(entrada.nextInt());
				
		funcionario.Informacao();
		
		entrada.close();
	
	}

}
