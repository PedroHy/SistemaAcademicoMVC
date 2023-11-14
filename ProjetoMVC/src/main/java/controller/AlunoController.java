package controller;

import java.util.ArrayList;

import model.Aluno;
import model.ItemBoletim;

public class AlunoController {

	
	public void salvar(String ra, String image, String cpf, String nome, String email, String endereco, String telefone,
			String dataNascimento, String uf, String municipio, String idCurso, String periodo) {
		
		Aluno aluno = new Aluno(ra, image, cpf, nome, email, endereco, telefone,
				 dataNascimento, uf, municipio, idCurso, periodo);
		
		//salvar aluno no DB
		
	}
	
	public void cadastrar(String ra, String image, String cpf, String nome, String email, String endereco, String telefone,
			String dataNascimento, String uf, String municipio, String idCurso, String periodo) {
		
		Aluno aluno = new Aluno(ra, image, cpf, nome, email, endereco, telefone,
				 dataNascimento, uf, municipio, idCurso, periodo);
		//salvar aluno no DB
		//criar boletim com Ra do aluno
	}
	
	public void excluir(String ra) {
		//excluir aluno e boletim
	}
	
	public Aluno consultar(String ra) {
		//retornar o aluno
		return new Aluno();
	}
	
	public void gerarBoletim(String ra) {
		//trazer boletim
		//estudar como fazer PDF
	}
	
	
	public void adicionarItemBoletim(String nomeAluno, String raAluno, Integer semestre, String diciplina, Double nota,
		Integer faltas) {
		String id = raAluno + diciplina + semestre.toString();
		ItemBoletim item = new ItemBoletim(id, nomeAluno, raAluno, semestre, diciplina, nota, faltas);
			
		//salvar item no BD
	}
		
	public void editarItemBoletim(String nomeAluno, String raAluno, Integer semestre, String diciplina, Double nota,
			Integer faltas) {
		//localizar item do boletim pelo ra do aluno
		//atualizar dados
	}
		
	public ArrayList<ItemBoletim> consultarTodosItensBoletim(String ra) {
		//trazer todos os itens do boletim baseado em aluno
		return new ArrayList<ItemBoletim>();
	}
		
	public ItemBoletim consultarItemBoletim(String raAluno, Integer semestre, String diciplina) {

		String id = raAluno + diciplina + semestre.toString();
		//localizar item boletim
		return new ItemBoletim();
	}
}
