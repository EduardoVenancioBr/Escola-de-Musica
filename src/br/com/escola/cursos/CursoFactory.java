package br.com.escola.cursos;

import br.com.escola.interfaces.IGestaoCurso;

public class CursoFactory {

	public IGestaoCurso gerarCurso(String tipo) {
		
		try{
			if (tipo == "Guitarra") {
				return new CursoGuitarra("Guitara", 0, 0);
			} else if (tipo == "Piano") {
				return new CursoPiano("Piano", 0, 0);
			} else if (tipo == "Bateria") {
				return new CursoBateria("Bateria", 0, 0);
			} else {
				return null;
			}
			} catch(Exception e) {
				System.out.println("Erro: valor inválido!");
				return null;
			}
		

	}
}
