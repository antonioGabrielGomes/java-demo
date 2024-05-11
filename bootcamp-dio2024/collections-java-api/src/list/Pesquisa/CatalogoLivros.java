package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPub) {
        livroList.add(new Livro(titulo, autor, anoPub));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalordeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalodeAno = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalodeAno.add(l);
                }
            }
        }

        return livrosPorIntervalodeAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livro = null;

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = l;
                    break;
                }
            }
        }

        return livro;
    }

    public static void main(String[] args) {
        CatalogoLivros catalagoLivros = new CatalogoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1996);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 5", 2023);


        // System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        //  System.out.println(catalagoLivros.pesquisarPorIntervalordeAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
