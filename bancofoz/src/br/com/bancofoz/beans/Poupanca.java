package br.com.bancofoz.beans;

import br.com.bancofoz.util.Magica;
import br.com.bancofoz.util.PadraoConta;

public class Poupanca extends Conta implements PadraoConta {

	private float rendimento;

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	public Poupanca(float rendimento) {
		super();
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public boolean depositar (float valor) {
		if (valor>0) {
			setSaldo(valor+getSaldo());
			return true;
		}
		else
			return false;
	}

	public boolean sacar (float valor) {
		if (getSaldo()<valor){
			return false;
		}
		else { 
			setSaldo(getSaldo()-valor);
			return true;
		}

	}

	public void creditarRendimentos() {
		setSaldo(getSaldo()*(1+(rendimento/100)));
	}

	public float verificarSaldo() {
		return super.getSaldo();
	}


}
