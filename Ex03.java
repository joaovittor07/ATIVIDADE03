package ATIVIDADE03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
		   Conforme a letra escrever: F - Feminino, M - Masculino.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite F - (Feminino) ou M - (Masculino): ");
		
		String letra = s.nextLine();
		
		if(letra.equalsIgnoreCase("F")) {
			
			System.out.print("\nFeminino");
			
		}else if(letra.equalsIgnoreCase("M")) {
			
			System.out.print("\nMasculino");
			
		}
		
		s.close();
	}

}
