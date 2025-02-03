package primeiroEx;

import java.util.Locale;
import java.util.Scanner;

public class TheOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		// TODO Auto-generated method stub

		System.out.print("Insira o valor do seu salário: ");
		float salario = input.nextFloat();

		System.out.print("Insira o valor do abono salarial: ");
		float abono = input.nextFloat();

		float novoSalario = (salario + abono);

		input.close();

		System.out.print("Seu novo salário é de R$ " + novoSalario);

	}

}
