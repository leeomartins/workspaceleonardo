package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {
		
		/*
		 * 
		 * String nome = JOptionPane.showInputDialog("Digite o seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		 */
		
		String nomeProduto = JOptionPane.showInputDialog("Entre com o nome do Produto");
		String categoria = JOptionPane.showInputDialog("Entre com a categoria do Produto");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque"));
		double imposto = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de imposto"));
		
		
		double totalSemImposto = valor * quantidade;
		double totalComImposto = totalSemImposto + totalSemImposto * (imposto/100);
		double valorImposto = valor * (imposto/100);
		double totalDesconto = totalComImposto - (valor/10);
		
		
		//System.out.println("Nome do produtp: " + nomeProduto);
		//System.out.println("Categoria: " + categoria);
		//System.out.println("Valor: R$" + valor);
		//System.out.println("Quantidade: " + quantidade);
		//System.out.println("Imposto: " + imposto + "%");
		
		System.out.println("Total Sem imposto: " + totalSemImposto);
		System.out.println("Total com imposto: " + totalComImposto);
		System.out.println("Valor do imposto: " + valorImposto);
		System.out.println("Valor a vista " + totalDesconto);
		
		
		

	}

}