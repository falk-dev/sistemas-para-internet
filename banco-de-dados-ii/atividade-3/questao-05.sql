-- Liste disciplinas onde o ID seja 2, 4 ou 6.

USE IFAC;

SELECT * 
FROM disciplinas 
WHERE id 
    IN (2, 4, 6);