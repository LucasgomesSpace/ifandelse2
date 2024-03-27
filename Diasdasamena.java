package Condicional;

import java.util.Scanner;

public class Diasdasamena {

	public static void main(String[] args) {

		int Dia ; 
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero refente ao dia da semana: (1 a 7)");
		Dia = ler.nextInt();
		ler.close();
		if (Dia == 1){
			System.out.println("O dia de hoje é: Segunda feira");
		}
		else if (Dia == 2){
			System.out.println("O dia de hoje é: Terça feira");
		}
		else if (Dia == 3){
			System.out.println("O dia de hoje é: Quarta feira");
		}
		else if (Dia == 4){
			System.out.println("O dia de hoje é: Quinta feira");
		}
		else if (Dia == 5) {
			System.out.println("o dia de hoje é: Sexta feira");
		}
		else if (Dia == 6) {
			System.out.println("o dia de hoje é: Sabado feira");
		}
		else if (Dia == 7) {
			System.out.println("o dia de hoje é: Domingo");
		}
		else System.out.println("Valor ilegivel, Deseja cirar um dia?");

	}
}