package exerc�cios_2021_06_03_Java;

import java.util.Scanner;

public class Exerc�cio_02 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3;
		
		System.out.println("N�meros em ordem crescente");
		System.out.println("**************************");
		System.out.println("Digite o 1� n�mero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		numero3 = entrada.nextInt();
		
		if (numero1 <= numero2 && numero2 <= numero3) {
		System.out.println("A sequ�ncia num�rica em ordem crescente � : " + numero1 + ", " + numero2 + ", " + numero3);
	
	}
		
		else if (numero1 >= numero2 && numero1 <= numero3) {
		System.out.println("A sequ�ncia num�rica em ordem crescente � : " + numero2 + ", " + numero1 + ", " + numero3);
	}
	
		else if (numero3 <= numero2 && numero3 <= numero1) {
			System.out.println("A sequ�ncia num�rica em ordem crescente � : " + numero3 + ", " + numero2 + ", " + numero1);
		}
		
		entrada.close();
	
	}
}
