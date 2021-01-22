package br.com.votacao.implementacao;

import br.com.votacao.modelo.Urna;
import br.com.votacao.util.Magica;

public class ImplementarVoto {

	public static void main(String[] args) {
		
		
		
	 Urna urna = new Urna();
	 
	 urna.setAll(Magica.i("Digite o numero da Zona Eleitoral:"), 
			 Magica.i("Digite o numero da Seção Eleitoral:"), 
			 Magica.s("Digite a cidade"), null 
			 );
		
		
		
	System.out.println(urna);
	
		
		
		
		
		
		//Magica.s("Qual o numero da urna?");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
