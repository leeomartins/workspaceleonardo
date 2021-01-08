package br.com.banco.modelo;

public class Cliente {

	
		
		
		
		private int id;
		private String nome;
		private String email;
		private Endereco endereco;
		
		
		
		
		
		
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






		public Cliente() {
			super();
		}






		public Cliente(int id, String nome, String email, Endereco endereco) {
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
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



}
