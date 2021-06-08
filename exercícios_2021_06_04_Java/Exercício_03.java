package exercícios_2021_06_04_Java;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 
 * anos. Total de pessoas com mais de 50 anos. O programa termina quando idade
 * for =-99
 */
public class Exercício_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	int numero = 0;
	int menor = 0;
	int maior = 0;
	
	while(numero != -99) {
		System.out.println("Digite a sua idade: ");
		numero = entrada.nextInt();
		
		if(numero <= 21) {
			menor = menor + 1;
		}
		
		if(numero >= 50) {
			maior = maior + 1;
		}
		
			}
	
	System.out.println("Total de pessoas com menos de 21 anos: " + menor);
	System.out.println("Total de pessoas com mais de 50 anos: " + maior);
	entrada.close();
	}
}