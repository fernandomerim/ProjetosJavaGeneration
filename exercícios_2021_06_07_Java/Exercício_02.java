package exercícios_2021_06_07_Java;

import java.util.Scanner;

/* Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

public class Exercício_02 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int soma=0, qntimpar=0;
		
		for(int i=0; i<=5; i++) {
			System.out.printf("Digite um valor: ");
			vetor[i] = n.nextInt();
			
			if(vetor[i]%2==0){
				soma+=vetor[i];
			}else{qntimpar++;}}
		
			System.out.printf("\nNúmeros pares: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2==0){System.out.printf("| %d |", vetor[i]);}}
			
			System.out.printf("\nNúmeros ímpares: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2!=0) {System.out.printf("| %d |", vetor[i]);}}
			
			System.out.printf("\nA soma dos números pares: %d", soma);
			System.out.printf("\nA quantidade de números ímpares: %d", qntimpar);
			
			n.close();
			
	}

}