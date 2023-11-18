package controller;

import java.util.ArrayList;

import dao.CampusDao;
import dao.CursoDAO;
import dao.DisciplinaDao;
import model.Campus;
import model.Curso;
import model.Disciplina;

public class CursoController {

	public ArrayList<Curso> getCursos() {

		return new ArrayList<Curso>();
	}

	public ArrayList<Campus> getCampus(String cursoID) throws Exception {
		// verificar o campus do curso baseado no id do Curso
		CampusDao campusDao = new CampusDao();

		ArrayList<Campus> campuss = campusDao.getTodosCampus();
		ArrayList<Campus> campusComCurso = new ArrayList<Campus>();

		for (int i = 0; i < campuss.size(); i++) {
			if (campuss.get(i).getIdCursos().contains(cursoID)) {
				campusComCurso.add(campuss.get(i));
			}
		}
		return campusComCurso;
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
