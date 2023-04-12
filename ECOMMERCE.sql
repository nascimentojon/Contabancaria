-- comando para criação de banco de dados
CREATE DATABASE db_ecommerce;

CREATE TABLE td_produtos(
id BIGINT AUTO_INCREMENT  PRIMARY KEY,
jogos VARCHAR (255), 
console VARCHAR(255),
 controle VARCHAR(255), 
 preço  DECIMAL (7,2),
 estado VARCHAR (255)
    
);
INSERT INTO tb_produtos(JOGOS,CONSOLE,CONTROLE,PREÇO,ESTADO)
VALUES("GOD OF WAR","PLAYSTATION5","DUALLSENSE",3000.00,"NOVO");

SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(JOGOS,CONSOLE,CONTROLE,PREÇO,ESTADO)
VALUES("ZELDA","SWITCH","JOI CONS",3000.00,"NOVO");

SELECT * FROM TD_produtos WHERE preço > 500;

SELECT * FROM TD_produtos WHERE preço < 500;

ALTER TABLE tb_produtos ADD categoria_id bigint;

-- Adicionando a constraint
ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categorias 
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id);

INSERT INTO tb_produtos(
    nome, quantidade, preco, categoria_id
) values("Pitaya", 10, 15.00, 1);

INSERT INTO tb_produtos(
    nome, quantidade, preco, categoria_id
) values("Agrião", 15, 3.00, 2);

INSERT INTO tb_produtos(
    nome, quantidade, preco, categoria_id
) values("Cenoura", 18, 3.50, 3);

SELECT * FROM tb_produtos;

SELECT descricao from tb_categoria
RIGHT JOIN tb_produtos ON tb_produtos.categoria_id = tb_categoria.id;

SELECT nome, quantidade, preco from tb_produtos
LEFT JOIN tb_categoria ON tb_categoria.id = tb_produtos.categoria_id;