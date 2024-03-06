package exercicios0603;

import java.util.Scanner;

public class Calcul2doraTemperatura {

	public static void main(String[] args) {
		// Variavel
		double celsius, fahrenheit;
		Scanner ler = new Scanner(System.in);

		// Intercalar classe
		System.out.println("Digite o Fahrenheit: ");
		fahrenheit = ler.nextDouble();

		// Processamento
		celsius = ((fahrenheit - 32) *5) /9;

		// Saida
		System.out.println("O valor do Celsius: " + celsius +"°c");
		ler.close();

	}

}
