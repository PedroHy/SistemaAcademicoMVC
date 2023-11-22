package controller;

import java.util.ArrayList;

import dao.AlunoDAO;
import dao.CursoDAO;
import dao.DisciplinaDao;
import dao.ItemBoletimDAO;
import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.ItemBoletim;
import util.GenerateBoletim;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AlunoController {
	// Edita um aluno já criado no banco de dados
	public void salvar(String ra, String image, String cpf, String nome, String email, String endereco, String telefone,
			String dataNascimento, String uf, String municipio, String idCurso, String campus, String periodo)
			throws Exception {

		Aluno aluno = new Aluno(ra, image, cpf, nome, email, endereco, telefone, dataNascimento, uf, municipio, idCurso,
				campus, periodo);

		try {
			AlunoDAO dao = new AlunoDAO();

			dao.atualizar(aluno);
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

	// Cria um novo aluno no banco de dados
	public void cadastrar(String ra, String image, String cpf, String nome, String email, String endereco,
			String telefone, String dataNascimento, String uf, String municipio, String idCurso, String campus,
			String periodo)
			throws Exception {

		Aluno aluno = new Aluno(ra, image, cpf, nome, email, endereco, telefone,
				dataNascimento, uf, municipio, idCurso, campus, periodo);

		System.out.println(aluno);

		try {
			AlunoDAO dao = new AlunoDAO();

			dao.cadastrar(aluno);
		} catch (Exception err) {
			throw new Exception(err);
		}

		// Cria os ItemBoletins zerados no banco de dados
		DisciplinaDao disciplinaDao = new DisciplinaDao();
		ArrayList<Disciplina> disciplinas = disciplinaDao.getDisciplinas(idCurso);
		for (int i = 0; i < disciplinas.size(); i++) {
			ItemBoletim item = new ItemBoletim(ra, disciplinas.get(i).getId(), 0.0, 0);
			try {
				ItemBoletimDAO itemDao = new ItemBoletimDAO();
				itemDao.newItem(item);
			} catch (Exception err) {
				throw new Exception(err);
			}
		}
	}

	public void excluir(String ra) throws Exception {

		try {
			AlunoDAO dao = new AlunoDAO();
			ItemBoletimDAO itemDao = new ItemBoletimDAO();
			dao.deletar(ra);
			itemDao.deleteItem(ra);
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

	public Aluno consultar(String ra) throws Exception {
		try {
			AlunoDAO dao = new AlunoDAO();

			Aluno aluno = dao.getAluno(ra);
			return aluno;
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

	public void gerarBoletim(String ra) throws Exception {
		AlunoDAO alunoDao = new AlunoDAO();
		CursoDAO cursoDao = new CursoDAO();
		ItemBoletimDAO itemDao = new ItemBoletimDAO();

		Aluno aluno = alunoDao.getAluno(ra);
		Curso curso = cursoDao.getCurso(aluno.getIdCurso());

		ArrayList<ItemBoletim> itens = itemDao.getAllItemBoletim(ra, aluno.getIdCurso());

		GenerateBoletim boletim = new GenerateBoletim(aluno.getRa(), aluno.getNome(), curso.getId(),
				aluno.getPeriodo(), aluno.getIdCampus(), itens);
		
	}

	public void editarItemBoletim(String raAluno, String idDiciplina, Double nota, Integer faltas) throws Exception {
		ItemBoletim item = new ItemBoletim(raAluno, idDiciplina, nota, faltas);

		try {
			ItemBoletimDAO itemDao = new ItemBoletimDAO();
			itemDao.editarItemBoletim(item);
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

	public ItemBoletim consultarItemBoletim(String raAluno, String idDiciplina) throws Exception {
		ItemBoletim item;

		try {
			ItemBoletimDAO itemDao = new ItemBoletimDAO();
			item = itemDao.getItemBoletim(raAluno, idDiciplina);
			return item;
		} catch (Exception err) {
			throw new Exception(err);
		}
	}

	private void saveImage(String pathOrigem, String imageName){
		File origem = new File(pathOrigem);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origem));
		
		File destino = new File("imagens/"+imageName);
		FileOutputStream fos = new FileOutputStream(destino);
		
		int count = 0;
		byte[] bytes = new byte[1024];
		while((count = bis.read(bytes))>0) {
			fos.write(bytes, 0, count);
		}
	}	
}
