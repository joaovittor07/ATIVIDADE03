package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		/* 29. Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. 
		   As perguntas s�o:
			   "Telefonou para a v�tima?"
			   "Esteve no local do crime?"
			   "Mora perto da v�tima?"
			   "Devia para a v�tima?"
			   "J� trabalhou com a v�tima?"
		   O programa deve no final emitir uma classifica��o sobre a participa��o da 
		   pessoa no crime. Se a pessoa responder positivamente a 2 quest�es ela deve 
		   ser classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como 
		   "Assassino". Caso contr�rio, ele ser� classificado como "Inocente" */
		
		Scanner s = new Scanner (System.in);
		
		int con = 0; 
		
		System.out.println("Responda Sim ou N�o");
		
		System.out.print("\nTelefonou para a v�tima ? ");
		
			String res1 = s.nextLine();
			
			if(res1.equalsIgnoreCase("sim")) {
			
				con++;
				
			}
			
		System.out.print("\nEsteve no local do crime ? ");

			String res2 = s.nextLine();
		
			if(res2.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
		
		System.out.print("\nMora perto da v�tima ? ");
		
			String res3 = s.nextLine();
		
			if(res3.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
		
		System.out.print("\nDevia para a v�tima ? ");
		
			String res4 = s.nextLine();
		
			if(res4.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
		
		System.out.print("\nJ� trabalhou com a v�tima ? ");

			String res5 = s.nextLine();
		
			if(res5.equalsIgnoreCase("sim")) {
				
				con++;
				
			}
			
		if(con == 2) {
			
			System.out.print("\nSuspeito");
			
		}else if(con == 3 || con == 4) {
		
			System.out.print("\nC�mplice");
		
		}else if(con == 5) {
			
			System.out.print("\nAssasino");
			
		}else {
			
			System.out.print("Inocente");
			
		}
		
	}
}


