/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

/**
 *
 * @author antonio
 */
public class Teste {

    public static void main(String[] args) {
        int v0 = 3;
        int v1 = v0++; 
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
        
        
        int total = 0;
        int c[] = new int[10];
        for (int i = 0; i<c.length; i++) {
                c[i] = i + i;
        }
        for (int i = 0; i<c.length; i++) {
                System.out.println(c[i]);
                total += c[i];
        }
        System.out.println(total);
        System.out.println(Math.pow(8,2));
        
        System.out.println("-----------------------");
        for (int i = 1; i < 5; i++) {
                if (i==2) continue;
                System.out.println(i); 
        }
        System.out.println("----------------------");
        int x, y;
        double z;

        x = 5;
        y = 2;
        z = x / y;
        System.out.print(z);
        
        
    }
}


