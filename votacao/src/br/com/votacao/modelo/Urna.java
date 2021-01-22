package br.com.votacao.modelo;

import java.util.ArrayList;
import java.util.List;

public class Urna {

	
	private int zona;
	private int secao;
	private String cidade;
	
	
	List<Voto> votos = new ArrayList<Voto>();


	
	
	
	
	
	
	
	
	
	public void setAll(int zona, int secao, String cidade, List<Voto> lista) {
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		}


	@Override
	public String toString() {
		return "Urna [zona=" + zona + ", secao=" + secao + ", cidade=" + cidade + ", lista=" + votos + "]";
	}


	public Urna() {
		super();
	}


	public Urna(int zona, int secao, String cidade, List<Voto> votos) {
		super();
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.votos = votos;
	}


	public int getZona() {
		return zona;
	}


	public void setZona(int zona) {
		this.zona = zona;
	}


	public int getSecao() {
		return secao;
	}


	public void setSecao(int secao) {
		this.secao = secao;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public List<Voto> getLista() {
		return votos;
	}


	public void setLista(List<Voto> votos) {
		this.votos = votos;
	}
	
	public int totalVotos() {
		
		
		
		return votos.size();
	}
	
	
	
	
	
	
	
}
