CREATE DATABASE biblioteca_db;
USE biblioteca_db;

CREATE TABLE editoras (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) UNIQUE,
    cidade VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE livros (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100),
    preco DECIMAL(10,2) CHECK (preco > 0),
    ano_publicacao INT,
    id_editora INT,
    FOREIGN KEY (id_editora) REFERENCES editoras(id)
);    