package Condicional;

import java.util.Scanner;

public class Média {

	public static void main(String[] args) {

		double N1, N2, N3, N4, Media ; 

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual é a sua primeira nota");
		N1 = ler.nextDouble();
		System.out.println("Qual é a sua segunda nota");
		N2 = ler.nextDouble();
		System.out.println("Qual é a sua terceira nota");
		N3 = ler.nextDouble();
		System.out.println("Qual é a sua quarta nota");
		N4 = ler.nextDouble();
		Media = (N1+N2+N3+N4) / 4 ;
		ler.close();
		if (Media >= 6){
			System.out.println("primeira nota: " + N1 + "\n" + "segunda nota:" + N2 );
			System.out.println("terceira nota:" + N3 + "\n" + "quarta nota:" + N4 +"\n" + "Você teve uma media de: " + Media+ " E ESTÁ APROVADO!!!"  );
		}
		else {  
			System.out.println("primeira nota: " + N1 + "\n" + "segunda nota:" + N2 );
			System.out.println("terceira nota:" + N3 + "\n" + "quarta nota:" + N4 +"\n" + "Você teve uma media de: " + Media+ " E ESTÁ REPROVADO!!!"  );
		}
	}

}
