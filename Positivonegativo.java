package Condicional;

import java.util.Scanner;

public class Positivonegativo {

	public static void main(String[] args) {

		double num;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um numero");
		num = ler.nextDouble();
		ler.close();

		if (num > 0) {
			System.out.println("Seu numero é positivo");
		}
		if (num < 0){
			System.out.println("Seu numero é negativo");
		}

	}

}
