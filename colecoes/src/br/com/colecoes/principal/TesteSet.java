package br.com.colecoes.principal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {


		Set <String> lista = new HashSet <String>();
		
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("GERENTE DE PROJETOS");
		lista.add("GERENTE");
		lista.add("TRAINEE");
		
		
		System.out.println(lista);
		
		
		
		System.out.println("Tem DBA? " + lista.contains("DBA"));
		
		for (String cargo: lista) 
		{
		System.out.println("Cargo: " + cargo);	
		}
		

	}

}
