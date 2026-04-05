package br.com.escola.cursos;

import br.com.escola.interfaces.*;

public class CursoGuitarra extends Curso implements IGestaoCurso {

	// Construtor
	public CursoGuitarra(String nomeCurso, int duracao, int numeroAlunos) {
		super(nomeCurso, duracao, numeroAlunos);
		// TODO Auto-generated constructor stub
	}

	// Interfacess
	@Override
	public void iniciarCurso() {
		// TODO Auto-generated method stub
		System.out.println("Curso de guitarra inicializado!");
	}

	@Override
	public void encerrarCurso() {
		// TODO Auto-generated method stub
		System.out.println("Curso de guitarra inicializado!");
	}
	
	// Método
	@Override
	public void avaliar() {
		// TODO Auto-generated method stub
		System.out.println("Avaliando redimento no curso de guitarra...");
	}

	
}
