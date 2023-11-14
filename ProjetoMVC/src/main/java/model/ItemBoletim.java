package model;

public class ItemBoletim {
	//attrs
	private String id;
	private String nomeAluno;
	private String raAluno;
	private Integer semestre;
	private String diciplina;
	private Double nota;
	private Integer faltas;
	
	//constructors
	public ItemBoletim() {}
	public ItemBoletim(String id, String nomeAluno, String raAluno, Integer semestre, String diciplina, Double nota,
			Integer faltas) {
		super();
		this.id = id;
		this.nomeAluno = nomeAluno;
		this.raAluno = raAluno;
		this.semestre = semestre;
		this.diciplina = diciplina;
		this.nota = nota;
		this.faltas = faltas;
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
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Integer getFaltas() {
		return faltas;
	}
	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}
	
	
}