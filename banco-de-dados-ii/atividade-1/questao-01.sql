CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE livros (
    id INT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    preco decimal(10,2) NOT NULL
);

CREATE TABLE alunos (
    id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL,
    telefone varchar(15) NOT NULL
);

CREATE TABLE emprestimos (
    id INT PRIMARY KEY,
    id_aluno INT NOT NULL,
    id_livro INT NOT NULL,
    FOREIGN KEY (id_aluno) REFERENCES alunos(id),
    FOREIGN KEY (id_livro) REFERENCES livros(id),
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE NOT NULL
);

ALTER TABLE alunos ADD email VARCHAR(100);
ALTER TABLE livros MODIFY preco DECIMAL(8,2);
ALTER TABLE alunos DROP COLUMN telefone;