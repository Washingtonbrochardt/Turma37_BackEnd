CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
id_categoria INT auto_increment,
tipo VARCHAR (255),
tamanho VARCHAR(255),
diametro FLOAT NOT NULL,
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizza(
id_pizza INT auto_increment,
nome VARCHAR (255),
salgada BOOLEAN,
sabor VARCHAR(255),
preço FLOAT NOT NULL,
fk_categoria INT NOT NULL,
PRIMARY KEY (id_pizza),
foreign key (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria(tipo, tamanho, diametro)
VALUES 
("Mega","Grande",40),
("Super","Media",30),
("Casal","Pequeno",20);

INSERT INTO tb_pizza(nome, salgada, sabor,preço,fk_categoria)
VALUES 
("Fogarel",true,"Marguerita com 4 pimentas diferentes",25,1),
("Chapéu de Palha",false,"Cartola com pedaços caramelizados",50,2),
("Quadrilha",true,"Quatro queijos com presunto", 35,3),
("Peido de vea",true,"Portuguesa com muito ovo",30,1);

SELECT tb_pizza.nome AS "NOME", tb_categoria.tamanho AS "TAMANHO", tb_pizza.preço AS "PREÇO"
FROM tb_pizza 
INNER JOIN tb_categoria ON tb_pizza.fk_categoria=tb_categoria.id_categoria
WHERE tb_pizza.preço > 45;

SELECT tb_pizza.nome AS NOME, tb_categoria.tamanho AS TAMANHO, tb_pizza.preço AS PREÇO
FROM tb_pizza 
INNER JOIN tb_categoria ON tb_pizza.fk_categoria=tb_categoria.id_categoria
WHERE tb_pizza.preço > 29 AND tb_pizza.preço < 60;

SELECT nome AS NOME, tb_pizza.preço AS PREÇO
FROM tb_pizza 
WHERE nome LIKE "%c%";

SELECT tb_pizza.nome AS NOME, tb_categoria.tamanho AS TAMANHO, tb_pizza.preço AS PREÇO
FROM tb_pizza 
INNER JOIN tb_categoria ON tb_pizza.fk_categoria=tb_categoria.id_categoria
WHERE tb_pizza.fk_categoria=1;

 
