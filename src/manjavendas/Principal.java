package manjavendas;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nome, descricao;
		int qtd, opcao;
		float valorVenda, tamanho;
		Estoque inventario = new Estoque();

		Scanner name = new Scanner(System.in);
		Scanner quantidade = new Scanner(System.in);
		Scanner detalhes = new Scanner(System.in);
		Scanner preco = new Scanner(System.in);
		Scanner dimensoes = new Scanner(System.in);
		Scanner opt = new Scanner(System.in);

		System.out.println("**** TELA DE CONTROLE DE ESTOQUE ****\n");
		do {
			System.out.println("1)ADICIONAR\n 2)LOCALIZAR\n 3)IMPRIMIR RELATÓRIO\n 4)SAIR");
			opcao = opt.nextInt();

			if (opcao == 1) {
				System.out.println("Nome do produto: ");
				nome = name.nextLine();
				Item i = new Item(nome, 0, 0);
				System.out.println("Quantidade do produto: ");
				qtd = quantidade.nextInt();
				System.out.println("Descricao do produto: ");
				descricao = detalhes.nextLine();
				i.setDescricao(descricao);
				i.setQtd(qtd);
				inventario.adicionaItem(i);
			} else if (opcao == 2) {
				//inventario.localizaItem(i);
			} else if (opcao == 3) {
				inventario.imprimeRelatorio();
			} else if (opcao == 4) {
				System.out.println("\n**** SAINDO ****");
			}
		} while (opcao != 5);
	}
}