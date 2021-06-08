package Exercícios_2021_06_02_Java;

import java.text.DecimalFormat;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% 
 * e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
 */

import java.util.Scanner;

public class Exercício_08 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
	double custo_fabrica, distribuidor, custo_consumidor;
		
		System.out.println("Custo de um véiculo convertido ao consumidor");
		System.out.println("******************************************");
		System.out.println("Insira o valor de custo de fábrica do veículo: ");
		custo_fabrica = entrada.nextDouble();
		
		distribuidor = custo_fabrica + (custo_fabrica * 0.28);
		custo_consumidor = distribuidor + (distribuidor *0.45);
		
		System.out.println("O custo ao consumidor é de R$ " + df.format(custo_consumidor));
		
		entrada.close();
	}

}
