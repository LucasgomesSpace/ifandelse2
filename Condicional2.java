package Condicional;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int dia;
		System.out.println("Informe o dia da semana");
		dia = ler.nextInt();

		switch (dia) {
		
		case 1 :
		      System.out.println("DOMINGO");
		break;
		case 2 :
		      System.out.println("SEGUNDA");
		break;
		case 3 :
		      System.out.println("TERÇA");
		break;
		case 4 :
 		      System.out.println("QUARTA");
		break;
		case 5 :
		      System.out.println("QUINTA");
		break;
		case 6 :
		      System.out.println("SEXTA");
		break;
		case 7:
		      System.out.println("SABADO");
		break;

		default:
			System.out.println("Dia invalido");
		}
		ler.close();
	}
}
