package exercicios0603;

import java.util.Scanner;
public class Dinheiro {

	public static void main(String[] args) {
		// Variavel
		double  redol, reeu, reli, real;
		Scanner ler = new Scanner(System.in);

		// Intercalar classe
		System.out.println("Quantos reis você tem?: ");
		real = ler.nextDouble();
		// Processamento
		redol = (real * 4.93);
		reeu = (real * 5.37);
		reli = (real * 6.28);

		// Saida
		System.out.println("O valor em de Dolar em Real é: " + redol);
		System.out.println("O valor em Euro em Real: " + reeu);
		System.out.println("O valor em Libra para Real é: " + reli);
		ler.close();


	}

}
