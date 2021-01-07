package br.com.concessionariaxyz.modelo;

public class Veiculo {
	
	
	private String montadora;
	private String modelo;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean status;
	private float valor;
	
	
	//Sintaxe dos metodos
	// <modificador> <tipo do retorno> <nome do método>(<tipo do param> <nome do param>)
	
	
	
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}
	public String retornarMontadora() {
		return montadora;
	}
	public void preencherModelo(String param) {
		modelo = param.toUpperCase();
	}
	public String retornarModelo() {
		return modelo;
	}
	public void preencherVelocidadeMaxima(float param) {
		if (param>0) {
		velocidadeMaxima = param;
		}
	}
	public float retonarVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void preencherValor(float param) {
		if (param>0) {
		valor = param;
		}
	}
	public float retornarValor() {
		return valor;
	}
	public String ligar() {
		if (status==false) {
			status=true;
			}
		return "Veiculo Ligado";
	}
	public String desligar() {
		if (status==true) {
			status=false;
			velocidadeAtual=0;
			}
		return "Veiculo Desligado";
	}
	public void acelerar() {
		if (velocidadeAtual<velocidadeMaxima && status==true) {
		velocidadeAtual+=10;
		}
	}
	public void desacelerar() {
		if (velocidadeAtual>0 && status==true) {
			velocidadeAtual-=10;
			}
	}
	public String verificarStatus() {
		return "Ligado?" + status + "\n" + "Velocidade Atual: " + velocidadeAtual;
	}
	public void acelerar (float param) {
		if (velocidadeAtual<velocidadeMaxima && status==true) {
			velocidadeAtual+=param;
		}
	}
	
	

}
