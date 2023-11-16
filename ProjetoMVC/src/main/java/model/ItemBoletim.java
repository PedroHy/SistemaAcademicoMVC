package model;

public class ItemBoletim {
	// attrs
	private String id;
	private String idDiciplina;
	private Double nota;
	private Integer faltas;

	// constructors
	public ItemBoletim() {
	}

	public ItemBoletim(String id, String idDiciplina, Double nota, Integer faltas) {
		this.id = id;
		this.idDiciplina = idDiciplina;
		this.nota = nota;
		this.faltas = faltas;
	}

	// getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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