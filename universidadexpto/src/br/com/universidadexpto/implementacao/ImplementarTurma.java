package br.com.universidadexpto.implementacao;

import br.com.universidadexpto.modelo.Aluno;
import br.com.universidadexpto.modelo.Curso;
import br.com.universidadexpto.modelo.Professor;
import br.com.universidadexpto.modelo.Turma;
import br.com.universidadexpto.modelo.Unidade;
import br.com.universidadexpto.util.Magica;

public class ImplementarTurma {

	public static void main(String[] args) {
		Turma turma = new Turma (
				Magica.s("Sigla"),
				Magica.s("Periodo"),
				Magica.s("Sala"),
				new Aluno (
						Magica.i("RM"),
						Magica.s("Fone"),
						Magica.s("Nome"),
						Magica.b("Esta ativo?")
						),
				new Professor(
						Magica.s("Nome"),
						Magica.f("Valor Hora"),
						Magica.s("Formação"),
						Magica.s("Area"),
						Magica.s("Email")
						),
				new Curso(
						Magica.s("Descrição"),
						Magica.i("Carga Horária"),
						Magica.f("Valor"),
						new Unidade (
								Magica.s("Nome"),
								Magica.s("Bairro"),
								Magica.s("Telefone")
								
								)
						)
				);
		
		System.out.println(turma.toString());
	}

}
