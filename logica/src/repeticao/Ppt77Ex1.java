package repeticao;

import javax.swing.JOptionPane;

public class Ppt77Ex1 {

	public static void main(String[] args) {
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		do {
					
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento"));
		if (dia<1 || dia>31) {
		JOptionPane.showMessageDialog(null, "Informe um dia válido");	
		}
		}
		while (dia<1 || dia>31); {
		}
		
		do {
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento"));
		if (mes<1 || mes>12) {
		JOptionPane.showMessageDialog(null, "Informe um mes válido");
		}
		}
		while (dia<1 || dia>12); {
		}
		
		do {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento com 4 dígitos"));
			if (ano<1900 || ano>2021) {
			JOptionPane.showMessageDialog(null, "Informe um ano válido");
			}
			}
			while (ano<1900 || ano>2021); {
			}
		
		System.out.println("A data de nascimento informada é " + dia +"/" + mes + "/" + ano);
		}

	}


