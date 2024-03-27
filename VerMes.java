package Condicional;

import java.util.Scanner;

public class VerMes {

	public static void main(String[] args) {
		int mes;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o numero do mes");
		mes = ler.nextInt();
		ler.close(); 


		if (mes == 1) {
			System.out.println("O mês referente ao numero 1 é Janeiro");
		}
		else if (mes == 2) {
			System.out.println("O mês referente ao numero 2 é Fevereiro");
		}
		else if (mes == 3) {
			System.out.println("O mês referente ao numero 3 é Março");
		}
		else if (mes == 4) {
			System.out.println("O mês referente ao numero 4 é Abril");
		}
		else if (mes == 5) {
			System.out.println("O mês referente ao numero 5 é Maio ");
		}
		else if (mes == 6) {
			System.out.println("O mês referente ao numero 6 é Junho");
		}
		else if (mes == 7) {
			System.out.println("O mês referente ao numero 7 é Julho");
		}
		else if (mes == 8) {
			System.out.println("O mês referente ao numero 8 é Agosto");
		}
		else if (mes == 9) {
			System.out.println("O mês referente ao numero 9 é Stembro");
		}
		else if (mes == 10) {
			System.out.println("O mês referente ao numero 10 é Outubro");
		}
		else if (mes == 11) {
			System.out.println("O mês referente ao numero 11 é Novembro");
		}
		else if (mes == 12) {
			System.out.println("O mês referente ao numero 12 é Dezembro");
		}

		else {
			System.out.println("MÊS");
		}

	}

}
