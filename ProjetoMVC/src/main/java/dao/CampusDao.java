package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Campus;
import util.ConnectionFactory;

public class CampusDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public CampusDao() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception e) {
            throw new Exception("erro: \n" + e.getMessage());
        }
    }

    public ArrayList<Campus> getTodosCampus() throws Exception {
        ArrayList<Campus> campuss = new ArrayList<Campus>();
        try {
            String SQL = "SELECT * FROM Campus";

            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Campus c = new Campus();
                c.setId(rs.getString("id"));
                c.setIdCursos(rs.getString("idCurso"));
                c.setNome(rs.getString("nome"));

                campuss.add(c);
            }
        } catch (SQLException err) {
            throw new Exception(err);
        }

        return campuss;
    }
}
