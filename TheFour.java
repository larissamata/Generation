package theFour;

import java.util.Locale;
import java.util.Scanner;

public class TheFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.print("Vamos calcular a diferença entre alguns números.\n" + "Insira o primeiro: ");
		float n1 = input.nextFloat();

		System.out.print("Insira o segundo: ");
		float n2 = input.nextFloat();

		System.out.print("Agora insira o terceiro: ");
		float n3 = input.nextFloat();

		System.out.print("E por fim, insira o último: ");
		float n4 = input.nextFloat();

		input.close();

		float resultado1 = n1 * n2;
		float resultado2 = n3 * n4;
		float resultadofinal = resultado1 - resultado2;

		System.out.println("Ao multiplicarmos os dois primeiros números, o resultado é de: " + resultado1);
		System.out.println("Ao multiplicamos os dois últimos números, o resultado é de: " + resultado2);
		System.out.println("E o total da diferença entre esses dois resultados é de: " + resultadofinal);

	}

}
