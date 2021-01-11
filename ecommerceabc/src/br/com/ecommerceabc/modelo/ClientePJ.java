package br.com.ecommerceabc.modelo;

import br.com.ecommerceabc.util.PadraoPessoa;

public class ClientePJ extends Pessoa implements PadraoPessoa {
	
	private String cnpj;
	private String nome;
	private String dtAbertura;

		
	
	public void setAll (int id, String nome, String email, Endereco endereco, String cnpj, String nome2,
			String dtAbertura) {
		super.setAll(id, nome, email, endereco);
		this.cnpj = cnpj;
		nome = nome2;
		this.dtAbertura = dtAbertura;
	}


	@Override
	public String toString() {
		return "ClientePJ [cnpj=" + cnpj + ", nome=" + nome + ", dtAbertura=" + dtAbertura + "pessoa" + super.toString()+"]";
	}


	public ClientePJ() {
		super();
	}


	public ClientePJ(int id, String nome, String email, Endereco endereco, String cnpj, String nome2,
			String dtAbertura) {
		super(id, nome, email, endereco);
		this.cnpj = cnpj;
		nome = nome2;
		this.dtAbertura = dtAbertura;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}


	@Override
	public void setResumo(String param1, String param2) {
		cnpj=param1;
		setNome(param2);
		
	}
	
	

	
	

}
