package exercícios_2021_06_04_Java;

/* 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares.
*/
public class Exercício_02 {

	public static void main(String[] args) {
	
		int num;
		int numpar = 0;
		int numimpar = 0;
		
		for (num = 11; num <= 20; num ++) 
		
			if (num % 2 == 0)  {
				numpar = numpar + 1;
			}
				
			else {
					numimpar = numimpar + 1;
				}
			
		System.out.println("A quantidade de números par são: " + numpar);
		System.out.println("A quantidade de números ímpar são: " + numimpar);
		
		}
		
		
	}