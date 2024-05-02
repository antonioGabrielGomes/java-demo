import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try {
            System.out.print("Digite o primeiro valor: ");
            int primeiroValor = entradaInteiro();
            System.out.print("Digite o segundo valor: ");
            int segundoValor = entradaInteiro();

            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static int entradaInteiro() throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        String entrada = terminal.next();

        if (!entrada.matches("-?\\d+(\\.\\d+)?")) {
            throw new ParametrosInvalidosException("Entrada inválida, digite apenas número inteiro");
        }

        return Integer.parseInt(entrada);
    }

    static void contar(int primeiro, int segundo) throws ParametrosInvalidosException {
        if (primeiro > segundo)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = segundo - primeiro;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
