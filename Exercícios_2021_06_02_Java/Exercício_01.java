package Exerc�cios_2021_06_02_Java;

/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos,
* meses e dias e mostre-a expressa apenas em dias. 
*/

import java.util.Scanner;

public class Exerc�cio_01 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int idade, meses, anos, dias;
		
		System.out.println("Sua idade convertida em dias");
		System.out.println("****************************");
		System.out.println("Qual a sua idade em anos: ");
		anos = entrada.nextInt();
		
		System.out.println("Qual a sua idade em meses: ");
		meses = entrada.nextInt();
		
		System.out.println("Qual a sua idade em dias: ");
		dias = entrada.nextInt();
		
		anos = anos * 360;
		meses = meses * 30;
		
		idade = anos + meses + dias;
		
		System.out.println("A sua idade convertida em dias � : " + idade);
		
		entrada.close();
	

	}

}
