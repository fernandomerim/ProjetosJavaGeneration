package exercícios_2021_06_04_Java;

import java.text.DecimalFormat;

/* Escrever um programa que receba vários números inteiros no teclado. E no final  
 * imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class Exercício_06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double numero = 0;
		double soma = 0;
		double media = 0;
		int cont = 0;
		
		System.out.println("Programa: média dos múltiplos de 3. O programa encerra quando você digita 0.");
		
		do {
			System.out.println("Digite um número: " );
			numero = entrada.nextInt();
						
			if (numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				cont = cont +1;	
			}
		
		}	
			while (numero != 0); 
			
		media = soma / cont;
			System.out.println("A média dos números múltiplos de 3 é: " + df.format(media));
		entrada.close();
		}
					
}