CREATE DATABASE eventos_db;
USE eventos_db;

CREATE TABLE eventos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    data_evento DATE,
    local_evento VARCHAR(100),
    tipo VARCHAR(50) NOT NULL
);

CREATE TABLE inscricoes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_evento INT,
    FOREIGN KEY (id_evento) REFERENCES eventos(id),
    nome_participante VARCHAR(100),
    idade INT CHECK (idade >= 18)
);    