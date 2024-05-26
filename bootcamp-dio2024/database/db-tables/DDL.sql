CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
    email VARCHAR(100) NOT NULL UNIQUE COMMENT 'E-mail do usuário',
    endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do usuário',
    data_nascimento DATE  NOT NULL COMMENT 'Data de nascimento do usuário'
);

CREATE TABLE destinos (
    id INT PRIMARY KEY AUTOINCREMENT,,
    nome VARCHAR(255) NOT NULL COMMENT 'Nome do destino',
    descricao VARCHAR(255) NOT NULL UNIQUE COMMENT 'Descrição do destino'
);

CREATE TABLE reservas (
    id INT PRIMARY KEY AUTOINCREMENT,,
    id_usuario INT COMMENT "Referência ao ID do usuário que fez a reserva",
    id_destino INT COMMENT "Referência ao ID do destino da reserva",
    data DATE COMMENT "Data da reserva",
    status VARCHAR(255) DEFAULT 'pendente' COMMENT "Status da reserva (confirmada, pendente, cancelada, etc;)"
);


-------------------
DROP TABLE reservas;
-----------------
ALTER TABLE usuarios_nova RENAME usuarios;
-----------------
ALTER TABLE usuarios MODIFY COLUMN endereco VARCHAR(150);
-----------------
-----------------
-----------------
ALTER TABLE usuarios
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);
-----------------
-----------------
-----------------
ALTER TABLE destinos
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);
-----------------
-----------------
-----------------
ALTER TABLE reservas
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);
-----------------
-----------------
-----------------
ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios (id);
-----------------
-----------------
-----------------
ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios.id;
-----------------
-----------------
-----------------
ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_destinos
FOREIGN KEY (id_destino) REFERENCES destinos (id);
-----------------
-----------------
-----------------
ALTER TABLE reservas
ADD CONSTRAINT fk_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios (id)
ON DELETE CASCADE;
-----------------
-----------------
-----------------
ALTER TABLE usuarios
ADD rua VARCHAR(100),
ADD numero VARCHAR(20),
ADD cidade VARCHAR(50),
ADD estado VARCHAR(20);
-----------------
-----------------
-----------------
UPDATE usuarios
SET rua = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 1), ',', -1),
    numero = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 2), ',', -1),
    cidade = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 3), ',', -1),
    estado = SUBSTRING_INDEX(endereco, ',', -1);
-----------------
-----------------
-----------------
ALTER TABLE usuarios
DROP COLUMN endereco;
-----------------
-----------------
-----------------



-----------------
-----------------
-----------------




-----------------
-----------------
-----------------



-----------------
-----------------
-----------------