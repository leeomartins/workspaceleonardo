package repeticao;

import javax.swing.JOptionPane;

public class Ppt77Ex4 {

	public static void main(String[] args) {
		String nome =" ";
		short idade=0;
		short maioresIdade=0;
		short pessoas=0;
		short totalIdades=0;
		short idadeMaisExp=0;
		String nomeMaisExp="";
		short idadeMaisJovem=0;
		String nomeMaisJovem="";
		
		do {
			nome = JOptionPane.showInputDialog("Digite o Nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a Idade"));
			
			if (idade>=18) {
			maioresIdade = (short) (maioresIdade + 1);
			// maioresIdade++
			// maioresIdade+=1
			}
			
			pessoas++;
			totalIdades+=idade; //totalIdades=totalIdades+idade;
			if (idade>idadeMaisExp) {
				idadeMaisExp=idade;
				nomeMaisExp=nome;
				}
			
			if (idade<idadeMaisJovem || pessoas==1) {
				idadeMaisJovem=idade;
				nomeMaisJovem=nome;
			}
			
			
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Maiores de idade: " + maioresIdade);
		System.out.println("Media das idades:" + totalIdades/pessoas);
		System.out.println("A pessoa mais experiente é a " + nomeMaisExp + " com " + idadeMaisExp + " anos. ");
		System.out.println("A pessoa mais jovem é a " + nomeMaisJovem + " com " + idadeMaisJovem + " anos. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
