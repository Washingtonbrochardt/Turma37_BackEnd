CREATE DATABASE db_escola;

USE db_escola;
CREATE TABLE tb_aluno (
id_aluno INT AUTO_INCREMENT,
nome VARCHAR(255),
cpf VARCHAR(255),
numero_pais VARCHAR(255),
nota DOUBLE NOT NULL,
PRIMARY KEY (id_aluno)
);

INSERT INTO tb_aluno (nome,cpf,numero_pais,nota) VALUES
("Ricardo","111","222", 5.9),
("Vini","222","333", 6.7),
("Marcel","333","4444", 6.5),
("Ruan","444","5555", 3.6),
("Jorge","555","66665", 3.5),
("Paulo","666","7777", 3.1);

USE db_escola; 
SELECT * FROM tb_aluno WHERE nota>7.0;
SELECT * FROM tb_aluno WHERE nota<7.0;

USE db_escola;
UPDATE tb_aluno SET nota = 8.7 WHERE id_aluno= 4;