package exerc�cios_2021_06_03_Java;

import java.util.Scanner;

public class Exerc�cio_extra {

	/*Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
	 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
	 * deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel 
	 * P (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa 
	 * que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
	 * */
	
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		double peso, excesso = 4.0, multa;
		
		System.out.println("Insira o peso dos tomates: ");
		peso = entrada.nextDouble();
		
		if (peso <= 50) {
			System.out.println("Voc� n�o excedeu o limite e n�o precisar� pagar multa");
		}
		
		else if (peso > 50) {
			excesso = peso - 50.0;
			multa= excesso*4.0;
			System.out.println("Voc� excedeu o limite de kg permitidos em " + excesso  + " kg"+ "\nDever� pagar R$ " + multa);
			}
		entrada.close();
			
		}

	}
