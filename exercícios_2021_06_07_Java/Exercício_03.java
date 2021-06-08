package exercícios_2021_06_07_Java;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 
public class Exercício_03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int valores = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[(int)linha].length; coluna++) {
				System.out.println("Digite os números: ");
				matriz[linha][coluna] = entrada.nextInt();
				
				if(matriz[linha][coluna] > 10) {
					valores ++;
				}
				
			}
		
		}
		
		System.out.println("Você digitou " + valores + " números acima de 10");
		entrada.close();
	}
	
}
