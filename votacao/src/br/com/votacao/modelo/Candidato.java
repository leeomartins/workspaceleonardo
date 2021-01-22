package br.com.votacao.modelo;

public class Candidato extends Pessoa {

	private int numero;
	private String cargo;
	private String partido;
	
	
	public void setAll(int id, String nome, String email, int numero, String cargo, String partido) {
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
	}
	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", cargo=" + cargo + ", partido=" + partido + "]";
	}
	public Candidato() {
		super();
	}
	public Candidato(int id, String nome, String email, int numero, String cargo, String partido) {
		super(id, nome, email);
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	
	
	
	
	
	
}