package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina");
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Informe o numero de faltas"));

		if (faltas>20) {
			System.out.println("Voce foi reprovado na seguinte disciplina: " + disciplina);
		}
		else {


			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = (nota1 + nota2) / 2;


			if (media>=6) {
				System.out.println("Parabens voc� foi aprovado na disciplina: " + disciplina);
			}

			else if (media<4) {
				System.out.println("Voce foi reprovado na seguinte disciplina: " + disciplina);
			}

			else if (media>=4 && media<6) {

				System.out.println("Voce tem uma chance no exame da disciplina " + disciplina);
			}


			System.out.println("Media: " + media);
			System.out.println("Faltas: " + faltas);

		}

	}

}
