package ATIVIDADE03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.

		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe O 1� N�mero: ");
		int n1 = s.nextInt();
		
		System.out.print("Informe O 2� N�mero: ");
		int n2 = s.nextInt();
		
		if (n1 > n2) {
			
			System.out.print("\nO 1� Numero � Maior");
			
		}else if (n2 > n1) {
			
			System.out.print("\nO 2� Numero � Maior");
			
		}else {
			
			System.out.print("\nN�o pode ser Igual");
			
		}
		
		s.close();
	}

}
