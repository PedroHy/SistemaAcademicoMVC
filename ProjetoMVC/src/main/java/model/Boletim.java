package model;

import java.util.ArrayList;

public class Boletim {
	//attrs
	private String id;
	private String nomeAluno;
	private String raAluno;
	private String curso;
	private ArrayList<ItemBoletim> itens;
	
	//constructors
	public Boletim() {}
	public Boletim(String id, String nomeAluno, String raAluno, String curso, ArrayList<ItemBoletim> itens) {
		super();
		this.id = id;
		this.nomeAluno = nomeAluno;
		this.raAluno = raAluno;
		this.curso = curso;
		this.itens = itens;
	}
	
	//getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getRaAluno() {
		return raAluno;
	}
	public void setRaAluno(String raAluno) {
		this.raAluno = raAluno;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public ArrayList<ItemBoletim> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItemBoletim> itens) {
		this.itens = itens;
	}
	
}