package br.com.escola.cursos;

import br.com.escola.interfaces.*;

public class CursoBateria extends Curso implements IGestaoCurso {

	// Construtor
	public CursoBateria(String nomeCurso, int duracao, int numeroAlunos) {
		super(nomeCurso, duracao, numeroAlunos);
		// TODO Auto-generated constructor stub
	}

	// Interfaces
	@Override
	public void iniciarCurso() {
		// TODO Auto-generated method stub
		System.out.println("Curso de bateria inicializado!");
	}

	@Override
	public void encerrarCurso() {
		// TODO Auto-generated method stub
		System.out.println("Curso de bateria finalizado!");
	}
	
	// Método
	@Override
	public void avaliar() {
		// TODO Auto-generated method stub
		System.out.println("Avaliando redimento no curso de bateria...");
	}
	
	
}
