package br.com.colecoes.principal;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TestMap {

	public static void main(String[] args) {

		//Map <"chave-set", "valores-list">
		
		Map<Integer,Cargo> lista = new HashMap<Integer, Cargo>();
		lista.put(1,  new Cargo("DBA", "JR", 5000));
		lista.put(2,  new Cargo("DBA", "PL", 7000));
		lista.put(3,  new Cargo("DBA", "SR", 9000));
		System.out.println(lista);
		
		for (Cargo c : lista.values()) {
			System.out.println(c.getNome());
			System.out.println(c.getSalario());
			}
		System.out.println("Chaves:" + lista.keySet());
		
	}

}
