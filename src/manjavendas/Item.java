package manjavendas;

import java.util.ArrayList;

public class Item {
	private String nome;
	private float precoCusto;
	private float precoVenda;
	private int qtd;
	private String descricao;
	private float tamanho;

	/**
	 * 
	 * @param nome
	 *            do item inicializado
	 * @param precoCusto
	 *            refere-se ao preço unitário de compra do item inicializado
	 * @param precoVenda
	 *            refere-se ao preço de venda unitário estabelecido e
	 *            inicializado
	 * 
	 * @param qtd,
	 *            descricao e tamanho inicializados por valores zerados ou
	 *            nulos.
	 */
	public Item(String nome, float precoCusto, float precoVenda) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		qtd = 0;
		descricao = null;
		tamanho = 0;
	}

	/**
	 * @return o nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param qtd
	 *            para definir a quantidade do item/produto.
	 */
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	/**
	 * @param descricao
	 *            para inserir características do item
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @param tamanho
	 *            para inserir tamanho do item.
	 */
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return String.format("\n-Nome: %s \n-Preco de Venda: %.2f \n-Quantidade: %d \n-Descricao: %s\n", nome,
				precoVenda, qtd, descricao);

	}

}
