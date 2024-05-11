package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome) {
        List<Item> itensToRemove = new ArrayList<>();

        for (Item i : itens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensToRemove.add(i);
            }
        }

        this.itens.removeAll(itensToRemove);
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Item i : itens) {
            total += i.getPreco();
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(this.itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Teclado", 109.63, 1);
        carrinho.adicionarItem("Mouse", 59.63, 1);
        carrinho.adicionarItem("Teclado2", 1159.63, 1);

        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());

        carrinho.removeItem("Teclado2");
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());

    }
}
