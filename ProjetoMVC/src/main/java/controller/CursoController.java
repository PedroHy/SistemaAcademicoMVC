package controller;

import java.util.ArrayList;

import dao.CursoDAO;
import dao.DisciplinaDao;
import model.Curso;
import model.Disciplina;

public class CursoController {

	public ArrayList<Curso> getCursos() {
		
		return new  ArrayList<Curso>();
	}
	
	public String getCampus(String cursoID) {
		//verificar o campus do curso baseado no id do Curso
		return "";
	}
	
	public Curso getCurso(String cursoID) throws Exception {
		CursoDAO dao = new CursoDAO();
		return dao.getCurso(cursoID);
	}
	
	public Curso getCursoByName(String nome) throws Exception {
		CursoDAO dao = new CursoDAO();
		return dao.getCursoByName(nome);
	}
	
	public ArrayList<Curso> getAllCursos() throws Exception {
		CursoDAO dao = new CursoDAO();
		return dao.getAllCursos();
	}
	
	public ArrayList<Disciplina> getDisciplinas(String cursoID) throws Exception {
		CursoDAO dao = new CursoDAO();
		return dao.getDiciplinas(cursoID);
	}
	
	public Disciplina getDisciplina(String nome) throws Exception {
		DisciplinaDao dao = new DisciplinaDao();
		return dao.getDisciplinaByName(nome);
	}
	
}
