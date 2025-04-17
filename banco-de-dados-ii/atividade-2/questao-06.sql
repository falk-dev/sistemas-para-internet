CREATE DATABASE cinema_db;
USE cinema_db;

CREATE TABLE filmes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    duracao INT CHECK (duracao >= 30),
    categoria VARCHAR(30),
    classificacao VARCHAR(2) CHECK (classificacao IN ('L', '10', '12', '14', '16', '18'))
);