package br.com.universidadexpto.modelo;

public class Professor {

	private String nome;
	private float valorHora;
	private String formacao;
	private String area;
	private String email;
	
	
	
	
	
	
	
		
	public void setAll (String nome, float valorHora, String formacao, String area, String email) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", valorHora=" + valorHora + ", formacao=" + formacao + ", area=" + area
				+ ", email=" + email + "]";
	}

	public Professor() {
		super();
	}

	public Professor(String nome, float valorHora, String formacao, String area, String email) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public float calcularSalario (int qtdeHoras) {
		float salarioBruto=0;
		float salarioLiquido=0;
		salarioBruto=(valorHora*qtdeHoras)*(float)1.06 ;
		salarioLiquido=salarioBruto*(float) 0.92;
		return salarioLiquido;
				}
	
	public String getSaudacao() {
		if (formacao=="DOUTOR" || formacao=="DR") {
			return "PhD " + nome.toUpperCase();
			}
		else if (formacao=="MESTRE") {
			return "Ms. " + nome.toUpperCase();
		}
		else if (formacao=="ESPECIALISTA") {
			return "Especialista" + nome.toUpperCase();
		}
		else return "Bem vindo";
		 
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
