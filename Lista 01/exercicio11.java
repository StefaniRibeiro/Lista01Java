package Lista 01;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float bMaior, bMenor, altura, area;

		System.out.printf("Informe a base maior do trap�zio: ");
		bMaior = sc.nextFloat();

		System.out.printf("Informe a base menor do trap�zio: ");
		bMenor = sc.nextFloat();

		System.out.printf("Informe a altura do trap�zio: ");
		altura = sc.nextFloat();

		area = (bMaior + bMenor) * altura / 2;

		System.out.printf("A �rea do trap�zio � igual a: %.2f", area);
		sc.close();

	}

}