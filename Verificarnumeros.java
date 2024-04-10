package Condicional;

import java.util.Scanner;

public class Verificarnumeros {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Escolha um numero de 1 a 3");
		int numero = ler.nextInt();

		switch (numero) {
		case 1:
			System.out.println("O numero escolido foi: 1.");
			break;
		case 2:
			System.out.println("O numero escolido foi: 2.");
			break;
		case 3:
			System.out.println("O numero escolido foi: 3.");
			break;
		default: 
			System.out.println("O numero escolhido é invalido! Digite um numero entre 1 a 3.");
			break;

		}
		ler.close();
		}
	}