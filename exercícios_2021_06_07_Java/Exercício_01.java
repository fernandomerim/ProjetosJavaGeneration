package exerc�cios_2021_06_07_Java;

/*Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros 
 * inteiros. O programa deve executar os seguintes passos: 
 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
 * (b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es 
 * A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
 * (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
 * (d) Mostre na tela cada valor do vetor A, um em cada linha.
 * */



public class Exerc�cio_01 {

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
		System.out.println("A soma dos vetores das posi��es A[0], A[1] e A[5] ) �: " + soma);
		
		for (int linha = 0; linha<vetor.length; linha ++) { 
				System.out.print("["+ vetor[linha] +"] ");
			}
		}
	}
