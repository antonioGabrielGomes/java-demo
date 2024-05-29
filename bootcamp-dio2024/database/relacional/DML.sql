
----------------------------------------------------------------------
INSERT INTO usuarios (id, nome, email, endereco, data_nascimento) VALUES
(1, 'João Silva', 'joao.silva@example.com', 'Rua das Flores, 123', '1985-06-15');

INSERT INTO usuarios (id, nome, email, endereco, data_nascimento) VALUES
(2, 'Maria Oliveira', 'maria.oliveira@example.com', 'Avenida Central, 456', '1990-02-20');

INSERT INTO usuarios (id, nome, email, endereco, data_nascimento) VALUES
(3, 'Carlos Souza', 'carlos.souza@example.com', 'Travessa dos Pinhais, 789', '1988-11-30');

INSERT INTO usuarios (id, nome, email, endereco, data_nascimento) VALUES
(4, 'Ana Pereira', 'ana.pereira@example.com', 'Praça da Liberdade, 101', '1992-07-25');

INSERT INTO usuarios (id, nome, email, endereco, data_nascimento) VALUES
(5, 'Pedro Santos', 'pedro.santos@example.com', 'Alameda dos Anjos, 202', '1983-03-12');

----------------------------------------------------------------------
INSERT INTO destinos (id, nome, descricao) VALUES
(1, 'Paris', 'A cidade das luzes, famosa pela Torre Eiffel e sua rica história cultural');

INSERT INTO destinos (id, nome, descricao) VALUES
(2, 'Nova York', 'A cidade que nunca dorme, conhecida por seus arranha-céus e a Times Square');

INSERT INTO destinos (id, nome, descricao) VALUES
(3, 'Tóquio', 'A capital do Japão, uma metrópole vibrante com uma mistura de tradição e modernidade');

INSERT INTO destinos (id, nome, descricao) VALUES
(4, 'Roma', 'A cidade eterna, famosa por seus marcos históricos como o Coliseu e o Vaticano');

INSERT INTO destinos (id, nome, descricao) VALUES
(5, 'Londres', 'A capital do Reino Unido, conhecida pelo Big Ben, o Palácio de Buckingham e a cultura britânica');

INSERT INTO destinos (id, nome, descricao) VALUES
(6, 'Sydney', 'A cidade australiana famosa pela Opera House e suas belas praias');

INSERT INTO destinos (id, nome, descricao) VALUES
(7, 'Rio de Janeiro', 'Cidade brasileira conhecida pelo Cristo Redentor e as praias de Copacabana e Ipanema');

INSERT INTO destinos (id, nome, descricao) VALUES
(8, 'Cidade do Cabo', 'Uma cidade sul-africana famosa por sua Table Mountain e diversidade cultural');

INSERT INTO destinos (id, nome, descricao) VALUES
(9, 'Bangkok', 'A capital da Tailândia, conhecida por seus templos ornamentados e vida noturna vibrante');

INSERT INTO destinos (id, nome, descricao) VALUES
(10, 'Dubai', 'Uma cidade nos Emirados Árabes Unidos, famosa por seus arranha-céus futuristas e luxo');


----------------------------------------------------------------------

INSERT INTO reservas (id, id_usuario, id_destino, data, status) VALUES
(1, 1, 3, '2024-06-01', 'confirmada');

INSERT INTO reservas (id, id_usuario, id_destino, data, status) VALUES
(2, 2, 5, '2024-07-15', 'pendente');

INSERT INTO reservas (id, id_usuario, id_destino, data, status) VALUES
(3, 3, 7, '2024-08-20', 'confirmada');

INSERT INTO reservas (id, id_usuario, id_destino, data, status) VALUES
(4, 4, 2, '2024-09-10', 'pendente');

INSERT INTO reservas (id, id_usuario, id_destino, data, status) VALUES
(5, 5, 9, '2024-10-05', 'cancelada');

--
select * from reservas;
--
UPDATE reservas
SET status = 'pendente'
--
UPDATE reservas
SET status = 'cancelada'
where id = 5
---
INSERT INTO usuarios_nova (id, nome, email, endereco, data_nascimento)
SELECT id, nome, email, endereco, data_nascimento
FROM usuarios;
---
ALTER TABLE usuarios_nova RENAME usuarios;


--
--
--

