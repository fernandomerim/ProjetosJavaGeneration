package Exerc�cios_2021_06_02_Java;

/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
 * e calcule a seguinte express�o: D = (R+S) / 2, onde R = (A + B)� e S = (B + C)�
*/

import java.util.Scanner;

public class Exerc�cio_04 {

	public static void main(String[] args) {
				
				Scanner entrada = new Scanner(System.in);
				
				int a, b, c, d, r, s;
				
				System.out.println("Escreva o n�mero A: ");
				a = entrada.nextInt();
				
				System.out.println("Escreva o n�mero B: ");
				b = entrada.nextInt();
				
				System.out.println("Escreva o n�mero C: ");
				c = entrada.nextInt();
				
				r = (a + b) * (a + b);
				s = (b + c) * (b + c);
				d = (r + s) / 2;
				
				System.out.println("O valor do resultado �: " + d);
				
				entrada.close();
						
			}

		}
