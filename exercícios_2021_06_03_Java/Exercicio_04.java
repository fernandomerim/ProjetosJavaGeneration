package exerc�cios_2021_06_03_Java;
/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
 * �mpar exiba o n�mero elevado ao quadrado.
 */

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
				
		double numero;

		System.out.println("Digite um n�mero: ");
		numero = entrada.nextDouble();
		
		if (numero %2 == 0) {
			System.out.println("Seu n�mero � par");
			System.out.printf("A raiz do seu n�mero �: " + Math.sqrt(numero),2);
		}
			else { 
			System.out.println("Seu n�mero � �mpar");
			System.out.printf("A raiz do seu n�mero �: " + Math.pow(numero,2));
		}
	entrada.close();	
	}

}
