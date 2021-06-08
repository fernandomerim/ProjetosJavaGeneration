package Exercícios_2021_06_02_Java;


import java.text.DecimalFormat;
import java.util.Scanner;

/*Um sistema de equações lineares do tipo: "ax + by = c" e " dx + ey = f ",
 * pode ser resolvido segundo mostrado abaixo : x = ce - bf / ae - bd
 * y = af - cd / ae - bd
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
 */

public class Exercícios_07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Sistema de equação linear");
		System.out.println("********************");
		System.out.println("Digite o valor de a: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		c = entrada.nextDouble();
		
		System.out.println("Digite o valor de d: ");
		d = entrada.nextDouble();
		
		System.out.println("Dogite do valor de e: ");
		e = entrada.nextDouble();
		
		System.out.println("Digite o valor de f: ");
		f = entrada.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de x é: " + df.format(x));
		System.out.println("O valor de y é: " + df.format(y));
		
		entrada.close();
	}

}
