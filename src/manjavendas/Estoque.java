package manjavendas;
import java.util.Scanner;
import java.util.ArrayList;

public class Estoque {

	ArrayList<Item> item = new ArrayList<>();

	public void adicionaItem(Item produto) {
		item.add(produto);
	}

	public void imprimeRelatorio() {
		for (Item produtos : item) {
			System.out.println(item);
			break;
		}
	}

	public void localizaItem(Item x) {
		for (int i = 0; i < item.size(); i++) {
			if (item.contains(x)) {
				System.out.println("JÁ POSSUI " + x.getNome() + " CADASTRADO");
			} else {
				System.out.println("NÃO POSSUI O OBJETO CADASTRADO.");
			}
		}
	}

}
