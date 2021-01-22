package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {


		List<String> lista = new ArrayList<String>();
		
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("GERENTE DE PROJETOS");
		lista.add("GERENTE");
		lista.add("TRAINEE");
		lista.add("PL");
		lista.add("SR");
		lista.add("JR");
		lista.add("ESPEC");
		lista.add("SPTE");
		System.out.println(lista);
		System.out.println("Elemento 1: " + lista.get(0));
		lista.remove(0);
		lista.remove(0);
		System.out.println("Elemento 1: " + lista.get(0));
		
		Collections.sort(lista);
		
		//Foreach
		
		
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}
		
		
		
		
		
		
		
		
		//for tradicional
		
		
		
		
		System.out.println("Lista ordenada: " + lista);
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
