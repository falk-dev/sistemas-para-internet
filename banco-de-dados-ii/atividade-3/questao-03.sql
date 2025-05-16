-- Liste disciplinas com carga horária entre 30 e 60 horas.

USE IFAC;

SELECT * 
FROM disciplinas 
WHERE carga_horaria
    BETWEEN 30 AND 60;