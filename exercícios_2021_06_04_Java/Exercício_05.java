package exerc�cios_2021_06_04_Java;

/* Crie um programa que leia um n�mero do teclado at� que encontre um n�mero 
 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class Exerc�cio_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um n�mero: " );
			numero = entrada.nextInt();
			soma = soma + numero;
		}
		while (numero != 0); 	
		System.out.println("A soma dos n�meros digitados s�o:  " + soma );
	
		entrada.close();
	
	}
				
}