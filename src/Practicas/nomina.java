/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;

/**
 *
 * @author Adrian Donoso DAM 1
 */
public class nomina {

    public static void main(String[] args) {
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el salario bruto ");
        salario = teclado.nextDouble();
        int pagas;
        final double retencion = 0.85;
        System.out.printf("Introduce el numero de pagas ");
        pagas = teclado.nextInt();

        double div = (int) (salario * pagas);
        System.out.printf("Su salario bruto anual es %.2f %n", div);
        double div2 = (int) ((int) (salario * pagas) * retencion);
        System.out.printf("Su salario neto con retencion anual es %.2f %n",div2);
        double div3 = (div / 12);
        System.out.printf("Su salario bruto mensual es %.2f %n",div3);
        double div4 = (div2 / 12);
        System.out.printf("Su salario bruto mensual es %.2f %n" ,div4);
    }
}
