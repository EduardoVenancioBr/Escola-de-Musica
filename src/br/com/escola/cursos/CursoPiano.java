package br.com.escola.cursos;

import br.com.escola.interfaces.*;

public class CursoPiano extends Curso implements IGestaoCurso{

	// Construtor
	public CursoPiano(String nomeCurso, int duracao, int numeroAlunos) {
		super(nomeCurso, duracao, numeroAlunos);
		// TODO Auto-generated constructor stub
	}

	// Interface
	@Override
	public void iniciarCurso() {
		// TODO Auto-generated method stub
		System.out.println("Curso de piano inicializado!");
	}

	@Override
	public void encerrarCurso() {
		// TODO Auto-generated method stub
		System.out.println("Curso de piano finalizado!");
	}

	// Métodos
	@Override
	public void avaliar() {
		// TODO Auto-generated method stub
		System.out.println("Avaliando redimento no curso de piano...");
	}

	
}
