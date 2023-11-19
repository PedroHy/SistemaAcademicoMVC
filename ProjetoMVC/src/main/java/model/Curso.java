package model;

public class Curso {
	// attrs
	private String id;
	private String nome;

	// constructors
	public Curso() {
	}

	public Curso(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	// getters and setters
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

	@Override
	public String toString() {
		return this.nome;
	}
}