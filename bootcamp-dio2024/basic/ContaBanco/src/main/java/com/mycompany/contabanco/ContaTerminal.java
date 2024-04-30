package com.mycompany.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nomeCliente = teclado.nextLine();

        System.out.print("Digite sua agência: ");
        agencia = teclado.nextLine();

        System.out.print("Digite o número da sua conta: ");
        numero = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite o saldo da sua conta: ");
        saldo = Double.parseDouble(teclado.nextLine());

        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta "
                + numero + " e seu saldo " + saldo
                + " já está disponível para saque");
    }
}
