package model;

public class ItemBoletim {
	// attrs
	private String raAluno;
	private String idDiciplina;
	private Double nota;
	private Integer faltas;

	// constructors
	public ItemBoletim() {
	}

	public ItemBoletim(String raAluno, String idDiciplina, Double nota, Integer faltas) {
		this.raAluno = raAluno;
		this.idDiciplina = idDiciplina;
		this.nota = nota;
		this.faltas = faltas;
	}

	// getters and setters
	public String getRaAluno() {
		return raAluno;
	}

	public void setId(String value) {
		this.raAluno = value;
	}

	public String getIdDiciplina() {
		return this.idDiciplina;
	}

	public void setIdDiciplina(String value) {
		this.idDiciplina = value;
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