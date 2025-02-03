package theThree;

import java.util.Locale;
import java.util.Scanner;

public class TheThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.print("Vamos fazer o cálculo do seu salário líquido?\n"
				+ "Para isso, insira o valor do seu salário bruto: R$ ");
		float salariobruto = input.nextFloat();
		
		System.out.print("Agora insira o valor do adicional noturno (caso possua): ");
		float adicionalnoturno = input.nextFloat();
		
		System.out.print("Você possui horas extras? Se sim, insira o valor: R$ ");
		float horaextra = input.nextFloat();
		
		System.out.print("Por fim, insira o valor dos descontos: R$ ");
		float descontos = input.nextFloat();
		
		input.close();
		
		float salarioliquido = salariobruto + adicionalnoturno + (horaextra * 5) - descontos;
		
		System.out.print("O valor do seu salário líquido é de R$ " + salarioliquido);
		
		
		
		
		

	}

}
