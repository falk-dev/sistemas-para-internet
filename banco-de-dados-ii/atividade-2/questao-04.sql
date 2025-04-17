CREATE DATABASE esporte_db;
USE esporte_db;

CREATE TABLE jogadores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    idade INT CHECK (idade >= 16),
    nome VARCHAR(100) NOT NULL,
    posicao VARCHAR(30),
    time_jogador VARCHAR(50)
);