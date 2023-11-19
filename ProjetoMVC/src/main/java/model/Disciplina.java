package model;

public class Disciplina {
    private String id;
    private String nome;
    private String idCurso;
    private Integer semestre;

    public Disciplina() {
    }

    public Disciplina(String id, String nome, String idCurso) {
        this.id = id;
        this.nome = nome;
        this.idCurso = idCurso;
    }

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getIdCurso() {
        return this.idCurso;
    }

    public void setId(String value) {
        this.id = value;
    }

    public void setNome(String value) {
        this.nome = value;
    }

    public void setIdCurso(String value) {
        this.idCurso = value;
    }

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
    
}
