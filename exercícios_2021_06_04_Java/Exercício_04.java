package exercícios_2021_06_04_Java;

import java.util.Scanner;

/*	Uma empresa desenvolveu uma pesquisa para saber as características 
 	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas 
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
 	pessoas, calcule e mostre: 
 	o número de pessoas calmas; 
	o número de mulheres nervosas; 
	o número de homens agressivos; 
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos; 
	o número de pessoas calmas com menos de 18 anos.
 */

public class Exercício_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int idade, sexo, humor, i=0, cond1=0, cond2=0, cond3=0, cond4=0, cond5=0, cond6=0;
		
		while (i< 3) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Digite o seu sexo (1-masculino, 2-feminino, 3-outros");
			sexo = entrada.nextInt();
			System.out.println("Digite seu humor (1- calmo, 2-nervoso, 3-agressivo");
			humor = entrada.nextInt();
			
			if (humor == 1) {
				cond1++;
			}
			
			if (sexo == 2 && humor == 2) {
				cond2++;
			}
			
			if (sexo == 1 && humor == 3) {
				cond3++;
			}
			
			if (sexo == 3 && humor == 1) {
				cond4++;
			}
			
			if (idade >= 40 && humor == 2) {
				cond5++;
			}
			
			if (idade >= 40 && humor == 2) {
				cond5++;
			}
			
			if (idade <= 18 && humor == 1) {
				cond6++;
			}
			
			i ++;
		}
				
		System.out.println("O número de pessoas calmas é: " + cond1);
		System.out.println("O número de mulheres nervosas é: " + cond2);
		System.out.println("O número de homens agressivos é: " + cond3);
		System.out.println("O número de outros calmos é: " + cond4);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + cond5);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + cond6);
		
		entrada.close();  
	}

}