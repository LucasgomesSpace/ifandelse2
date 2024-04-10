package Condicional;

import java.util.Scanner;

public class Notaaluno {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double notal, nota2, nota3, nota4, media;

		System.out.print("Informe primeira nota "); 
		notal = ler.nextDouble();
		System.out.print("Informe segunda nota "); 
		nota2 = ler.nextDouble();
		System.out.print("Informe terceira nota ");
		nota3 = ler.nextDouble();
		System.out.print("Informe quarta nota "); 
		nota4 = ler.nextDouble();
		media = (notal+nota2+nota3+nota4)/4;

		String msg = media >= 6 ? "Aprovado" : "Aluno está reprovado";  
		System.out.println(msg);

		ler.close();
	}

}
