package exercícios_2021_06_07_Java;

/*Faça um programa que possua um vetor denominado A que armazene 6 números 
 * inteiros. O programa deve executar os seguintes passos: 
 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
 * (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições 
 * A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
 * (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
 * (d) Mostre na tela cada valor do vetor A, um em cada linha.
 * */



public class Exercício_01 {

	public static void main(String[] args) {
		
int[] vetor = new int [6];
int soma;
		
		vetor[0] = 1;
		vetor[1] = 0;
		vetor[2] = 5;
		vetor[3] = -2;
		vetor[4] = 100;
		vetor[5] = 7;

		soma = vetor [0] + vetor [1]+ vetor [5];
		System.out.println("A soma dos vetores das posições A[0], A[1] e A[5] ) é: " + soma);
		
		for (int linha = 0; linha<vetor.length; linha ++) { 
				System.out.print("["+ vetor[linha] +"] ");
			}
		}
	}
