package br.com.ecommerceabc.modelo;

import br.com.ecommerceabc.util.PadraoPessoa;

public class Pessoa implements PadraoPessoa {

	private int id;
	private String nome;
	private String email;
	private Endereco endereco;
	
	
	
	
	
public String getResumo () {
	return null;
}
	
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + "]";
	}






	public void setAll (int id, String nome, String email, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}






	public Pessoa() {
		super();
	}






	public Pessoa(int id, String nome, String email, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}






	public String getServidor() {
		if (email.contains("@")) {
		return email.substring(email.indexOf("@")+1);
		}
		return "E-mail inválido";
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public Endereco getEndereco() {
		return endereco;
	}






	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	@Override
	public void setResumo(String param1, String param2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
