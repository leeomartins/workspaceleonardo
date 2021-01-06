package repeticao;

import javax.swing.JOptionPane;

public class Ppt77Ex3 {

	public static void main(String[] args) {
		
		int contadorMedio = 0;
		int contadorSuperior = 0;
		int contadorPos=0;
		String escolaridade=" ";
		
		do {
		escolaridade = JOptionPane.showInputDialog("Informe o seu nível de escolaridade (Médio, Superior ou Pós)").toUpperCase();
		if (escolaridade.contains("POS")) {
			contadorPos=contadorPos+1;
			
		}
		else if (escolaridade.contains("PÓS")) {
			contadorPos=contadorPos+1;
		}
		else if (escolaridade.contains("SUPERIOR")) {
			contadorSuperior=contadorSuperior+1;
		
		}
		else if (escolaridade.contains("MEDIO")) {
			contadorMedio=contadorMedio+1;
			
		}
		else if (escolaridade.contains("MÉDIO")) {
			contadorMedio=contadorMedio+1;
			
		}
				
		//(escolaridade!="MÉDIO" && escolaridade!="MEDIO" && escolaridade!="PÓS" && escolaridade!="POS" && escolaridade!="SUPERIOR");
		//JOptionPane.showMessageDialog(null, "Informe um dado válido");
		} while (escolaridade.equals("MEDIO") || escolaridade.equals("MÉDIO") || escolaridade.equals("PÓS") || escolaridade.equals("POS") || escolaridade.equals("SUPERIOR")) ; {
			//JOptionPane.showMessageDialog(null, "Informe um dado válido");
		}
		
		if (contadorMedio>contadorSuperior && contadorMedio>contadorPos) {
			System.out.println("O grau de escolaridade com mais incidência é Ensino Médio com o total de :" + contadorMedio);
		} else if (contadorSuperior>contadorMedio && contadorSuperior>contadorPos) {
			System.out.println("O grau de escolaridade com mais incidência é Ensino Superior com o total de :" + contadorSuperior);
		}
		else  {
			System.out.println("O grau de escolaridade com mais incidência é Pós Graduação com o total de :" + contadorPos);
		}
		
		
		//System.out.println(contadorMedio);
		//System.out.println(contadorPos);
		//System.out.println(contadorSuperior);
		

	}

}



//System.out.println("Tem arroba? " + email.contains("@")); //Validação do ARROBA (TRUE OR FALSE) - BOOLEAN