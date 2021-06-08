package Exerc�cios_2021_06_02_Java;

import java.text.DecimalFormat;

/*Construa um programa em que, tendo como dados de entrada dois pontos 
 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles.
 * A f�rmula que efetua tal c�lculo �: d= RAIZ-(x2-x1)� + (y2-y1)�. 
 */

import java.util.Scanner;

public class Exerc�cio_06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double x1, x2, y1, y2, total, raiz;
		
		System.out.println("C�lculo da dist�ncia entre dois pontos");
		System.out.println("*********************");
		System.out.println("Digite o valor de x1: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = entrada.nextDouble();
		
		total = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		raiz = Math.sqrt(total);
		
		
		System.out.println("A pot�ncia de X e Y: " + total);
		System.out.printf("A raiz de X e Y: " + df.format(raiz));		
		
		entrada.close();

	}

}
