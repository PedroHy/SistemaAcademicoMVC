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

    public ArrayList<Disciplina> getDisciplinasPorSemestre(String idCurso, Integer semestre) throws Exception {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

        try {
            String SQL = "SELECT * FROM Disciplina WHERE idCurso = ? AND semestre = ?";

            ps = conn.prepareStatement(SQL);
            ps.setString(1, idCurso);
            ps.setInt(2, semestre);
            rs = ps.executeQuery();

            while (rs.next()) {
                Disciplina d = new Disciplina();
                d.setId(rs.getString("id"));
                d.setIdCurso(idCurso);
                d.setNome(rs.getString("nome"));
                d.setSemestre(semestre);

                disciplinas.add(d);
            }

        } catch (SQLException err) {
            throw new Exception("Erro ao encontrar disciplinas " + err);
        }

        return disciplinas;
    }
}
