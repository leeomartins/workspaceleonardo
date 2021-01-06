package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {

/*
 * Existem dois tipos de dados
 * 
 *  - Alfanumerico: é o dado que nao vai ser utilizado em uma expressão matemática
 *  	
 *  
 *  - Numérico: é o dado que PODE ser usado em uma expressão matemática
 */
		
		/* 
		 * Nome da variavel = identificador
		 * 
		 * Regras: 
		 *  - 1º: Não começarás com números. 1berto (não pode)
		 *  - 2º: Não farás uso de palavras reservadas int. (não pode), class (nao pode)
		 *  - 3º: Não usarás caracteres especiais. d@t@ (não pode), nome cliente (nao pode)
		 *  
		 * Padroes:
		 *  - Nomes significativos. Evitem x, n1, xpto
		 *  - Começar com letra minuscula
		 *  - padrão CamelCase (dataNascimento) ou (data_Nascimento) 
		 *  
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso / (altura * altura);
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + imc);	
		
		
		
		
		
		
		
		

	}

}
