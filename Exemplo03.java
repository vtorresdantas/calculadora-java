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
			System.out.println("[1] - Adição");
			System.out.println("[2] - Subtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			System.out.println("[5] - Sair");

			System.out.println("Digite uma opção: ");
			opcao = entrada.nextInt();

			if (opcao > 0 && opcao < 5) {

				System.out.println("Digite o primeiro número: ");
				a1 = entrada.nextInt();
				System.out.println("");
				System.out.println("Digite o segundo número: ");
				b1 = entrada.nextInt();

			}

			// (a1, b1) Parametros reais enviados ao método
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
				System.out.println("Opção inválida!!!");
			}

		} // while

	}

	// Rotina adição
	public static void adicao(int a1, int b1) {

		int r1 = 0;

		System.out.println("Rotina Adição");
		r1 = a1 + b1;
		System.out.println("Resultado: " + r1);
	}

	// Rotina subtração

	public static void subtracao(int a1, int b1) {
		int r1 = 0;

		System.out.println("Rotina Subtração");
		r1 = a1 - b1;
		System.out.println("Resultado: " + r1);
	}

	// Rotina multiplicação

	public static void multiplicacao(int a1, int b1) {
		int r1 = 0;

		System.out.println("Rotina Multiplicação");
		r1 = a1 * b1;
		System.out.println("Resultado: " + r1);
	}

	// Rotina divisão

	public static void divisao(int a1, int b1) {
		double r1 = 0;

		System.out.println("Rotina Divisão");
		r1 = a1 / b1;
		System.out.println("Resultado: " + r1);
	}

}