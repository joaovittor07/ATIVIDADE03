package ATIVIDADE03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/* Faça um Programa que tendo como dados de entrada o preço de custo de um 
		   produto e um código de origem, emita o preço junto de sua procedência. 
		   Caso o código não seja nenhum dos especificados, o produto deve ser 
		   classificado como importado. Código de origem: 1 - Sul, 2 - Norte 3 - Leste, 
		   4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste. */

		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Valor do Produto: ");
		float valor = s.nextInt();
		
		System.out.print("Informe o Código de Origem: ");
		int origem = s.nextInt();
		
		String res = null;
		
		if(origem == 1) {
			
			res = "Sul";
			
		}else if(origem == 2) {
			
			res = "Norte";
			
			
		}else if(origem == 3) {
			
			res = "Leste";
			
		}else if(origem == 4) {
			
			res = "Oeste";
			
		}else if((origem == 5) || (origem == 6)){
			
			res = "Nordeste";
			
		}else if((origem == 7) || (origem == 8)){
			
			res = "Centro-Oeste";
			
		}else {
			
			System.out.print("Esse Número não tem uma Determinada Região");
			
		}
		
		System.out.print("\nO Valor do Produto Escolido é: R$ = " + valor);
		System.out.print("\nO Código de Origem do Produto é: " + res);
		
		s.close();
	}

}
