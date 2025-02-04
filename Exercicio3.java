package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int codigo, quantidade;
		double precoUnitario = 0;
		String nomeDoProduto = "";

		System.out.print("Insira o código do produto consumido: \n" + "Código 1: Cachorro Quente\n"
				+ "Código 2: X - Salada\n" + "Código 3: X - Bacon\n" + "Código 4: Bauru\n" + "Código 5: Refrigerante\n"
				+ "Código 6: Suco de Laranja\n");
		codigo = leia.nextInt();

		System.out.print("Agora defina a quantidade: ");
		quantidade = leia.nextInt();

		switch (codigo) {
		case 1:
			nomeDoProduto = "Cachorro Quente";
			precoUnitario = 10.00;

			break;

		case 2:
			nomeDoProduto = "X - Salada";
			precoUnitario = 15.00;

			break;

		case 3:
			nomeDoProduto = "X - Bacon";
			precoUnitario = 18.00;

			break;

		case 4:
			nomeDoProduto = "Bauru";
			precoUnitario = 12.00;

			break;

		case 5:
			nomeDoProduto = "Refrigerante";
			precoUnitario = 8.00;

			break;

		case 6:
			nomeDoProduto = "Suco de Laranja";
			precoUnitario = 13.00;

			break;

		default:
			System.out.println("Códigos somente de 1 a 6.");

		}

		double resultado = precoUnitario * quantidade;

		System.out.println("Produto: " + nomeDoProduto);
		System.out.println("Preço Unitário: " + precoUnitario);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor total: " + resultado);

		leia.close();

	}

}
