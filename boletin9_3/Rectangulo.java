/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Rectangulo {
    private double base;
    private double area;
    private double altura;
    Scanner sc = new Scanner(System.in);
    
    public double pedirBase(){
    System.out.print("Teclea la base: ");
    base = sc.nextDouble();
    return base;
    }
    public double pedirAltura(){
    System.out.print("Teclea la altura: ");
    altura = sc.nextDouble();
    return altura;
    }
    public void CalcularArea(){
    do{
        base=pedirBase();
        altura=pedirAltura();
        area = base * altura;
        }while(altura<0 || base<0);
        System.out.println("A área de un rectángulo é "+area);
    }
    
}
