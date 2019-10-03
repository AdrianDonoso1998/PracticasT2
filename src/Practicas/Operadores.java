/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import javax.xml.transform.Source;

/**
 *
 * @author Usuario DAM 1
 */
public class Operadores {
    public static void main(String[] args) {
        /*String palabra1 = "Hola";
        String palabra2 = "Hola";
        boolean comparacion = palabra1.equals(palabra2);
        System.out.println(comparacion);
        
       String palabra3 = "HolA";
        String palabra4 = "Hola";
        int comparacion2 = palabra3.compareTo(palabra4);
        System.out.println(comparacion2);
        //formatear el texto a minusculas
       boolean comparacionMin = palabra3.toLowerCase().equals(palabra4.toLowerCase());
        palabra3.equalsIgnoreCase(palabra4);
        System.out.println(comparacionMin);*/
        int numeroUno = 10;
        int numeroDos = 101;
        
        boolean comparacion = numeroUno>0 && numeroDos<100;
        boolean comparacionDos = numeroUno>0 && numeroDos>100;
        
        boolean comparacion0 = numeroUno>0 || numeroDos>100;
        boolean comparacion1 = numeroUno<0 || numeroDos==100;
        boolean comparacion2 = numeroUno>0 || numeroDos==100;
        boolean comparacion3 = numeroUno<0 || numeroDos<100;
        System.out.printf("La comparación entre números es: %b",comparacion0);
        
        int numeroCompararUno = 10;
        int numeroCompararDos  = 20;
        String palabra1 = "Ejemplo";
        String palabra2 = "Otro ejemplo";
        
        boolean comparacionMultiple = numeroCompararUno>numeroCompararDos
                || palabra1.equals(palabra2);
        
        boolean comparacionMultipleDos = numeroCompararUno<numeroCompararDos
                || palabra1.equals(palabra2) || numeroCompararUno!=numeroCompararDos;
        
         System.out.printf("La comparación entre números es: %b",comparacion0); 
         
         
        int n1 = 10,n2=20,n3=10;
        String p1="uno",p2="dos";
        boolean b1=true, b2=false;
        
        boolean salida = ((n1>0) && (n2<5) && (n3!=10)) || p1.equals(p2) || b2 && b1;
                          //T         //F        /F           /F            //F  //T
                        
        System.out.println(salida);
        
     
    }                    
    
    
    
                                                      
                                     
        
                
}
