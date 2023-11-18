package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Disciplina;
import util.ConnectionFactory;

public class DisciplinaDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public DisciplinaDao() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception e) {
            throw new Exception("erro: \n" + e.getMessage());
        }
    }
    
    public Disciplina getDisciplinaByName(String name) throws Exception {
    	Disciplina disciplina = new Disciplina();
    	try {
            String SQL = "SELECT * FROM Disciplina WHERE nome = ?";

            ps = conn.prepareStatement(SQL);
            ps.setString(1, name);
            rs = ps.executeQuery();

            if (rs.next()) {
	            disciplina.setId(rs.getString("id"));
	            disciplina.setIdCurso(rs.getString("idCurso"));
	            disciplina.setNome(rs.getString("nome"));
	            disciplina.setSemestre(rs.getInt("semestre"));
            }

        } catch (SQLException err) {
            throw new Exception("Erro ao encontrar disciplina " + err);
        }

        return disciplina;
    }

    public ArrayList<Disciplina> getDisciplinas(String idCurso) throws Exception {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

        try {
            String SQL = "SELECT * FROM Disciplina WHERE idCurso = ?";

            ps = conn.prepareStatement(SQL);
            ps.setString(1, idCurso);
            rs = ps.executeQuery();

            while (rs.next()) {
                Disciplina d = new Disciplina();
                d.setId(rs.getString("id"));
                d.setIdCurso(rs.getString("idCurso"));
                d.setNome(rs.getString("nome"));
                d.setSemestre(rs.getInt("semestre"));

                disciplinas.add(d);
            }

        } catch (SQLException err) {
            throw new Exception("Erro ao encontrar disciplinas " + err);
        }

        return disciplinas;
    }
}
