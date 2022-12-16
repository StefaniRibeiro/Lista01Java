package Lista 01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int base, altura, area;

		System.out.println("Informe a base do ret�ngulo: ");
		base = sc.nextInt();

		System.out.println("Informe a altura do ret�ngulo: ");
		altura = sc.nextInt();

		area = base * altura;

		System.out.println("A �rea do ret�ngulo � igual a: " + area);
		sc.close();
	}

}