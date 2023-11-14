package controller;

import java.util.ArrayList;

import model.Curso;

public class CursoController {

	public ArrayList<Curso> getCursos() {
		
		return new  ArrayList<Curso>();
	}
	
	public String getCampus(String cursoID) {
		//verificar o campus do curso baseado no id do Curso
		return "";
	}
	
	public Curso getCurso(String cursoID) {
		
		return new Curso();
	}
	
	public ArrayList<String> getDiciplinas(String cursoID) {
		//verificar o diciplinas do curso baseado no id do Curso
		return new ArrayList<String>();
	}
	
}
