package Exercícios_2021_06_02_Java;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias 
 * e mostre-a expressa em anos, meses e dias. 
 */

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, meses, anos, dias;
		
		System.out.println("Sua idade em dias convertida para anos e meses");
		System.out.println("************************");
		System.out.println("Qual a sua idade em dias: ");
		idade = entrada.nextInt();
		
		anos = idade / 365;
		meses = idade / 30;
		dias = idade;
		
		idade = anos + meses + dias;
		
		System.out.println("A sua idade em anos é : " + anos + " anos");
		System.out.println("A sua idade em meses é : " + meses + " meses");
		System.out.println("A sua idade em dias é : " + dias + " dias");
		
		entrada.close();
	
		
	}

}
