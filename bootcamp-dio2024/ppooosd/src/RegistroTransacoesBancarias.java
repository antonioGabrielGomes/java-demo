import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    static public class Transacao {
        private String tipo;
        private double valor;

        public Transacao(String tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 2500.0; // scanner.nextDouble();
        int quantidadeTransacoes = 2; // scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<Transacao>();


        for (int i = 0; i < quantidadeTransacoes; i++) {
            System.out.print("Tipo: ");
            String tipoTransacao = scanner.next();
            System.out.print("Valor: ");
            double valorTransacao = scanner.nextDouble();

            System.out.println(tipoTransacao);
            System.out.println(valorTransacao);

            if (tipoTransacao.equalsIgnoreCase("d")) {
                saldo += valorTransacao;
                transacoes.add(new Transacao("Deposito", valorTransacao));
            } else if (tipoTransacao.equalsIgnoreCase("s")) {
                saldo -= valorTransacao;
                transacoes.add(new Transacao("Saque", valorTransacao));
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        System.out.println("\nSaldo: " + saldo);
        System.out.println("Transacoes:");

        for (int i = 0; i < quantidadeTransacoes; i++) {
            Transacao transacao = transacoes.get(i);
            System.out.println(i+1 + ". " + transacao.tipo + " de " + String.format("%.1f", transacao.valor));
        }

        scanner.close();
    }
}