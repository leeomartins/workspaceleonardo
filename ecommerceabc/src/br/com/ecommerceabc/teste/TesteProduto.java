package br.com.ecommerceabc.teste;

import br.com.ecommerceabc.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		
		Produto produto = new Produto();
		produto.setDescricao("Churros");
		produto.setQtde(10);
		produto.setValorVenda(8);
		produto.setValorCompra(5);
		produto.setId(1);
		
		System.out.println("Produto" + produto.getDescricao());
		System.out.println("Promoção" + produto.getPromocao(20));
		System.out.println("Valor venda" + produto.getValorVenda());
		
		produto.atualizarValores(10);
		
		
		System.out.println(produto.getAll());
		System.out.println(produto.verificarEstoque());
		System.out.println("Total de compras:" + produto.getTotalCompras());
		System.out.println("Total de vendas" + produto.getTotalVendas());
		
		
		
		
		
		
		
		
		
		
	}

}
