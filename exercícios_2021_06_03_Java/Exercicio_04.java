package exercícios_2021_06_03_Java;
/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
 * ímpar exiba o número elevado ao quadrado.
 */

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
				
		double numero;

		System.out.println("Digite um número: ");
		numero = entrada.nextDouble();
		
		if (numero %2 == 0) {
			System.out.println("Seu número é par");
			System.out.printf("A raiz do seu número é: " + Math.sqrt(numero),2);
		}
			else { 
			System.out.println("Seu número é ímpar");
			System.out.printf("A raiz do seu número é: " + Math.pow(numero,2));
		}
	entrada.close();	
	}

}
