package boletin9_4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rcarreraamoedo
 */
public class Tabla {

    private int numero;
    Scanner sc = new Scanner(System.in);

    public Tabla() {
    }

    public int pedirNumero() {
        System.out.print("Teclea un número: ");
        numero = sc.nextInt();
        return numero;
    }

    public void Multiplicacion() {
        int inicio;
        int multi;
        numero = pedirNumero();
        while (numero != 0) {
            for (inicio = 0; inicio < 11; inicio++) {
                multi = inicio * numero;
                System.out.println(numero + " * " + inicio + " = " + multi);
            }
            numero = pedirNumero();
        }
        System.out.println("Has tecleado 0, se termina la consulta");
    }
}
