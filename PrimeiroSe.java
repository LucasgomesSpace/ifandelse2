package Condicional;

import java.util.Scanner;

public class PrimeiroSe {

	public static void main(String[] args) {

		int numero;
		Scanner ler = new Scanner(System.in);

		System.out.println("DIGITE UM VALOR");
		numero = ler.nextInt();
		if (numero >= 10){
			System.out.println("O numero é maior que 10 " );
		} else {

			System.out.println("O numero é menor que 10 ");
		}
		ler.close();
	}

}
