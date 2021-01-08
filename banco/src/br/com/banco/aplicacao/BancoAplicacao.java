package br.com.banco.aplicacao;

import javax.swing.JOptionPane;

import br.com.banco.modelo.Agencia;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;
import br.com.banco.modelo.Gerente;

public class BancoAplicacao {
	
	
	// metodos estaticos nao exigem a instancia do objeto
	
	

	public static void main(String[] args) {
		
		
		
		
		
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Agencia agencia = new Agencia ();
		Conta conta = new Conta(
				
				
				Integer.parseInt(JOptionPane.showInputDialog("Numero da Conta")),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo:")),
				new Cliente (
						Integer.parseInt(JOptionPane.showInputDialog("Qual ID do cliente?")),
						JOptionPane.showInputDialog("Nome do cliente"),
						JOptionPane.showInputDialog("E-mail do cliente"),
						new Endereco (
								JOptionPane.showInputDialog("Informe o Logradouro"),
								JOptionPane.showInputDialog("Informe o bairro"),
								JOptionPane.showInputDialog("Informe a cidade"),
								JOptionPane.showInputDialog("Informe o UF"),
								JOptionPane.showInputDialog("Informe o CEP"),
								JOptionPane.showInputDialog("Informe o numero"),
								JOptionPane.showInputDialog("Informe o complemento")
								)

						),
				new Agencia (
						JOptionPane.showInputDialog("Informe o nome da Agencia"),
						Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da agencia")),
						new Endereco (
								JOptionPane.showInputDialog("Informe o Logradouro da Agencia"),
								JOptionPane.showInputDialog("Informe o bairro da Agencia"),
								JOptionPane.showInputDialog("Informe a cidade da Agencia"),
								JOptionPane.showInputDialog("Informe o UF da Agencia"),
								JOptionPane.showInputDialog("Informe o CEP da Agencia"),
								JOptionPane.showInputDialog("Informe o numero da Agencia"),
								JOptionPane.showInputDialog("Informe o complemento da Agencia")
								),
						JOptionPane.showInputDialog("Informe o telefone da Agencia"),
						Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da agencia"))
						),
				new Gerente (
						JOptionPane.showInputDialog("Informe o nome do Gerente"),
						JOptionPane.showInputDialog("Informe o telefone do Gerente"),
						JOptionPane.showInputDialog("Informe o email do Gerente"),
						Integer.parseInt(JOptionPane.showInputDialog("Informe a funcional do Gerente"))
						)
				);
				
				System.out.println(conta.getSaldo());
				System.out.println(cliente.getNome());
				System.out.println(cliente.getEndereco().getCidade());
				System.out.println(gerente.getNome());
				System.out.println(agencia.getNome());
				
				
			
				
				
				
				
				/*
				 * 
				 * System.out.println(cliente.getEndereco().getBairro());
				 * 
				 * 
				 * 
				 * 	Integer.parseInt(JOptionPane.showInputDialog("Codigo")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("email"),
				new Endereco (
						JOptionPane.showInputDialog("Logradouro"),
						JOptionPane.showInputDialog("Bairro"),
						JOptionPane.showInputDialog("Cidade"),
						JOptionPane.showInputDialog("UF"),
						JOptionPane.showInputDialog("CEP"),
						JOptionPane.showInputDialog("Numero"),
						JOptionPane.showInputDialog("Complemento")
						)
				 * 
				 * 
				 */	
	}

}
