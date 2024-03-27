package Condicional;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		int num;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um numero");
		num = ler.nextInt();
		ler.close();

		if (num % 2 == 1) {
			System.out.println("O numero é impar");		
		}
		else  {
			System.out.println("O numero é par");
		}


	}

}