package br.com.bancofoz.teste;

import javax.swing.JOptionPane;

import br.com.bancofoz.beans.Cliente;
import br.com.bancofoz.beans.Conta;
import br.com.bancofoz.beans.Corrente;
import br.com.bancofoz.beans.Poupanca;
import br.com.bancofoz.util.Magica;

public class ImplementarConta {

	public static void main(String[] args) {

		
		Conta conta = null;
		
		
		char resp = JOptionPane.showInputDialog("Digite <1> para Corrente").charAt(0);
		if (resp=='1') {
			conta = new Corrente (
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					0,
					new Cliente (
							Magica.i("Codigo do Cliente"),
							Magica.s("Nome do Cliente"),
							Magica.s("CPF"),
							Magica.s("Telefone")
							),
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
					
		} else {
			new Poupanca (
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					0,
					new Cliente (
							Magica.i("Codigo do Cliente"),
							Magica.s("Nome do Cliente"),
							Magica.s("CPF"),
							Magica.s("Telefone")
							),
					Magica.f("Rendimento")
					);
		}
		
		System.out.println(conta.depositar(Magica.f("Valor depositado")));
		System.out.println(conta.toString());
		System.out.println(conta.sacar(Magica.f("Sacar")));
		System.out.println(conta.verificarSaldo());
		
		
		
		
		
		
		/*
		 * 
		 * char resp = JOptionPane.showInputDialog("Digite:\n<F> Fisica\n<J> Juridica\n<C> Colaborador").toUpperCase().charAt(0);
		if (resp=='F') {
			pessoa=new ClientePF();
		} else if (resp=='J') {
			pessoa=new ClientePJ();
		} else if (resp=='C') {
			pessoa=new Colaborador();
		} else {
			System.out.println("Opção inválida");
		}

		pessoa.setResumo("XPTO", "abc");
		
		System.out.println(pessoa.getResumo());
		
		 * 
		 */
		
		
		

	}

}
