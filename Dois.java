package theTwo;

import java.util.Locale;
import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.print("Vamos fazer o cálculo da sua média?\n" + "Comece digitando sua primeira nota: ");
		float nota1 = input.nextFloat();

		System.out.print("Insira sua segunda nota: ");
		float nota2 = input.nextFloat();

		System.out.print("Insira sua terceira nota: ");
		float nota3 = input.nextFloat();

		System.out.print("Insira sua quarta nota: ");
		float nota4 = input.nextFloat();

		input.close();
		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.print("Sua média final é: " + media);

	}

}
