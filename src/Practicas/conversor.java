/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class conversor {
    public static void main(String[] args) {
        final double dolar = 1.09;
        double euro;
        final double libras = 0.89;
        final double yens = 118.01;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los euros que quieres que convirtamos");
        euro = teclado.nextDouble();
        double solu = (euro*dolar);
        System.out.printf("El resultado de euro a dolar es %.2f %n",solu);
        double solu2 = (euro*libras);
        System.out.printf("El resultado de euro a dolar es %.2f %n",solu2);
        double solu3 = (euro*yens);
        System.out.printf("El resultado de euro a dolar es %.2f %n",solu3);
    }
}
