package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		int valor1 = 0;
		int valor2 = 0;
		int contador=0;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, Digite um numero:"));
		do {
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, tente adivinhar o numero do Jogador 1"));
			contador = contador+1; //tem que estar dentro da estrutura DO
			if (valor2>valor1) {
				JOptionPane.showMessageDialog(null, "Voce esta chutando alto");
			}
			else if (valor2<valor1) {
				JOptionPane.showMessageDialog(null, "Voce esta chutando baixo");
			}
		} 
			
		while(valor1!=valor2); {
			
		}
		
		JOptionPane.showMessageDialog(null, "Parabens, voce acertou em " + contador + " tentativa(s)");



		/*
		 * 
		 * 1 Fase:
		 * Jogador1 => vai digitar um numero
		 * Jogador2 => vai tentar adivinhar o numero digitado pelo Jogador1
		 * Quando ele acertar, mostra a mensagem de "Parabens"1
		 * 
		 * 2 Fase:
		 * Implemente dicas para o Jogador2
		 * "Numero � menor" ou "Numero � maior"
		 * 
		 * 3 Fase:
		 * Contar quantas tentativas o Jogador2 utilizou para acertar
		 * No final exibir a quantidade junto a mensagem de parabens
		 * 
		 */

	}

}
