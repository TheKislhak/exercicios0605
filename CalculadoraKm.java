package exercicios0603;

import java.util.Scanner;

public class CalculadoraKm {

	public static void main(String[] args) {
		// Variavel
		double km, litrogaso, consumototal, consumomedio, custototal;
		Scanner ler = new Scanner(System.in);

		// consumotoal = total de gasolina, consumomedio = km/gaso, custototal = todo o custo.

		//Intercalar classes
		System.out.println("Quantos o Km foi rodado: ");
		km = ler.nextDouble();

		System.out.println("Qual o valor do litro da gasolina?: ");
		litrogaso = ler.nextDouble();

		System.out.println("Qual o consumo médio do seu carro?: ");
		consumomedio = ler.nextDouble();

		// Processamento
		consumototal = (km / consumomedio);
		custototal = (consumototal * litrogaso);

		// Saida
		System.out.println("O consumo total é: " + consumototal);
		System.out.println("E o valor total foi:" + custototal);
		ler.close();

	}

}
