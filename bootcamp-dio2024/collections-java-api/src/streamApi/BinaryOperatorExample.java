package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 combina 2 argumetnos do tipo T e retorna um resultado do mesmo tipo T
 operações de redução em pares de elementos, como somar números oou combinar objetos
 */
public class BinaryOperatorExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar =  Integer::sum; // (num1, num2) -> num1 + num2;

        Optional<Integer> resultado = numeros.stream().reduce(somar);
        int resultado2 = numeros.stream().reduce(0, somar);

        System.out.println("Resultado da soma é: " + resultado.get());
        System.out.println("Resultado da soma é: " + resultado2);


    }
}
