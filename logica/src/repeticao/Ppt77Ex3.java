package repeticao;

import javax.swing.JOptionPane;

public class Ppt77Ex3 {

	public static void main(String[] args) {
		
		int contadorMedio = 0;
		int contadorSuperior = 0;
		int contadorPos=0;
		String escolaridade=" ";
		
		do {
		escolaridade = JOptionPane.showInputDialog("Informe o seu n�vel de escolaridade (M�dio, Superior ou P�s)").toUpperCase();
		if (escolaridade.contains("POS")) {
			contadorPos=contadorPos+1;
			
		}
		else if (escolaridade.contains("P�S")) {
			contadorPos=contadorPos+1;
		}
		else if (escolaridade.contains("SUPERIOR")) {
			contadorSuperior=contadorSuperior+1;
		
		}
		else if (escolaridade.contains("MEDIO")) {
			contadorMedio=contadorMedio+1;
			
		}
		else if (escolaridade.contains("M�DIO")) {
			contadorMedio=contadorMedio+1;
			
		}
				
		//(escolaridade!="M�DIO" && escolaridade!="MEDIO" && escolaridade!="P�S" && escolaridade!="POS" && escolaridade!="SUPERIOR");
		//JOptionPane.showMessageDialog(null, "Informe um dado v�lido");
		} while (escolaridade.equals("MEDIO") || escolaridade.equals("M�DIO") || escolaridade.equals("P�S") || escolaridade.equals("POS") || escolaridade.equals("SUPERIOR")) ; {
			//JOptionPane.showMessageDialog(null, "Informe um dado v�lido");
		}
		
		if (contadorMedio>contadorSuperior && contadorMedio>contadorPos) {
			System.out.println("O grau de escolaridade com mais incid�ncia � Ensino M�dio com o total de :" + contadorMedio);
		} else if (contadorSuperior>contadorMedio && contadorSuperior>contadorPos) {
			System.out.println("O grau de escolaridade com mais incid�ncia � Ensino Superior com o total de :" + contadorSuperior);
		}
		else  {
			System.out.println("O grau de escolaridade com mais incid�ncia � P�s Gradua��o com o total de :" + contadorPos);
		}
		
		
		//System.out.println(contadorMedio);
		//System.out.println(contadorPos);
		//System.out.println(contadorSuperior);
		

	}

}



//System.out.println("Tem arroba? " + email.contains("@")); //Valida��o do ARROBA (TRUE OR FALSE) - BOOLEAN