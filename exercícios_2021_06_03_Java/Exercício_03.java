package exerc�cios_2021_06_03_Java;

import java.util.Scanner;

/* Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
*categoria ela se encontra:
* 10-14 infantil
* 15-17 juvenil
* 18-25 adulto
*/

public class Exerc�cio_03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;

		System.out.println("Descubra a sua categoria");
		System.out.println("*******************");
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria � infantil");
		}

		else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria � juvenil");
		}

		else if (idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria � adulto");
		}
		else if (idade < 10 || idade > 25) {
			System.out.println("Desculpe. Sua idade est� fora das categorias dispon�veis.");
		}

		entrada.close();

	}

}
