package exerc�cios_2021_06_03_Java;

import java.util.Scanner;

public class Exerc�cio_01 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3, maior;

		System.out.println("Descubra o maior n�mero");
		System.out.println("**********************");
		System.out.println("Digite o 1� n�mero: ");
		numero1 = entrada.nextInt();
		maior = numero1;

		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextInt();

		if (numero2 > numero1) {
			maior = numero2;
		}

		System.out.println("Digite o 3� n�mero: ");
		numero3 = entrada.nextInt();

		if (numero3 > numero2) {
			maior = numero3;
		}

		System.out.println("O maior n�mero digitado �: " + maior);

		entrada.close();
	}

}
