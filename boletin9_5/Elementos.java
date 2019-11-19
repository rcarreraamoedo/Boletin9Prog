/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Elementos {

    private int num;
    Scanner sc = new Scanner(System.in);

    public Elementos() {
    }

    public int pedirNumero() {
        System.out.print("\nTeclea un número de valores: ");
        num = sc.nextInt();
        return num;
    }

    public void Elemento() {
        num = pedirNumero();
        System.out.println("***Primera Serie***");
        int ini = 1;
        int multi;
        for (ini = 1; ini <= num; ini++) {
            multi = ini * 2;
            System.out.print(" +" + multi);
        }
    }

    public void Elemento2() {
        num = pedirNumero();
        int ini;
        System.out.println("***Seguda Serie***");
        for (ini = 1; ini <= num; ini++) {
            if (ini % 2 == 0) {
                System.out.print(" +" + ini);
            } else {
                System.out.print(" -" + ini);
            }
        }
    }

    public void Elemento3() {
        num = pedirNumero();
        int ini;
        int fibo1 = 0;
        int fibo2 = 1;
        int sumar;
        System.out.println("***Tercera Serie***");
        for (ini = 1; ini <= num; ini++) {
            System.out.print(fibo1 + ",");
            sumar = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = sumar;
        }
    }
}

