package exercício1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;

		System.out.print("Digite o número A: ");
		n1 = leia.nextInt();

		System.out.print("Agora digite o número B: ");
		n2 = leia.nextInt();

		System.out.print("Por fim, digite o número C: ");
		n3 = leia.nextInt();

		leia.close();

		int resultado = (n1 + n2);

		if (resultado > n3) {
			System.out.print("A soma de A + B é maior que C, resultando em: " + resultado);

		} else if (resultado < n3) {
			System.out.print("A soma de A + B é menor que C, resultando em: " + resultado);

		} else {
			System.out.print("A soma de A + B é igual a C, resultando em: " + resultado);

			{

			}

		}
	}
}
