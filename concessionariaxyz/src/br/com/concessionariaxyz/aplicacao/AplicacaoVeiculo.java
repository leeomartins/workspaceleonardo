package br.com.concessionariaxyz.aplicacao;

import javax.swing.JOptionPane;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Criar um objeto => ele nao possui qualquer repartição
		 * exemplo: veiculo objeto;
		 * instanciar um objeto => ele possui todas as repartições
		 * exemplo: Veiculo objeto = new Veiculo();
		 * 
		 */
		
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("fiaIAT");
		
		
		objeto.preencherModelo("PALIO");
		objeto.preencherVelocidadeMaxima(200);
		objeto.preencherValor(60000);
		
		
		
		
		System.out.println(objeto.retornarMontadora());
		System.out.println(objeto.retornarModelo());
		System.out.println(objeto.retornarValor());
		System.out.println(objeto.retonarVelocidadeMaxima());
		
		objeto.ligar();
		
	
		System.out.println(objeto.ligar());
		
		objeto.acelerar(10);
		objeto.acelerar(20);
		objeto.acelerar(80);
		System.out.println(objeto.verificarStatus());
		objeto.desacelerar();
		objeto.desacelerar();
		System.out.println(objeto.verificarStatus());
		
		
		System.out.println(objeto.desligar());
		
		
		
		
		
		
		
		
		
		
		

	}

}
