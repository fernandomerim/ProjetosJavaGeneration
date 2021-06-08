package exercícios_2021_06_03_Java;

import java.util.Scanner;

public class Exercício_extra {

	/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
	 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
	 * deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável 
	 * P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa 
	 * que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
	 * */
	
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		double peso, excesso = 4.0, multa;
		
		System.out.println("Insira o peso dos tomates: ");
		peso = entrada.nextDouble();
		
		if (peso <= 50) {
			System.out.println("Você não excedeu o limite e não precisará pagar multa");
		}
		
		else if (peso > 50) {
			excesso = peso - 50.0;
			multa= excesso*4.0;
			System.out.println("Você excedeu o limite de kg permitidos em " + excesso  + " kg"+ "\nDeverá pagar R$ " + multa);
			}
		entrada.close();
			
		}

	}
