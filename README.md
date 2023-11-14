# SistemaAcademicoMVC
Projeto da faculdade na matéria de POO para exercitar os conhecimentos na linguagem Java e na arquitetura MVC. 

script SQL:

CREATE DATABASE sisAcademicoMVC;

USE sisAcademicoMVC;

-- TABLES
CREATE TABLE Curso (
	id VARCHAR(50) PRIMARY KEY, 
	nome VARCHAR(50)
);

CREATE TABLE Diciplina(
	id VARCHAR(20) PRIMARY KEY, 
	nome VARCHAR(50),
    idCurso VARCHAR(50),
    FOREIGN KEY (idCurso) REFERENCES Curso(id)
);

CREATE TABLE Campus(
	id VARCHAR(20) PRIMARY KEY, 
	nome VARCHAR(50),
    idCurso VARCHAR(100)
);

CREATE TABLE Aluno(
	ra VARCHAR(20) PRIMARY KEY,
    imagem VARCHAR(100),
	nome VARCHAR(90), 
	cpf VARCHAR(11), 
	email VARCHAR(50), 
    endereco VARCHAR(50), 
    telefone VARCHAR(20), 
	dataNascimento VARCHAR(15), 
    uf VARCHAR(15), 
    municipio VARCHAR(20), 
    idCurso VARCHAR(50),
    periodo VARCHAR(20),
    FOREIGN KEY (idCurso) REFERENCES Curso(id)
);

CREATE TABLE ItemBoletim(
	id VARCHAR(80) PRIMARY KEY,
	idDiciplina VARCHAR(100),
    nota DOUBLE,
    falta INTEGER,
	FOREIGN KEY (idDiciplina) REFERENCES Diciplina(id)
);

-- CURSOS
INSERT INTO Curso VALUES ("0001", "Analise e Desenvolvimento de Sistemas");
INSERT INTO Curso VALUES ("0002", "Logistica");
INSERT INTO Curso VALUES ("0003", "Veterinario");
INSERT INTO Curso VALUES ("0004", "Artes");

-- CAMPUS

INSERT INTO Campus VALUES("1000", "Guarulhos", "0001;0002");
INSERT INTO Campus VALUES("2000", "Campinas", "0001;0002;0003;0004");
INSERT INTO Campus VALUES("3000", "Itaquaquecetuba", "0003;0004");

-- DICIPLINAS

INSERT INTO Diciplina VALUES("1010", "Programação Orientada a Objetos (POO)", "0001");
INSERT INTO Diciplina VALUES("1011", "Dispositivos Moveis", "0001");
INSERT INTO Diciplina VALUES("1012", "Engenharia de Software", "0001");
INSERT INTO Diciplina VALUES("1013", "Banco de Dados", "0001");
INSERT INTO Diciplina VALUES("1014", "Calculo", "0001");
INSERT INTO Diciplina VALUES("1015", "Redes", "0001");
INSERT INTO Diciplina VALUES("1016", "Logica de Programação", "0001");

INSERT INTO Diciplina VALUES("1020", "Calculo", "0002");
INSERT INTO Diciplina VALUES("1021", "Economia", "0002");
INSERT INTO Diciplina VALUES("1022", "Contabilidade", "0002");
INSERT INTO Diciplina VALUES("1023", "Sustentabilidade", "0002");
INSERT INTO Diciplina VALUES("1024", "Sistemas de Informacao", "0002");
INSERT INTO Diciplina VALUES("1025", "Organizacao de galpoes", "0002");
INSERT INTO Diciplina VALUES("1026", "Aeroportuaria", "0002");

INSERT INTO Diciplina VALUES("1030", "Biologia", "0003");
INSERT INTO Diciplina VALUES("1031", "Dar a patinha", "0003");
INSERT INTO Diciplina VALUES("1032", "Rolar", "0003");
INSERT INTO Diciplina VALUES("1033", "Vacinar", "0003");
INSERT INTO Diciplina VALUES("1034", "Tosar", "0003");
INSERT INTO Diciplina VALUES("1035", "Nutricao", "0003");
INSERT INTO Diciplina VALUES("1036", "Dar banho", "0003");

INSERT INTO Diciplina VALUES("1040", "GESTALT", "0004");
INSERT INTO Diciplina VALUES("1041", "Desenho", "0004");
INSERT INTO Diciplina VALUES("1042", "Musica", "0004");
INSERT INTO Diciplina VALUES("1043", "Danca", "0004");
INSERT INTO Diciplina VALUES("1044", "Sobrevivencia Urbana", "0004");
INSERT INTO Diciplina VALUES("1045", "Abstracao", "0004");
INSERT INTO Diciplina VALUES("1046", "Design", "0004");
