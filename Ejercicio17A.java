/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
import java.util.Scanner;

public class Ejercicio17A {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 

    System.out.println("Ingrese tamaño del vector");
    int n = leer.nextInt();
    
    int vector[] = new int[n];
    
    for (int i = 0; i < n; i++) {
    vector[i] = (int)(Math.random()*10000+1); 
        }
    
    
    
    
    
    
    
    
    
}
}