package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Input: produto - quantidade - valor unitario
		 * Preciso avaliar o estoque
		 *  - Se a qtde estiver entre 10 e 20 - valor unit�rio tera 10% de redu��o
		 *  - Se a qtde estiver entre 5 e 9 - valor unit�rio tera 5% de redu��o
		 *  - Se a qtde for menor que 5 - sem redu��o
		 *  - Se a qtde for maior que 20 - 12% de redu��o
		 *  
		 *  No final, exibir o valor do produto atualizado
		 */
		
		
		String produto = JOptionPane.showInputDialog("Qual o nome do produto?").toUpperCase();
		short quantidade = Short.parseShort(JOptionPane.showInputDialog("Qual a quatidade do produto?"));
		float valorUnitario = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor unit�rio do produto?"));
	
		
		if (quantidade>20) {
			valorUnitario = valorUnitario * (float) 0.88;
			
		}
		
		
		
		else if (quantidade>=10 && quantidade<=20) {
			
			valorUnitario = valorUnitario * (float) 0.9;
						
			
		}
				
		
		else if (quantidade>=5 && quantidade<=9) {
			
			
			valorUnitario = valorUnitario * (float) 0.95;
			
			}
		
		System.out.println("O valor do produto " + produto + " � R$" + valorUnitario);
		
		
			
		

	}

}
