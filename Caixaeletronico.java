package Condicional;

import java.util.Scanner;

public class Caixaeletronico {

	public static void main(String[] args) throws InterruptedException {
		final String CPF = "47806841881";
		final double senha = 4878; 
		double saque, senhaI, resto, saldo = 10000.00;
		String cpfi ;

		Scanner ler = new Scanner(System.in);

		System.out.println("INFORME SEU CPF:" );
		cpfi = ler.next();
		System.out.println("INFORME SUA SENHA: ");			
		senhaI = ler.nextInt();

		if (cpfi.equals(CPF))  {
			System.out.println("CPF correto!!!");

			if (senhaI == senha) { 
				System.out.println("Senha correta");
				System.out.println("O valor disponivel é de: " + saldo);
				System.out.println("Quanto deseja sacar ? ");
				saque = ler.nextDouble();

				if (saque > saldo) {
					System.out.println("saldo insulficiente");
				}

				if (saque < saldo) {
					System.out.println("Saldo dsiponivel" + "\n"+ "A relizar o saque aguarde ...");
					Thread. sleep(1000);
					resto = saldo - saque;
					System.out.println("Saque realizado com sucesso!!! "+ "\n" + "Saldo disppnivel:" + resto );
				}
			}
		}
		else {
			System.out.println("informações incorretas");
		}
		ler.close();

	}
}
