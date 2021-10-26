CREATE DATABASE db_generation_games_online;

USE db_generation_games_online;

CREATE TABLE tb_classe(
id_classe INT auto_increment,
nome VARCHAR(50),
ataque_especial VARCHAR(200),
atributo VARCHAR(50),
PRIMARY KEY (id_classe)
);
CREATE TABLE tb_personagem(
id_personagem INT auto_increment,
nome VARCHAR(200),
vida FLOAT NOT NULL,
ataque FLOAT NOT NULL,
defesa FLOAT NOT NULL,
velocidade FLOAT NOT NULL,
fk_classe INT NOT NULL,
primary key (id_personagem),
foreign key (fk_classe) references tb_classe (id_classe)
);
INSERT INTO tb_classe(nome,ataque_especial,atributo) VALUES
("Espadachins", "Fatiada Tripla","Ataques velozes"),
("Arqueiros", "Flecha de Fogo", "Ataques a longa distacia"),
("Curandeiros", "Ervas Regeneradoras", "Regenera sua equipe"),
("Brutamontes", "Quebra-cranio", "Servem de escudo humano"),
("Guerreiros", "Espada Cravada", " ataque e defesa equilibrados");

INSERT INTO tb_personagem(nome,vida,ataque,defesa,velocidade,fk_classe) VALUES
("Clark",200,6000,6000,5,5),
("Mika",50,7000,3000,8,1),
("Soraya",50,3000,1500,9,3),
("Forker",300,7000,9000,2,4),
("Marlos",100,8000,4000,8,2),
("Querubim",65,7000,4000,9,2);

SELECT tb_personagem.nome, tb_classe.nome,tb_personagem.ataque
FROM tb_personagem
inner JOIN tb_classe ON tb_personagem.fk_classe = tb_classe.id_classe
WHERE tb_personagem.ataque > 2000;

SELECT tb_personagem.nome, tb_classe.nome,tb_personagem.defesa
FROM tb_personagem
inner JOIN tb_classe ON tb_personagem.fk_classe = tb_classe.id_classe
WHERE tb_personagem.defesa < 2000 AND tb_personagem.defesa > 1000  ;

SELECT tb_personagem.nome, tb_classe.nome,tb_personagem.vida
FROM tb_personagem
inner JOIN tb_classe ON tb_personagem.fk_classe = tb_classe.id_classe
WHERE tb_personagem.nome LIKE "%c%"  ;

SELECT tb_personagem.nome, tb_classe.nome,tb_personagem.vida
FROM tb_personagem
inner JOIN tb_classe ON tb_personagem.fk_classe = tb_classe.id_classe
WHERE tb_personagem.fk_classe = 2  ;








