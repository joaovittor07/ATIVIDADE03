package ATIVIDADE03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a um n�mero inteiro e se este n�mero for par,
		   transforme-o em impar e vice-versa. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um N�mero Par ou Impar: ");
		
		int num = s.nextInt();
		
		if((num % 2) == 0) {
			
			System.out.print("\nEsse N�mero � Par");
			
			int par = (num + 1);
			
			System.out.print("\nAgora sera: " + par);
			
		}else if((num % 1) == 0) {
			
			System.out.print("\nEsse N�mero � Impar");
			
			int imp = (num + 1);
			
			System.out.print("\nAgora ser�: " + imp);
			
		}
		
		s.close();		
	}

}
