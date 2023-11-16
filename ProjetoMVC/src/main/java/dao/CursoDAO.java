package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Curso;
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
}
