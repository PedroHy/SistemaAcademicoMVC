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

CREATE TABLE Disciplina(
	id VARCHAR(20) PRIMARY KEY, 
	nome VARCHAR(50),
    	idCurso VARCHAR(50),
     	semestre INTEGER,
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
	idDisciplina VARCHAR(100),
    	nota DOUBLE,
    	falta INTEGER,
	FOREIGN KEY (idDisciplina) REFERENCES Disciplina(id)
);

-- CURSOS
INSERT INTO Curso VALUES ("0001", "Analise e Desenvolvimento de Sistemas");
INSERT INTO Curso VALUES ("0002", "Logistica");

-- CAMPUS

INSERT INTO Campus VALUES("1000", "Guarulhos", "0001;0002");

-- DICIPLINAS

INSERT INTO Disciplina VALUES("1010", "Programação Orientada a Objetos (POO)", "0001");
INSERT INTO Disciplina VALUES("AAG-001", "Administração Geral", "0001", 1);
INSERT INTO Disciplina VALUES("IAL-002", "Algoritmos e lógica de programação", "0001", 1);
INSERT INTO Disciplina VALUES("IAC-001", "Arquitetura e Organização de Computadores", "0001", 1);
INSERT INTO Disciplina VALUES("LIN-100", "Inglês I", "0001", 1);
INSERT INTO Disciplina VALUES("IHW-100", "Laboratório de Hardware", "0001", 1);
INSERT INTO Disciplina VALUES("MMD-001", "Matemática discreta", "0001", 1);

INSERT INTO Disciplina VALUES("ILM-001", "Programação em Microinformática", "0001", 1);

INSERT INTO Disciplina VALUES("MCA-002", "Calculo", "0001", 2);
INSERT INTO Disciplina VALUES("LPO-001", "Comunicação e Expressão", "0001", 2);
INSERT INTO Disciplina VALUES("CCG-001", "Contabilidade", "0001", 2);
INSERT INTO Disciplina VALUES("IES-100", "Engenharia de Software I", "0001", 2);
INSERT INTO Disciplina VALUES("LIN-200", "Inglês II", "0001", 2);
INSERT INTO Disciplina VALUES("ILP-010", "Linguagem de Programação", "0001", 2);
INSERT INTO Disciplina VALUES("ISI-002", "Sistemas de informação", "0001", 2);

INSERT INTO Disciplina VALUES("CEF-100", "Economia e Finanças", "0001", 3);
INSERT INTO Disciplina VALUES("IES-200", "Engenharia de Software II", "0001", 3);
INSERT INTO Disciplina VALUES("MET-100", "Estatistica Aplicada", "0001", 3);
INSERT INTO Disciplina VALUES("IED-001", "Estrutura de dados", "0001", 3);
INSERT INTO Disciplina VALUES("LIN-300", "Inglês III", "0001", 3);
INSERT INTO Disciplina VALUES("IHC-001", "Interação Humano Computador", "0001", 3);
INSERT INTO Disciplina VALUES("ISO-100", "Sistemas Operacionais I", "0001", 3);
INSERT INTO Disciplina VALUES("HST-002", "Sociedade e Tecnologia", "0001", 3);

INSERT INTO Disciplina VALUES("IBD-002", "Banco de Dados", "0001", 4);
INSERT INTO Disciplina VALUES("IES-300", "Engenharia de Software III", "0001", 4);
INSERT INTO Disciplina VALUES("TTG-001", "Metodologia de Pesquisa", "0001", 4);
INSERT INTO Disciplina VALUES("ILP-007", "Programação Orientada a Objetos", "0001", 4);
INSERT INTO Disciplina VALUES("LIN-007", "Inglês IV", "0001", 4);
INSERT INTO Disciplina VALUES("ILP-507", "Interação Humano Computador", "0001", 4);
INSERT INTO Disciplina VALUES("ISO-200", "Sistemas Operacionais II", "0001", 4);

INSERT INTO Disciplina VALUES("LIN-500", "Inglês V", "0001", 5);
INSERT INTO Disciplina VALUES("IBD-100", "Laborátorio de Banco de Dados", "0001", 5);
INSERT INTO Disciplina VALUES("IES-301", "Laborátorio de Engenharia de Software", "0001", 5);
INSERT INTO Disciplina VALUES("MPL-001", "Programação Linear e Aplicação", "0001", 5);
INSERT INTO Disciplina VALUES("IRC-008", "Redes de Computadores", "0001", 5);
INSERT INTO Disciplina VALUES("ISG-003", "Segurança da informação", "0001", 5);

INSERT INTO Disciplina VALUES("LIN-600", "Inglês VI", "0001", 6);
INSERT INTO Disciplina VALUES("CEE-002", "Empreendedorismo", "0001", 6);
INSERT INTO Disciplina VALUES("AGR-101", "Gestão de Equipes", "0001", 6);
INSERT INTO Disciplina VALUES("AGO-005", "Gestão de Projetos", "0001", 6);
INSERT INTO Disciplina VALUES("ITI-003", "Governança de TI", "0001", 6);
INSERT INTO Disciplina VALUES("IIA-002", "Inteligência Artificial", "0001", 6);

INSERT INTO Disciplina VALUES("1040", "GESTALT", "0002", 1);
INSERT INTO Disciplina VALUES("1041", "Desenho", "0002", 2);
INSERT INTO Disciplina VALUES("1042", "Musica", "0002", 3);
INSERT INTO Disciplina VALUES("1043", "Danca", "0002", 4);
INSERT INTO Disciplina VALUES("1044", "Sobrevivencia Urbana", "0002", 5);
INSERT INTO Disciplina VALUES("1045", "Abstracao", "0002", 6);
