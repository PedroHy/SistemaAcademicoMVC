package model;

public class Campus {
    private String id;
    private String nome;
    private String idCursos;

    public Campus() {
    }

    public Campus(String id, String nome, String idCursos) {
        this.id = id;
        this.nome = nome;
        this.idCursos = idCursos;
    }

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

    public String getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(String idCursos) {
        this.idCursos = idCursos;
    }
}