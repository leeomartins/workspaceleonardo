package br.com.elevador.aplicacao;

import br.com.elevador.modelo.Elevador;

public class ElevadorAplicacao {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador();
		
		objeto.inicializar((short) 20,(short) 30,(short) 0);
		
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.entrar((short) 15);
		objeto.subir();
		objeto.descer();
		objeto.subir();
		objeto.subir();
		objeto.entrar((short) 15);
		objeto.subir();
		objeto.descer();
		objeto.subir();
		objeto.subir();
		objeto.sair((short) 8);
		objeto.descer();
		objeto.subir();
		objeto.subir();
		
		System.out.println(objeto.verificarStatus());
		
		
	}

}
