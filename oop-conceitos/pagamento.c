struct pagamento {
	double valor;
}
typedef struct pagamento Pagamento;

struct debito {
	Pagamento *pagamento;
	double desconto;
}
typedef struct debito Debito;

struct credito {
	Pagamento *pagamento;
	int parcelas;
	float juros;
}
typedef struct credito Credito;

struct cliente {
	char[50] nome;
	char[11] cpf;
	Debito *debito;
	Credito *credito;
}
typedef struct cliente Cliente;
