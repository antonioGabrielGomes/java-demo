package streamApi.desafios;

import java.util.List;
import java.util.stream.Collectors;

/**
 Desafio 1 - Mostre a lista na ordem numérica:
 Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */

public class Desafio1 extends Lista {
    public Desafio1() {
        super();
    }

    public static void main(String[] args) {
        Desafio1 d1 = new Desafio1();

        List<Integer> listaOrdenada = d1.numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listaOrdenada);
    }
}
