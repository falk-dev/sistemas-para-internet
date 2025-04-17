CREATE DATABASE financeiro_db;
USE financeiro_db;

CREATE TABLE contas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(100) NOT NULL,
    valor DECIMAL(10,2) CHECK (valor > 0),
    tipo VARCHAR(7) CHECK (tipo IN ('receita', 'despesa')),
    data DATE
);