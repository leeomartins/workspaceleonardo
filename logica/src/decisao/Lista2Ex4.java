package decisao;

import javax.swing.JOptionPane;

public class Lista2Ex4 {

	public static void main(String[] args) {
		long numero1 = Long.parseLong(JOptionPane.showInputDialog("Informe o primeiro numero"));
		long numero2 = Long.parseLong(JOptionPane.showInputDialog("Informe o segundo numero"));
		long numero3 = Long.parseLong(JOptionPane.showInputDialog("Informe o terceiro numero"));
		
		if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
			System.out.println("Existem valores iguais");
		}
     	else if (numero1<=numero2 && numero2<=numero3) {
			System.out.println("A sequencia crescente �: " + numero1 + ", " + numero2 + ", " + numero3);
		}
		else if (numero2<=numero1 && numero1<=numero3) {
			System.out.println("A sequencia crescente �: " + numero2 + ", " + numero1 + ", " + numero3);
		}
		else if (numero3<=numero1 && numero1<=numero2) {
			System.out.println("A sequencia crescente �: " + numero3 + ", " + numero1 + ", " + numero2);
		}
		else if (numero1<=numero3 && numero3<=numero2) {
			System.out.println("A sequencia crescente �: " + numero1 + ", " + numero3 + ", " + numero2);
		}
		else if (numero2<=numero3 && numero3<=numero1) {
			System.out.println("A sequencia crescente �: " + numero2 + ", " + numero3 + ", " + numero1);
		}
		else if (numero3<=numero2 && numero2<=numero1) {
			System.out.println("A sequencia crescente �: " + numero3 + ", " + numero2 + ", " + numero1);
		}
     		}
	}

