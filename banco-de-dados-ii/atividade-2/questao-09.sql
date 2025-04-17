CREATE DATABASE universidade_db;
USE universidade_db;

CREATE TABLE professores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    salario DOUBLE CHECK (salario > 2000),
    email VARCHAR(100) UNIQUE
);

CREATE TABLE disciplinas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    carga_horaria INT CHECK (carga_horaria >= 20),
    id_professor INT,
    FOREIGN KEY (id_professor) REFERENCES professores(id)
);    