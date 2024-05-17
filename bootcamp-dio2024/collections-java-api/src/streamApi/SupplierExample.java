package streamApi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// não aceita argumentos e retorna um resultado do tipo T
// criar ou fornecer novos objetos de um determinado  tipo
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // List<String> listaSaudacoes = Stream.generate(saudacao)
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .collect(Collectors.toList());

        // listaSaudacoes.forEach(s -> System.out.println(s));
        listaSaudacoes.forEach(System.out::println);
    }

}
