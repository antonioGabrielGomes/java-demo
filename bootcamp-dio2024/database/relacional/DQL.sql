select u.nome, r.data, d.nome, r.status from reservas as r
inner join usuarios as u on r.id_usuario = u.id
inner join destinos as d on r.id_destino = d.id

where u.nome = 'João Silva'



SELECT COUNT(*) AS qtd_reservas, id_destino FROM reservas
GROUP BY id_destino
ORDER BY qtd_reservas DESC, id_destino DESC;


