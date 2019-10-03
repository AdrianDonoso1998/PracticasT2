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
public class FormatoPersonas {
    public static void main(String[] args) {
        String nombre;
        
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Nombre y Apellidos: ");
        nombre = teclado.next();
        teclado.nextLine();
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dime tu altura");
        double alt = teclado.nextDouble();
    }
}
