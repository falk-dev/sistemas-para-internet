CREATE DATABASE transportes_db;
USE transportes_db;

CREATE TABLE motoristas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cnh VARCHAR(1) NOT NULL,
    data_nascimento DATE
);

CREATE TABLE veiculos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    placa VARCHAR(7),
    nome_participante VARCHAR(100),
    modelo VARCHAR(50),
    ano INT CHECK (ano >= 2000),
    id_motorista INT,
    FOREIGN KEY (id_motorista) REFERENCES motoristas(id)
);    