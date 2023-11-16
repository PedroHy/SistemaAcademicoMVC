package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Aluno;
import util.ConnectionFactory;

public class AlunoDAO {
	private Connection conn;   
	private PreparedStatement ps;  
	private ResultSet rs;  
	
	public AlunoDAO () throws Exception{
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}
	
	public void cadastrar(Aluno aluno) throws Exception {
		try {
			String SQL = "INSERT INTO ALUNO (ra, imagem, nome, cpf, email, endereco, telefone, dataNascimento, uf, municipio, idCurso, periodo) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			ps = conn.prepareStatement(SQL);
			ps.setString(1, aluno.getRa());
			ps.setString(2, aluno.getImagem());
			ps.setString(3, aluno.getNome());
			ps.setString(4, aluno.getCpf());
			ps.setString(5, aluno.getEmail());
			ps.setString(6, aluno.getEndereco());
			ps.setString(7, aluno.getTelefone());
			ps.setString(8, aluno.getDataNascimento());
			ps.setString(9, aluno.getUf());
			ps.setString(10, aluno.getMunicipio());
			ps.setString(11, aluno.getIdCurso());
			ps.setString(12, aluno.getPeriodo());
			ps.executeUpdate();
		} catch (SQLException err) {
			throw new Exception("Erro ao atualizar dados " + err);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}
	
	public Aluno getAluno(String ra) throws Exception{
		Aluno aluno = new Aluno();
		
		try {
			String SQL = "SELECT * FROM Aluno WHERE ra = ?";
			
			ps = conn.prepareStatement(SQL);
			ps.setString(1, ra);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				aluno.setRa(ra);
				aluno.setImagem(rs.getString("imagem"));
				aluno.setNome(rs.getString("nome"));
				aluno.setCpf(rs.getString("cpf"));
				aluno.setEmail(rs.getString("email"));
				aluno.setEndereco(rs.getString("endereco"));
				aluno.setTelefone(rs.getString("telefone"));
				aluno.setDataNascimento(rs.getString("dataNascimento"));
				aluno.setUf(rs.getString("uf"));
				aluno.setMunicipio(rs.getString("municipio"));
				aluno.setIdCurso(rs.getString("idCurso"));
				aluno.setPeriodo(rs.getString("periodo"));
			} else {
				throw new Exception("Aluno não encontrado");
			}
		} catch(SQLException err) {
			throw new Exception("Erro ao consultar dados " + err);
		}
		
		return aluno;
	}
	
	public void atualizar(Aluno aluno) throws Exception{
		try {
			String SQL = "UPDATE Aluno SET imagem = ?, nome = ?, cpf = ?, email = ?, endereco = ?, telefone = ?, dataNascimento = ?, uf = ?, municipio = ?, idCurso = ?, pediodo = ? WHERE ra = ?";
			
			ps = conn.prepareStatement(SQL);
			ps.setString(1, aluno.getImagem());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getCpf());
			ps.setString(4, aluno.getEmail());
			ps.setString(5, aluno.getEndereco());
			ps.setString(6, aluno.getTelefone());
			ps.setString(7, aluno.getDataNascimento());
			ps.setString(8, aluno.getUf());
			ps.setString(9, aluno.getMunicipio());
			ps.setString(10, aluno.getIdCurso());
			ps.setString(11, aluno.getPeriodo());
			ps.setString(12, aluno.getRa());
			ps.executeUpdate();
		} catch (SQLException err) {
			throw new Exception("Erro ao atualizar dados " + err);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}
	
	public void deletar(String ra) throws Exception{
		try {
			String SQL = "DELETE Aluno WHERE ra = ?";
			
			ps = conn.prepareStatement(SQL);
			ps.setString(1, ra);
			ps.execute();
		} catch (SQLException err) {
			throw new Exception("Erro ao deletar usuário " + err);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}
}
