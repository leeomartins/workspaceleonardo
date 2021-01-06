package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {


		String nome = JOptionPane.showInputDialog("Digite o seu nome").toUpperCase();
		
		while (nome.length()<5 || nome.length()>20 || nome.contains(" ")==false) {
		nome = JOptionPane.showInputDialog("Numero de caracteres inválidos").toLowerCase();
		
		}
		
		//while (!nome.contains(" ")) {
			//nome = JOptionPane.showInputDialog("Digite o nome com o Sobrenome").toUpperCase();
		//}
		
		
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("Digite a sua idade"));
		while (idade<18 || idade>80) {
			idade = Byte.parseByte(JOptionPane.showInputDialog("Digite uma idade entre 18 e 80"));
		}
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sobrenome: " + nome.substring(nome.indexOf(" ")));
		
		//System.out.println("Quantidade de Cacteres: " + email.length()); // ---  CONTAGEM DE CARACTERES ---

		/*
		 * Validar nome e idade:
		 * o nome deve ter entre 5 e 20 caracteres
		 * e a idade deve estar entre 18 e 80 anos
		 * 
		 * 
		 * 
		 */

		


















	}

}
