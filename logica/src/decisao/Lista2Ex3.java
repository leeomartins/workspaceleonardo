package decisao;

import javax.swing.JOptionPane;

public class Lista2Ex3 {

	public static void main(String[] args) {
		
		long numero1 = Long.parseLong(JOptionPane.showInputDialog("Informe o primeiro numero"));
		long numero2 = Long.parseLong(JOptionPane.showInputDialog("Informe o segundo numero"));
		char simbolo = JOptionPane.showInputDialog("Informe o simbolo da operação desejada").charAt(0);
		// String operador = JOptionPane.showInputDialog ("Informe o simbolo da operação desejada");
		
		// if (operator.equals("+)) {		
		if (simbolo=='+') {
			System.out.println("O valor da operação é: " + (numero1 + numero2));
		}
		
		else if (simbolo=='-') {
			System.out.println("O valor da operação é: " + (numero1 - numero2));
		}
		
		else if (simbolo=='*') { 
			System.out.println("O valor da operação é: " + (numero1 * numero2));
		}
		
		else if (simbolo=='/') { 
			System.out.println("O valor da operação é: " + (numero1 / numero2));
		}
		
	}

	}


