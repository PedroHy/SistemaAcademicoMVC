package controller;

import java.util.ArrayList;

import dao.AlunoDAO;
import model.Aluno;
import model.ItemBoletim;

public class AlunoController {

	public void salvar(String ra, String image, String cpf, String nome, String email, String endereco, String telefone,
			String dataNascimento, String uf, String municipio, String idCurso, String periodo) {

		Aluno aluno = new Aluno(ra, image, cpf, nome, email, endereco, telefone,
				dataNascimento, uf, municipio, idCurso, periodo);

		try {
			AlunoDAO dao = new AlunoDAO();

			dao.atualizar(aluno);
		} catch (Exception err) {
			// Erro
		}
	}

	public void cadastrar(String ra, String image, String cpf, String nome, String email, String endereco,
			String telefone,
			String dataNascimento, String uf, String municipio, String idCurso, String periodo) {

		Aluno aluno = new Aluno(ra, image, cpf, nome, email, endereco, telefone,
				dataNascimento, uf, municipio, idCurso, periodo);

		try {
			AlunoDAO dao = new AlunoDAO();

			dao.cadastrar(aluno);
		} catch (Exception err) {
			// Erro
		}

		// criar boletim com Ra do aluno
	}

	public void excluir(String ra) {
		try {
			AlunoDAO dao = new AlunoDAO();

			dao.deletar(ra);
		} catch (Exception err) {
			// Erro
		}

		// excluir boletim
	}

	public Aluno consultar(String ra) {
		Aluno aluno;

		try {
			AlunoDAO dao = new AlunoDAO();

			aluno = dao.getAluno(ra);
			return aluno;
		} catch (Exception err) {
			// Erro
			return new Aluno();
		}
	}

	public void gerarBoletim(String ra) {
		// trazer boletim
		// estudar como fazer PDF
	}

	public void adicionarItemBoletim(String raAluno, String idDiciplina, Double nota, Integer faltas) {
		// O id do item boletim é o mesmo que o de aluno certo?
		String id = raAluno;
		ItemBoletim item = new ItemBoletim(id, idDiciplina, nota, faltas);

		// salvar item no BD
	}

	public void editarItemBoletim(String nomeAluno, String raAluno, Integer semestre, String diciplina, Double nota,
			Integer faltas) {
		// localizar item do boletim pelo ra do aluno
		// atualizar dados
	}

	public ArrayList<ItemBoletim> consultarTodosItensBoletim(String ra) {
		// trazer todos os itens do boletim baseado em aluno
		return new ArrayList<ItemBoletim>();
	}

	public ItemBoletim consultarItemBoletim(String raAluno, Integer semestre, String diciplina) {

		String id = raAluno + diciplina + semestre.toString();
		// localizar item boletim
		return new ItemBoletim();
	}
}
