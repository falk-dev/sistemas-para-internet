-- Liste alunos cujo nome comece com "J".

USE IFAC;

SELECT * 
FROM alunos 
WHERE nome 
    LIKE 'J%';