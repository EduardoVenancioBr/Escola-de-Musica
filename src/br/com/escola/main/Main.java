package br.com.escola.main;

import br.com.escola.cursos.*;
import br.com.escola.interfaces.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso objPiano = new CursoPiano("Piano", 5, 10);
		objPiano.avaliar();
		
		Curso objGuitarra = new CursoGuitarra("Guitara", 7, 29);
		objGuitarra.avaliar();
		
		Curso objBaterria  = new CursoBateria("Bateria", 8, 9);
		objBaterria.avaliar();
		
		CursoFactory objCursoFactory = new CursoFactory();
		IGestaoCurso objPiano02 = objCursoFactory.gerarCurso("Piano");
		objPiano02.iniciarCurso();
	}

}
// "-"
// "