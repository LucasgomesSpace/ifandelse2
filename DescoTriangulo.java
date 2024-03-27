package Condicional;

import java.util.Scanner;
public class DescoTriangulo {

	public static void main(String[] args) {

		double N1, N2, N3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Valor 1 : ");
		N1 = ler.nextDouble();
		System.out.println("Valor 2 : ");
		N2 = ler.nextDouble();
		System.out.println("Valor 3 : ");
		N3 = ler.nextDouble();
		ler.close();

		if ( N1 == N2 && N1 == N3 ) {
			System.out.println("você tem um Triangulo Equilatero");
		}
		else if (N1 == N2 || N1 == N3 ) {
			System.out.println("Você tem um Triangulo Isóseles");
		}
		else {
			System.out.println("Você tem um Triangulo Escaleno");
		}

	}

}