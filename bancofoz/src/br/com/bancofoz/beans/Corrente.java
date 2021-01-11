package br.com.bancofoz.beans;

import javax.swing.JOptionPane;

import br.com.bancofoz.util.Magica;
import br.com.bancofoz.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta {


	private float limite;
	private float taxa;


	public void setAll(float limite, float taxa) {
		this.limite = limite;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Corrent [limite=" + limite + ", taxa=" + taxa + "]";
	}






	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public Corrente() {
		super();
	}

	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}

	@Override
	public boolean sacar(float param1) {
		if (param1 > (getSaldo()+limite)){ 
			return false;
		} else {
			setSaldo(getSaldo()-param1);
			return true;
		}
	}



	@Override
	public boolean depositar(float param2) {

		if (param2>0) {
			setSaldo(param2+getSaldo());
			return true;
		}
		else
			return false;
	}


	public void debitarTaxa () {
		setSaldo(getSaldo()-taxa);
	}

	public void aumentarLimite (float porc) {
		setLimite(getLimite()*(1+(porc/100)));		
	}


	public float verificarSaldo() {
		return super.getSaldo()+limite;
	}









}







