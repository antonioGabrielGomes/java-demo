/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testevars;

import java.util.Scanner;

/**
 *
 * @author antonio
 */
public class TesteVars {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f\n", nome, nota);
        
        String teste = "44";
        int testeParse = Integer.parseInt(teste);
        System.out.println(testeParse);
    }
}
