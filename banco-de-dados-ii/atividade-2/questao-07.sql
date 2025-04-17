CREATE DATABASE estoque_db;
USE estoque_db;

CREATE TABLE produtos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) UNIQUE,
    preco DECIMAL(10,2) CHECK (preco > 0),
    estoque INT DEFAULT 0,
    categoria VARCHAR(50)
);