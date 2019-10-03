/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author Usuario DAM 1
 */
public class conversiones {
    public static void main(String[] args) {
        byte numeroByte = 56;
        System.out.printf("El valor del byte es %d %n ",numeroByte);
        long numeroLong = (long)numeroByte;
        System.out.printf("El valor del byte es %d %n ",numeroLong);
        int numeroInt = 5;
        double numeroDouble = (double)numeroInt;
        System.out.printf("El valor del Integer es %d %n ",numeroInt);
        System.out.printf("El valor de Double  es %.2f %n ",numeroDouble);
        
        String palabra = "1";
        System.out.printf("El valor de la palabra es %s %n ",palabra);
        int numeropalabra = Integer.parseInt(palabra);
        System.out.printf("El valor del numero es: %d %n ",numeropalabra);
        
        int numeroPalabraDos = 123;
        boolean acierto = false;
        String palabraNumero = String.valueOf(numeroPalabraDos);
        String aciertoDos = String.valueOf(acierto);
        System.out.printf("El valor de la palabra es: %s %n ",palabraNumero);
        System.out.printf("El valor de la palabra es: %s %n ",aciertoDos);
        
    }
}
