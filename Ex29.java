package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		/* 29. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 
		   As perguntas são:
			   "Telefonou para a vítima?"
			   "Esteve no local do crime?"
			   "Mora perto da vítima?"
			   "Devia para a vítima?"
			   "Já trabalhou com a vítima?"
		   O programa deve no final emitir uma classificação sobre a participação da 
		   pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve 
		   ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como 
		   "Assassino". Caso contrário, ele será classificado como "Inocente" */
		
		Scanner s = new Scanner (System.in);
		
		int con = 0; 
		
		System.out.println("Responda Sim ou Não");
		
		System.out.print("\nTelefonou para a vítima ? ");
		
			String res1 = s.nextLine();
			
			if(res1.equalsIgnoreCase("sim")) {
			
				con++;
				
			}
			
		System.out.print("\nEsteve no local do crime ? ");

			String res2 = s.nextLine();
		
			if(res2.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
		
		System.out.print("\nMora perto da vítima ? ");
		
			String res3 = s.nextLine();
		
			if(res3.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
		
		System.out.print("\nDevia para a vítima ? ");
		
			String res4 = s.nextLine();
		
			if(res4.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
		
		System.out.print("\nJá trabalhou com a vítima ? ");

			String res5 = s.nextLine();
		
			if(res5.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
			
		if(con == 2) {
			
			System.out.print("\nSuspeito");
			
		}else if(con == 3 || con == 4) {
		
			System.out.print("\nCúmplice");
		
		}else if(con == 5) {
			
			System.out.print("\nAssasino");
			
		}else {
			
			System.out.print("Inocente");
			
		}
		
	}
}


