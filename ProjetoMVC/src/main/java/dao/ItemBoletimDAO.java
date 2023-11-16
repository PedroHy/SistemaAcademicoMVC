package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	public ItemBoletim getItemBoletim(String id) throws Exception {
		ItemBoletim item = new ItemBoletim();

		try {
			String SQL = "SELECT * FROM ItemBoletim WHERE id = ?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				item.setId(id);
				item.setIdDiciplina(rs.getString("idDisciplina"));
				// Arrumar banco de dados para 'faltas'
				item.setFaltas(rs.getInt("faltas"));
				item.setNota(rs.getDouble("nota"));
			}

		} catch (SQLException err) {
			throw new Exception("Erro ao encontrar itemBoletim" + err);
		}

		return item;
	}

	public void newItem(ItemBoletim item) throws Exception {
		try {
			String SQL = "INSERT INTO ItemBoletim(id, idDisciplina, nota, faltas) VALUES (?, ?, ?, ?)";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, item.getId());
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

	public void deleteItemBoletim(String id) throws Exception {
		try {
			String SQL = "DELETE ItemBoletim WHERE id = ?";

			ps = conn.prepareStatement(SQL);
			ps.setString(1, id);
			ps.executeUpdate();

		} catch (SQLException err) {
			throw new Exception("Erro ao deletar itemBoletim" + err);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

}
