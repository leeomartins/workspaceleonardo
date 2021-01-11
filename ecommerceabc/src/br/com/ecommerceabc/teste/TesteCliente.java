package br.com.ecommerceabc.teste;

import br.com.ecommerceabc.modelo.Pessoa;
import br.com.ecommerceabc.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {


		Pessoa cliente = new Pessoa ();
		
		
		cliente.setId(1);
		cliente.setNome("Leon");
		cliente.setEmail("xpto@itau.com");
		
		Endereco endereco = new Endereco ();
		cliente.setEndereco(endereco);
		endereco.setLogradouro("Av Paulista");
		endereco.setBairro("Jd Brasil");
		endereco.getCidade("Sao Paulo");
		endereco.setCep("12345-123");
		endereco.setComplemento("BLOCO 10 AP 10");
		endereco.setNumero("1330");
		endereco.setUf("SP");
		
		
		System.out.println(cliente.toString());
		
		
		
		
		
		
		
	}

}
