package list.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidado = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidado = c;
                break;
            }
        }

        if (convidado != null) {
            convidadoSet.remove(convidado);
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();
        System.out.println("Exitem " + conjunto.contarConvidados() + " convidados no conjunto de dados");

        conjunto.adicionarConvidado("Convidado 1", 1234);
        conjunto.adicionarConvidado("Convidado 2", 1235);
        conjunto.adicionarConvidado("Convidado 3", 1235);
        conjunto.adicionarConvidado("Convidado 4", 1236);
        conjunto.adicionarConvidado("Convidado 5", 1236);

        System.out.println("Exitem " + conjunto.contarConvidados() + " convidados no conjunto de dados");

        conjunto.removerConvidadoPorCodigoConvite(1235);

        System.out.println("Exitem " + conjunto.contarConvidados() + " convidados no conjunto de dados");

        conjunto.exibirConvidados();
    }

}
