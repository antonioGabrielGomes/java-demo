package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


// aceita argumentos do tipo T e não retorna nenhum resultado
// realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retorna um valor
public class ConsumerExampler {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Consumer com expressão lambda
        Consumer<Integer> imprimirPares = numero -> {
          if (numero % 2 == 0) {
              System.out.println(numero);
          }
        };

        // Consumer com stream
        // numeros.stream() foi suprimido
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
