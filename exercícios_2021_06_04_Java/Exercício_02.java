package exerc�cios_2021_06_04_Java;

/* 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
*/
public class Exerc�cio_02 {

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
			
		System.out.println("A quantidade de n�meros par s�o: " + numpar);
		System.out.println("A quantidade de n�meros �mpar s�o: " + numimpar);
		
		}
		
		
	}