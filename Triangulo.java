package exercicios0603;

import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		// Variaveis
		double base, altura, area;
		Scanner ler = new Scanner(System.in);
		
		// Intercalar classes
		System.out.println("Qual a base do triângulo?: ");
		base = ler.nextDouble();
		
		System.out.println("Qual a altura dele?: ");
		altura = ler.nextDouble();
		
		// Processamento
		area = (base * altura) / 2;
		
		// Saida
		System.out.println("O valor da área é: " + area);
		ler.close();

	}

}
