package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TestListObjeto {

	public static void main (String[] args) {

		List<Cargo> lista = new ArrayList<Cargo> ();

		do {
			lista.add(new Cargo (
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("Nivel"),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))


					)				

					);

		}while (JOptionPane.showConfirmDialog(null, "Continuar?","Pergunta", JOptionPane.YES_NO_OPTION)==0);

		lista.add (new Cargo ("DBA", "JR", 6000));
		lista.add (new Cargo ("GERENTE DE PROJETO", "PL", 12000));
		lista.add (new Cargo ("DEV", "JR", 4000));



		System.out.println(lista);
		Collections.sort(lista);
		for (Cargo c : lista ) {
			if (c.getSalario()>1000) {
				System.out.println("Nome do cargo " + c.getNome());
				System.out.println("Salario " + c.getSalario());
				System.out.println("Nivel: " + c.getNivel());
			}
		}


		//(int contador=0;contador<lista.size();contador++)


	}
}
