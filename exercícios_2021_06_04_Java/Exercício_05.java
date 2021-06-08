package exercícios_2021_06_04_Java;

/* Crie um programa que leia um número do teclado até que encontre um número 
 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class Exercício_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um número: " );
			numero = entrada.nextInt();
			soma = soma + numero;
		}
		while (numero != 0); 	
		System.out.println("A soma dos números digitados são:  " + soma );
	
		entrada.close();
	
	}
				
}