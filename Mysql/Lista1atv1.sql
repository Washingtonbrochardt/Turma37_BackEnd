CREATE DATABASE db_rh;

USE db_rh;
CREATE TABLE tb_funcionarios(
	id_funcionario INT AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    cargo VARCHAR(255),
    salario DOUBLE NULL,
    PRIMARY KEY(id_funcionario)
);

INSERT INTO tb_funcionarios(nome,email,cargo,salario) VALUES
("Was","Wasdogera@hotmail.com","Farmaceutico",1000.00),
("Lucas","LucasLucco@hotmail.com","Cantor",30000.00),
("Fabio","FabioPoschat@hotmail.com","Ator",50000.00);


SELECT * FROM tb_funcionarios WHERE salario>2000;

SELECT * FROM tb_funcionarios WHERE salario<2000;

USE db_rh;
UPDATE tb_funcionarios SET salario = 1200.00 WHERE id_funcionario= 2;