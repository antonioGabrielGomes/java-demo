package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 aceita um argumento do tipo T e retorna um valor booleano (V ou F)
 filtrar os elementos do Stream com base em alguma condição
 */

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<String> mtfc = palavra -> palavra.length() > 5;
        Predicate<Integer> par = numero -> numero % 2 == 0;

        palavras.stream()
                .filter(mtfc)
                .forEach(System.out::println);

        numeros.stream()
                .filter(par)
                .forEach(System.out::println);

    }
}
