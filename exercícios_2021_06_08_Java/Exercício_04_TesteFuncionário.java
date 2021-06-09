package exercícios_2021_06_08_Java;
/* Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto funcionário, defina as 
 * instancias deste objeto e apresente as informações deste objeto no 
 * console.
 * */

import java.util.Scanner;

public class Exercício_04_TesteFuncionário {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		Exercício_04_Funcionario funcionario = new Exercício_04_Funcionario ();
		
		System.out.println("Digite o seu nome: ");
		funcionario.setNome(entrada.next());
		
		System.out.println("Digite o seu departamento: ");
		funcionario.setDepartamento(entrada.next());
		
		System.out.println("Digite o seu cargo: ");
		funcionario.setCargo(entrada.next());
		
		System.out.println("Digite a sua matrícula: ");
		funcionario.setMatricula(entrada.nextInt());
				
		funcionario.Informacao();
		
		entrada.close();
	
	}

}
