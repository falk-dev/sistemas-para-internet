-- Mostre alunos ordenados pela data de nascimento (mais novo primeiro).

USE IFAC;

SELECT * FROM alunos 
ORDER BY data_nascimento 
    DESC