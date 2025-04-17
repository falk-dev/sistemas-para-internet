CREATE DATABASE escola_db;
USE escola_db;

CREATE TABLE alunos (
	id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) UNIQUE,
    idade INT CHECK (idade >= 16),
    nome VARCHAR(100) NOT NULL
);