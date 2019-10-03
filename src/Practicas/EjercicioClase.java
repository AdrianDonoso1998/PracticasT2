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
public class EjercicioClase {
    public static void main(String[] args) {
        double numUno;
        double numDos;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el primer numero: ");
        numUno = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Dame el segudno numero: ");
        numDos = teclado.nextDouble();
        teclado.nextLine();
        
        double resultado = numUno + numDos;
        boolean condicion1 = resultado > 0;
        System.out.printf("El resultado de los dos numeros es positiva %b %n", condicion1);
        
        
        double resultado2 = numUno * numDos;
        boolean condicion2 = resultado2 > 99;
        System.out.printf("La multi de %.2f por %.2f tiene al menos 3 cifras: %b %n",numUno,numDos,condicion2);
        
        double resultado3 = numDos % numUno;
        boolean condicion3 = resultado3 == 0;
        System.out.printf("El %.2f es multipo de %.2f : %b", numUno,numDos,condicion3);
    }
}
