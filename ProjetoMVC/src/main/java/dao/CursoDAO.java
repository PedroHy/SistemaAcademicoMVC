package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Curso;
import model.Disciplina;
import util.ConnectionFactory;

public class CursoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public CursoDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	public Curso getCurso(String id) throws Exception {
		Curso curso = new Curso();
		try {
			String SQL = "SELECT * FROM Curso WHERE id = ?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				curso.setId(rs.getString("id"));
				curso.setNome(rs.getString("nome"));
			}

		} catch (SQLException err) {
			throw new Exception("Erro ao encontrar curso " + err);
		}

		return curso;
	}
	
	public Curso getCursoByName(String name) throws Exception {
		Curso curso = new Curso();
		try {
			String SQL = "SELECT * FROM Curso WHERE nome = ?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if (rs.next()) {
				curso.setId(rs.getString("id"));
				curso.setNome(rs.getString("nome"));
			}

		} catch (SQLException err) {
			throw new Exception("Erro ao encontrar curso " + err);
		}

		return curso;
	}
	
	public ArrayList<Curso> getAllCursos() throws Exception {
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		try {
			String SQL = "SELECT * FROM Curso;";

			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Curso curso = new Curso();
				curso.setId(rs.getString("id"));
				curso.setNome(rs.getString("nome"));
				
				cursos.add(curso);
			}

		} catch (SQLException err) {
			throw new Exception("Erro ao encontrar cursos " + err);
		}

		return cursos;
	}
	
	public ArrayList<Disciplina> getDiciplinas(String idCurso) throws Exception {
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		try {
			String SQL = "SELECT * FROM Disciplina WHERE idCurso=?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, idCurso);
			rs = ps.executeQuery();
			while (rs.next()) {
				Disciplina disciplina = new Disciplina();
				disciplina.setId(rs.getString("id"));
				disciplina.setNome(rs.getString("nome"));
				disciplina.setIdCurso(rs.getString("idCurso"));
				disciplina.setSemestre(rs.getInt("semestre"));
				
				disciplinas.add(disciplina);
			}

		} catch (SQLException err) {
			throw new Exception("Erro ao encontrar cursos " + err);
		}
		
		return disciplinas;
	}
}
