package exercícios_2021_06_11_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestaEstoque {

	    public static void main(String[] args) {
	    
	    	// declarando e instanciando um estoque de materiais
	
	    	int i;
	    	Scanner entrada = new Scanner (System.in);
	    
	    
	    	// Armazenando dados da list
	    String estoque0 = "Lápis de cor";
		String estoque1 = "Folha de Sulfite";
		String estoque2 = "Caneta";
		String estoque3 = "Grampeador";
		String estoque4 = "Agenda";
	
        
	    
	    ArrayList<String> estoques = new ArrayList<>();
	    
	       	estoques.add(estoque0);
			estoques.add(estoque1);
			estoques.add(estoque2);
			estoques.add(estoque3);
			estoques.add(estoque4);
	        
			// mostrando dados da list
			int n = estoques.size();
				for (i =0; i<n; i++) {
					
					System.out.printf("Material %d- %s\n", (i + 1), estoques.get(i));
			}
				// removendo dados da list
				System.out.printf("\nInforme o material a ser excluído:\n [1] - Lápis de cor\n [2] - Folha de Sulfite\n [3] - Caneta\n "
									+ "[4] - Grampeador\n [5] - Agenda\n Digite de 1 à 5: ");
				
					i = entrada.nextInt();
					estoques.remove(i -1);	
			
			//atualizando e apresentando todos os dados da list
			System.out.println("\nOs materiais disponíveis em estoque são:");
			Collections.sort(estoques);
			System.out.println(estoques);

	        }


	    }
	    

	
