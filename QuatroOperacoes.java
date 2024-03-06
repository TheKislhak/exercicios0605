package exercicios0603;

import java.util.Scanner;
public class QuatroOperacoes {

	public static void main(String[] args) {
		// Variaveis
		double a, b, som, sub, div, mul;
		Scanner ler = new Scanner(System.in);
		
		//Intercalar classes
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		// Processamento
		som = (a + b);
		sub = (a - b);
		div = (a / b);
		mul = (a * b);
		
		// Saidas
		System.out.println("O valor da soma é " + som);
		System.out.println("O valor da subtração é " + sub);
		System.out.println("O valor da divisão é " + div);
		System.out.println("O valor da multiplicação é " + mul);
		ler.close();

	}

}
