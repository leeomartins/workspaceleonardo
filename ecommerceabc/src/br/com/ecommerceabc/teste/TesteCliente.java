package br.com.ecommerceabc.teste;

import br.com.ecommerceabc.modelo.Cliente;
import br.com.ecommerceabc.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {


		Cliente cliente = new Cliente ();
		
		
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
