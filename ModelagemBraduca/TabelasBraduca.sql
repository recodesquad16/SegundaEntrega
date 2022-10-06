create database braduca;
use braduca;

CREATE TABLE Aluno (
    id_aluno INTEGER auto_increment PRIMARY KEY,
    data_de_nascimento DATE,
    Email VARCHAR(40),
    endereco VARCHAR(40),
    nome_aluno VARCHAR(20),
    Cpf VARCHAR(11),
    Rg VARCHAR(9)
);

CREATE TABLE Atividade_Extra (
    id_Atividade INTEGER auto_increment PRIMARY KEY,
    Atividade_Social VARCHAR(30),
    Atividade_cultural VARCHAR(20)
);

CREATE TABLE Materia_De_Portugues (
    Id_Materia INTEGER auto_increment PRIMARY KEY,
    Videos VARCHAR(15),
    Leitura VARCHAR(10),
    fk_Aluno_id_aluno INTEGER
);
 
ALTER TABLE Materia_De_Portugues ADD CONSTRAINT FK_Materia_De_Portugues_1
    FOREIGN KEY (fk_Aluno_id_aluno)
    REFERENCES Aluno (id_aluno)
    ON DELETE RESTRICT;

