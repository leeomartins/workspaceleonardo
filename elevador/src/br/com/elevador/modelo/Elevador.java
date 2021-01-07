package br.com.elevador.modelo;

public class Elevador {
	
	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short qtdePessoas;
	private short andarAtual;
	
	
	
	
		//Sintaxe dos metodos
		// <modificador> <tipo do retorno> <nome do método>(<tipo do param> <nome do param>)
		
	public void inicializar (short capacidade, short maior, short menor) {
		capacidadeMaxima = capacidade;
		andarMaximo = maior;
		andarMinimo=menor;
	}
	
	public String verificarStatus() {
		return "Qtde de Pessoas: " + qtdePessoas + "\n" + "Andar Atual: " + andarAtual + "\n" + "Capacidade Maxima: " + capacidadeMaxima;
	}
	
	public void subir () {
		if (andarAtual<andarMaximo) {
		andarAtual+=1;
		}
	}
	
	public void descer () {
		if (andarAtual>andarMinimo) {
		andarAtual-=1;
		}
	}
	public void entrar(short qtde) {
		short resultado = (short) (qtde + qtdePessoas);
		if (resultado<=capacidadeMaxima) {
		qtdePessoas+=qtde;
		}
	}
	public void sair () {
		qtdePessoas-=1;
	}
	public void sair (short qtde) {
		short resultado = (short) (qtdePessoas-qtde);
		if (resultado>=0) {
		qtdePessoas-=qtde;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
