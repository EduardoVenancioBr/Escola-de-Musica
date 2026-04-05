package br.com.escola.cursos;

public abstract class Curso {
	// Atributos
	private String nomeCurso;
	private int duracao; // Em meses
	private int numeroAlunos;
	
	// Construtor
	public Curso(String nomeCurso, int duracao, int numeroAlunos) {
		super();
		this.nomeCurso = nomeCurso;
		this.duracao = duracao;
		this.numeroAlunos = numeroAlunos;
	}
	
	// Método abstrato
	public abstract void avaliar();

	// Getters and Setters
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getNumeroAlunos() {
		return numeroAlunos;
	}

	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}
	
	
}
