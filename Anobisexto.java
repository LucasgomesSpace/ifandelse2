package Condicional;

import java.util.Scanner;

public class Anobisexto {

	public static void main(String[] args) {

		int ano;

		Scanner ler = new Scanner(System.in);
		System.out.println("Qual ano deseja verificar ?");
		ano = ler.nextInt();
		ler.close();

		if(ano % 400 == 0){
		} 
		if((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é um ano bissexto.");
		}
		else
		{
			System.out.println(ano + " não é um ano bissexto");
		}
	}
}