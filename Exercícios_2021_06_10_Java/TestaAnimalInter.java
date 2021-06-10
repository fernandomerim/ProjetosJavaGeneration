package Exerc�cios_2021_06_10_Java;

import java.util.Scanner;

	public class TestaAnimalInter {
	
		public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		CachorroInter cachorro1 = new CachorroInter();
		CavaloInter cavalo1 = new CavaloInter();
		PreguicaInter preguica1 = new PreguicaInter();
		
		System.out.println("Digite o nome do cachorro: ");
		cachorro1.setNome(scan.nextLine());
		System.out.println("Digite a idade do cachorro: ");
		cachorro1.setIdade(scan.nextLine());
		
		System.out.println("Digite o nome do cavalo: ");
		cavalo1.setNome(scan.nextLine());
		System.out.println("Digite a idade do cavalo: ");
		cavalo1.setIdade(scan.nextLine());
		
		System.out.println("Digite o nome do bicho pregui�a: ");
		preguica1.setNome(scan.nextLine());
		System.out.println("Digite a idade do bicho pregui�a: ");
		preguica1.setIdade(scan.nextLine());
		
		System.out.println("\n=====Dados do Cachorro=====");
		System.out.println("O nome do cachorro �: " + cachorro1.getNome());
		System.out.println("A idade do cachorro �: " + cachorro1.getIdade());
		cachorro1.somAnimal();
		cachorro1.correr();
		
		System.out.println("\n=====Dados do Cavalo=====");
		System.out.println("O nome do cavalo �: " + cavalo1.getNome());
		System.out.println("A idade do cavalo �: " + cavalo1.getIdade());
		cavalo1.somAnimal();
		cavalo1.correr();
		
		System.out.println("\n=====Dados do Bicho Pregui�a=====");
		System.out.println("O nome do bicho pregui�a �: " + preguica1.getNome());
		System.out.println("A idade do bicho pregui�a �: " + preguica1.getIdade());
		preguica1.somAnimal();
		preguica1.subir();
			
		scan.close();
	}

}
