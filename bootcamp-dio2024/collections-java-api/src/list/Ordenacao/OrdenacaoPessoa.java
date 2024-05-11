package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaLista;

    public OrdenacaoPessoa() {
        this.pessoaLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaLista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaLista);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaLista);

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordPessoa = new OrdenacaoPessoa();

        ordPessoa.adicionarPessoa("Nome 1", 20, 1.80);
        ordPessoa.adicionarPessoa("Nome 2", 30, 1.65);
        ordPessoa.adicionarPessoa("Nome 3", 25, 1.96);
        ordPessoa.adicionarPessoa("Nome 4", 17, 1.70);
        ordPessoa.adicionarPessoa("Nome 5", 10, 0.56);

        System.out.println(ordPessoa.ordernarPorIdade());
        System.out.println(ordPessoa.ordernarPorAltura());
    }

}
