package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		int valor1=0;
		int valor2=0;
		do {
			valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1"));
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2"));
			JOptionPane.showMessageDialog(null,  "Resultado: " + (valor1+valor2));
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);





	}

}
