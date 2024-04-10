package Condicional;

import java.util.Scanner;

public class Bonusdosalario {

	public static void main(String[] args) {

		double AT; 

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantos anos na empresa? ");
		AT = ler.nextDouble();

		String msg = AT <= 3 ? "bonus de 5%": "bonus de 7%";     
		System.out.println(msg);
		ler.close();
	}
}


