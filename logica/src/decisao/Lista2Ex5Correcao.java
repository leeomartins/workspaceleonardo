package decisao;

import javax.swing.JOptionPane;

public class Lista2Ex5Correcao {

	public static void main(String[] args) {
		long numero1 = Long.parseLong(JOptionPane.showInputDialog("Informe o primeiro numero"));
		long numero2 = Long.parseLong(JOptionPane.showInputDialog("Informe o segundo numero"));
		long numero3 = Long.parseLong(JOptionPane.showInputDialog("Informe o terceiro numero"));

		if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
			System.out.println("Existem valores iguais");
		}
		else {

			if (numero1>numero2 && numero1>numero3) {
				System.out.println(numero1);
				if (numero2>numero3) {
					System.out.println(numero2);
					System.out.println(numero3);
				} else {
					System.out.println(numero3);
					System.out.println(numero2);
				}
			} else if (numero2>numero1 && numero2>numero3) {
				System.out.println(numero2);
				if (numero1>numero3) {
					System.out.println(numero1);
					System.out.println(numero3);
				}
			} else {
					System.out.println(numero3);
					System.out.println(numero1);
						}
			else {
				System.out.println(numero3);
				if (numero1>numero2 ) {
					System.out.println(numero1);
					System.out.println(numero2);
				}
				else {
					System.out.println(numero2);
					System.out.println(numero1);
					}
				}
			}
		}
	}


/*
 * 
 *  int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Valor3"));
		if (valor1==valor2 || valor1==valor3 || valor2==valor3) {
			System.out.println("Existem valores iguais");
		}else {	
			if (valor1>valor2 && valor1>valor3) {
				System.out.println(valor1);
				if (valor2>valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);
				}
			}else if (valor2>valor3 && valor2>valor1) {
				System.out.println(valor2);
				if (valor1>valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);
				}
			}else {
				System.out.println(valor3);
				if (valor1>valor2) {
					System.out.println(valor1);
					System.out.println(valor2);
				}else {
					System.out.println(valor2);
					System.out.println(valor1);
				}
			}
		}
 */
	
