/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

import java.util.Scanner;

public class Ejercicio4A {
     public static void main (String[] args){
         Scanner leer = new Scanner(System.in);  
         System.out.println("Ingrese los grados a convertir");    
         int grados = leer.nextInt();
         double f = 32 + (9 * grados / 5);
         
         System.out.println("Los " + grados + " grados centígrados equivalen a " + f + " grados Fahrenheit.");
}
}
