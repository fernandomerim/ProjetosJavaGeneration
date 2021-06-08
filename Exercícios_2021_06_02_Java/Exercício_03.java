package Exercícios_2021_06_02_Java;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa
* em segundos e mostre-o expresso em horas, minutos e segundos. 
*/

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int horas, minutos, segundos;
			
			System.out.println("Duração convertida em horas e minutos");
			System.out.println("***********************");
			System.out.println("Qual a duração do evento em segundos: ");
			segundos = entrada.nextInt();
			
			minutos = segundos / 60;
			horas = minutos / 60;
						
			System.out.println("O seu evento em horas durou: " + horas + " horas.");
			System.out.println("O seu evento em minutos durou: " + minutos + " minutos.");
			System.out.println("O seu evento em segundos durou: " + segundos + " segundos.");
			
			entrada.close();
		
			
		}

	}
