package ATIVIDADE03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é vogal.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite uma Letra: ");
		
		char letra = s.next().charAt(0);
		
		if (letra == 'a' || 
			letra == 'e' || 
			letra == 'i' || 
			letra == 'o' || 
			letra == 'u') {
			
			System.out.print("\nEssa Letra é Vogal");
			
		}else {
			
			System.out.print("\nEssa Letra é a");
			
		}
		
		s.close();
	}

}
