package exercicios0603;

import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		// Variavel
		double fato;
		Scanner ler = new Scanner(System.in);
		
		// Processamento
		fato = 5*4*3*2*1;
		
		//Saida
		System.out.println("O valor de !5 é: " + fato);
		ler.close();

	}
}
