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
	
	
	
	public String calcularSalario (int qtdeHoras) {
		float salarioBruto =(float) (valorHora+1.06) *qtdeHoras;
		float fgts = salarioBruto * (float) 0.08;
		float salarioLiquido = salarioBruto - fgts;
		return "Salario Bruto: " + salarioBruto +"\n" + "FGTS: " + fgts + "\n" + "Salario Liquido: " + salarioLiquido;
		
				}
	
	public String getSaudacao() {
		String primeiroNome=nome;
		if(nome.contains(" ")==true) {
			primeiroNome = nome.substring(0,nome.indexOf(" "));
		}
		if (formacao.toUpperCase().equals("DOUTOR")==true) {
			return "PhD " + primeiroNome;
		}
		else if (formacao.toUpperCase().equals("MESTRE")==true) {
			return "Ms. " + primeiroNome; 
		}
		else if (formacao.toUpperCase().equals("ESPECIALISTA")==true) {
			return "Especialista " + primeiroNome;
		}
		else {
			return "Sem formação: " + primeiroNome;
		}
		 
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
