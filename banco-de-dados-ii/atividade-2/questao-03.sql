CREATE DATABASE vendas_db;
USE vendas_db;

CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    telefone VARCHAR(15)
);

CREATE TABLE pedidos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido DATE,
    valor_total DECIMAL(10,2) CHECK (valor_total > 0),
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);    