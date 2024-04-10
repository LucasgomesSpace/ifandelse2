package Condicional;

import java.util.Scanner;

public class converteratividade {

	public static void main(String[] args) {

		int mes;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o numero do mes");
		mes = ler.nextInt();
		ler.close(); 

		switch (mes) {
		case 1: 
			System.out.println("O mês referente ao numero 1 é Janeiro");
			break;
		case 2:
			System.out.println("O mês referente ao numero 2 é Fevereiro");
			break;
		case 3:
			System.out.println("O mês referente ao numero 3 é Março");
			break;
		case 4:
			System.out.println("O mês referente ao numero 4 é Abril");
			break;
		case 5:
			System.out.println("O mês referente ao numero 5 é Maio");
			break;
		case 6:
			System.out.println("O mês referente ao numero 6 é Junho");
			break;
		case 7:
			System.out.println("O mês referente ao numero 7 é Julho");
			break;
		case 8:
			System.out.println("O mês referente ao numero 8 é Agosto");
			break;
		case 9:
			System.out.println("O mês referente ao numero 9 é Stembro");
			break;
		case 10:
			System.out.println("O mês referente ao numero 10 é Outubro");
			break;
		case 11:
			System.out.println("O mês referente ao numero 11 é Novembro");
			break;
		case 12:
			System.out.println("O mês referente ao numero 12 é Dezembro");
			break;

		default:
			System.out.println("Mes invalido");


		}
	}

}
