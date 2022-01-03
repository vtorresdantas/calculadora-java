package Metodos;

import java.util.Scanner;

public class Exemplo03 {

	// publico
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MENU CALCULADORA

		int opcao = 0, a1 = 0, b1 = 0;

		while (opcao != 5) {

			System.out.println("");
			System.out.println("[1] - Adi��o");
			System.out.println("[2] - Subtra��o");
			System.out.println("[3] - Multiplica��o");
			System.out.println("[4] - Divis�o");
			System.out.println("[5] - Sair");

			System.out.println("Digite uma op��o: ");
			opcao = entrada.nextInt();

			if (opcao > 0 && opcao < 5) {

				System.out.println("Digite o primeiro n�mero: ");
				a1 = entrada.nextInt();
				System.out.println("");
				System.out.println("Digite o segundo n�mero: ");
				b1 = entrada.nextInt();

			}

			// (a1, b1) Parametros reais enviados ao m�todo
			switch (opcao) {

			case 1:
				adicao(a1, b1);
				break;
			case 2:
				subtracao(a1, b1);
				break;
			case 3:
				multiplicacao(a1, b1);
				break;
			case 4:
				divisao(a1, b1);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Op��o inv�lida!!!");
			}

		} // while

	}

	// Rotina adi��o
	public static void adicao(int a1, int b1) {

		int r1 = 0;

		System.out.println("Rotina Adi��o");
		r1 = a1 + b1;
		System.out.println("Resultado: " + r1);
	}

	// Rotina subtra��o

	public static void subtracao(int a1, int b1) {
		int r1 = 0;

		System.out.println("Rotina Subtra��o");
		r1 = a1 - b1;
		System.out.println("Resultado: " + r1);
	}

	// Rotina multiplica��o

	public static void multiplicacao(int a1, int b1) {
		int r1 = 0;

		System.out.println("Rotina Multiplica��o");
		r1 = a1 * b1;
		System.out.println("Resultado: " + r1);
	}

	// Rotina divis�o

	public static void divisao(int a1, int b1) {
		double r1 = 0;

		System.out.println("Rotina Divis�o");
		r1 = a1 / b1;
		System.out.println("Resultado: " + r1);
	}

}