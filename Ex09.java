package ATIVIDADE03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/* Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo 
		   que calcule o peso ideal, utilizando as seguintes f�rmulas:
			   Para homens: (72.7*h) - 58
			   Para mulheres: (62.1*h) - 44.7
			   (h = altura)
			   Ao final o algoritmo deve mostrar:
			   - Altura, peso e sexo;
			   - Peso Ideal;
			   - Mensagem se est� acima, abaixo ou no peso ideal; */
		
		Scanner s = new Scanner (System.in);
		
        System.out.print("Informe sua Altura: ");
        double h = s.nextDouble();
        
        System.out.print("Informe seu Peso: ");
        double peso = s.nextDouble();
        
        System.out.print("Digite F ou M: ");
        String letra = s.next();

        if (letra.equalsIgnoreCase("F")) {
            double cal1 = (62.1 * h) - 44.7;

            if (peso > cal1) {
                System.out.println("Voc� � Mulher");
                System.out.println("Acima do Peso Ideal");
            } else if (peso < cal1) {
                System.out.println("Voc� � Mulher");
                System.out.println("Abaixo do Peso Ideal");
            } else {
                System.out.println("Voc� � Mulher");
                System.out.println("No Peso Ideal");
            }

        } else if (letra.equalsIgnoreCase("M")) {
            double cal2 = (72.7 * h) - 58;

            if (peso > cal2) {
                System.out.println("Voc� � Homem");
                System.out.println("Acima do Peso Ideal");
            } else if (peso < cal2) {
                System.out.println("Voc� � Homem");
                System.out.println("Abaixo do Peso Ideal");
            } else {
                System.out.println("Voc� � Homem");
                System.out.println("No Peso Ideal");
            }
        } else {
            System.out.println("Sexo inv�lido.");
        }
        
        System.out.println("Sua Altura �: " + h);
        System.out.println("Seu Peso �: " + peso);

        s.close();
    }
}


