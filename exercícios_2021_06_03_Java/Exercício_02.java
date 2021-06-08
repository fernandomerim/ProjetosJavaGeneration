package exercícios_2021_06_03_Java;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.
	
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3;
		
		System.out.println("Números em ordem crescente");
		System.out.println("**************************");
		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		numero3 = entrada.nextInt();
		
		if (numero1 <= numero2 && numero2 <= numero3) {
		System.out.println("A sequência numérica em ordem crescente é : " + numero1 + ", " + numero2 + ", " + numero3);
	
	}
		
		else if (numero1 >= numero2 && numero1 <= numero3) {
		System.out.println("A sequência numérica em ordem crescente é : " + numero2 + ", " + numero1 + ", " + numero3);
	}
	
		else if (numero3 <= numero2 && numero3 <= numero1) {
			System.out.println("A sequência numérica em ordem crescente é : " + numero3 + ", " + numero2 + ", " + numero1);
		}
		
		entrada.close();
	
	}
}
