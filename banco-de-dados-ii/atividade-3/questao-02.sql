-- Mostre professores com título "Mestre" ou "Especialista".

USE IFAC;

SELECT * 
FROM professores 
WHERE titulacao 
    IN ("Mestre", "Especialista");