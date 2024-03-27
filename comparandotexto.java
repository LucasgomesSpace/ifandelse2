package Condicional;

import java.util.Scanner;

public class comparandotexto {

	public static void main(String[] args) {
		String palavra1, palavra2; 

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a primeira palavra: ");
		palavra1 = ler.nextLine();
		System.out.println("Informae a segunda palavra");
		palavra2 = ler.nextLine();
		if (palavra1.equals(palavra2)){

			System.out.println("As palavras são iguais");
		}
		else 
			System.out.println("As palavras são diferentes");

		ler.close();

	}

}
