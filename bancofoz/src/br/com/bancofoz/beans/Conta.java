package br.com.bancofoz.beans;

import br.com.bancofoz.util.PadraoConta;


/*
 * Polimorfismo � o recurso onde um mesmo m�todo pode ser invocado de divesas formas:
 * Ex: mesmo nome
 * 
 * Encontramos 2 tipos de polimorfismos:
 * 
 * 1� Override (Sobrescrita) => M�todos est�o em classes diferentes (Possuem assinaturas iguais)
 * 2� Overload (Sobrecarga) => M�todos est�o na mesma classe (possuem assinaturas distintas) 
 * 
 * 
 */



public class Conta implements PadraoConta {

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	public float verificarSaldo () {
		return 0;
	}
	
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}

	public Conta() {
		super();
	}

	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public byte getDigito() {
		return digito;
	}
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	public short getAgencia() {
		return agencia;
	}
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public boolean sacar(float param1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositar(float param2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
}
