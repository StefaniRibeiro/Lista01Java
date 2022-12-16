package Lista 01;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float raio;
		double area;

		System.out.printf("Informe o raio do c�rculo: ");
		raio = sc.nextFloat();

		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A �rea do c�rculo � igual a: %.2f", area);
		sc.close();
	}

}