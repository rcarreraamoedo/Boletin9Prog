/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Calcular {
    private int cont;
    private int suma;
    private double producto = 1;
    Scanner sc = new Scanner(System.in);
    
    public void CalcularSumProd(){
    for (cont=10;cont<=90;cont++){
        suma = suma + cont;
        producto = producto * cont;
    }
        System.out.println("\nSuma = "+suma+"\nProducto = "+producto);  
    }
}
