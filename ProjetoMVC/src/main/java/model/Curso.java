package model;

import java.util.ArrayList;

public class Curso {
	//attrs
	private String id;
	private String nome;
	private ArrayList<String> campus;
	private ArrayList<String> diciplinas;
	
	//constructors
	public Curso(){}
	public Curso(String id, String nome, ArrayList<String> campus, ArrayList<String> diciplinas) {
		super();
		this.id = id;
		this.nome = nome;
		this.campus = campus;
		this.diciplinas = diciplinas;
	}

	
	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getCampus() {
		return campus;
	}

	public void setCampus(ArrayList<String> campus) {
		this.campus = campus;
	}

	public ArrayList<String> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(ArrayList<String> diciplinas) {
		this.diciplinas = diciplinas;
	}
	
}