package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * boolean = dado lógico (true /false) - Boolean
		 * char = 1 caracter (entre apostrofos) - Character
		 *  -- Para numeros inteiros -- 
		 * byte = -127 até +128 (Byte)
		 * short = -32k ate +32k (Short)
		 * int = -2 bi ate +2bi (Integer)
		 * long = (Long)
		 * 
		 * -- para numeros reais
		 * 
		 * float = até duas casas decimais
		 * double = dobro de precisão nas casas decimais quanado comparado ao float
		 * 
		 */
		
		
		/*
		 * String nome = JOptionPane.showInputDialog("Digite o seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		 */

		
		float semestral1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a primeira nota semestral"));
		float semestral2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a segunda nota semestral"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas"));
		String disciplina = JOptionPane.showInputDialog("Nome da disciplina");
		float media = (semestral1 + semestral2) / 2;
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Faltas: " + faltas);
		System.out.println("Média: " + media);
		
		
	}

}
