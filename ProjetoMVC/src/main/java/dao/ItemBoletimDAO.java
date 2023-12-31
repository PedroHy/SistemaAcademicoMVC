package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ItemBoletim;
import util.ConnectionFactory;

public class ItemBoletimDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public ItemBoletimDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	public void newItem(ItemBoletim item) throws Exception {
		try {
			String SQL = "INSERT INTO ItemBoletim(raAluno, idDisciplina, nota, faltas) VALUES (?, ?, ?, ?)";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, item.getRaAluno());
			ps.setString(2, item.getIdDiciplina());
			ps.setDouble(3, item.getNota());
			ps.setInt(4, item.getFaltas());
			ps.executeUpdate();
		} catch (SQLException err) {
			throw new Exception("Erro ao adicionar novo itemBoletim" + err);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	public ItemBoletim getItemBoletim(String raAluno, String idDisciplina) throws Exception {
		ItemBoletim item = new ItemBoletim();

		try {
			String SQL = "SELECT * FROM ItemBoletim WHERE raAluno = ? AND idDisciplina = ?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, raAluno);
			ps.setString(2, idDisciplina);
			rs = ps.executeQuery();

			if (rs.next()) {
				item.setRaAluno(raAluno);
				item.setIdDiciplina(idDisciplina);
				item.setFaltas(rs.getInt("faltas"));
				item.setNota(rs.getDouble("nota"));
			}

		} catch (SQLException err) {
			throw new Exception("Erro ao encontrar itemBoletim" + err);
		}

		return item;
	}

	public ArrayList<ItemBoletim> getAllItemBoletim(String raAluno, String idDisciplina) throws Exception {
		ArrayList<ItemBoletim> items = new ArrayList<ItemBoletim>();

		try {
			String SQL = "SELECT * FROM ItemBoletim WHERE raAluno = ?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, raAluno);
			rs = ps.executeQuery();

			while (rs.next()) {
				ItemBoletim item = new ItemBoletim();
				item.setRaAluno(raAluno);
				item.setIdDiciplina(rs.getString("idDisciplina"));
				item.setFaltas(rs.getInt("faltas"));
				item.setNota(rs.getDouble("nota"));

				items.add(item);
			}

		} catch (SQLException err) {
			throw new Exception("Erro ao encontrar itemBoletim" + err);
		}

		return items;
	}

	public void editarItemBoletim(ItemBoletim item) throws Exception {
		try {
			String SQL = "UPDATE ItemBoletim SET nota = ?, faltas = ? WHERE raAluno = ? AND idDisciplina=?";

			ps = conn.prepareStatement(SQL);
			ps.setDouble(1, item.getNota());
			ps.setInt(2, item.getFaltas());
			ps.setString(3, item.getRaAluno());
			ps.setString(4, item.getIdDiciplina());
			ps.executeUpdate();

		} catch (SQLException err) {
			throw new Exception("Erro ao editar itemBoletim" + err);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	public void deleteItem(String ra) throws Exception {
		try {
			String SQL = "DELETE FROM ItemBoletim WHERE raAluno = ?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, ra);
			ps.executeUpdate();
		} catch (SQLException err) {
			throw new Exception("Erro ao editar itemBoletim" + err);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

}
