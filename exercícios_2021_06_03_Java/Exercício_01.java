package exercícios_2021_06_03_Java;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.

		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, numero3, maior;

		System.out.println("Descubra o maior número");
		System.out.println("**********************");
		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextInt();
		maior = numero1;

		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextInt();

		if (numero2 > numero1) {
			maior = numero2;
		}

		System.out.println("Digite o 3º número: ");
		numero3 = entrada.nextInt();

		if (numero3 > numero2) {
			maior = numero3;
		}

		System.out.println("O maior número digitado é: " + maior);

		entrada.close();
	}

}
