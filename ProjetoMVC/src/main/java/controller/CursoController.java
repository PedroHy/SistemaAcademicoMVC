package controller;

import java.util.ArrayList;

import dao.CampusDao;
import dao.CursoDAO;
import dao.DisciplinaDao;
import model.Campus;
import model.Curso;
import model.Disciplina;

public class CursoController {

	public ArrayList<Curso> getCursos() throws Exception {
		try {
			CursoDAO dao = new CursoDAO();
			return dao.getCursos();
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

	public ArrayList<Campus> getCampus(String cursoID) throws Exception {
		ArrayList<Campus> allCampus;
		try {
			CampusDao dao = new CampusDao();

			allCampus = dao.getTodosCampus();
		} catch (Exception err) {
			throw new Exception(err);
		}

		ArrayList<Campus> campuss = new ArrayList<Campus>();

		for (int i = 0; i < allCampus.size(); i++) {
			if (allCampus.get(i).getIdCursos().indexOf(cursoID) != -1) {
				campuss.add(allCampus.get(i));
			}
		}

		return campuss;
	}

	public Curso getCurso(String cursoID) throws Exception {
		try {
			CursoDAO dao = new CursoDAO();
			return dao.getCurso(cursoID);
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

	public ArrayList<Disciplina> getDiciplinas(String cursoID, Integer semestre) throws Exception {
		try {
			DisciplinaDao dao = new DisciplinaDao();

			return dao.getDisciplinasPorSemestre(cursoID, semestre);
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

}
