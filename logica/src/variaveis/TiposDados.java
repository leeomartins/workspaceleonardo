package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {

/*
 * Existem dois tipos de dados
 * 
 *  - Alfanumerico: � o dado que nao vai ser utilizado em uma express�o matem�tica
 *  	
 *  
 *  - Num�rico: � o dado que PODE ser usado em uma express�o matem�tica
 */
		
		/* 
		 * Nome da variavel = identificador
		 * 
		 * Regras: 
		 *  - 1�: N�o come�ar�s com n�meros. 1berto (n�o pode)
		 *  - 2�: N�o far�s uso de palavras reservadas int. (n�o pode), class (nao pode)
		 *  - 3�: N�o usar�s caracteres especiais. d@t@ (n�o pode), nome cliente (nao pode)
		 *  
		 * Padroes:
		 *  - Nomes significativos. Evitem x, n1, xpto
		 *  - Come�ar com letra minuscula
		 *  - padr�o CamelCase (dataNascimento) ou (data_Nascimento) 
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
