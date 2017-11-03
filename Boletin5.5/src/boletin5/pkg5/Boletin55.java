
package boletin5.pkg5;

import java.util.Scanner;

public class Boletin55 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double n1, n2, n3;
        
        System.out.print("Introduce el número 1: ");  
        n1 = reader.nextDouble();
        System.out.print("Introduce el número 2: ");  
        n2 = reader.nextDouble();
        System.out.print("Introduce el número 3: ");  
        n3 = reader.nextDouble();
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El número 1 es el mayor");
            } else {
                System.out.println("El número 3 es el mayor"); 
            }
        } else {
            if (n2 > n3) {
                System.out.println("El número 2 es el mayor");
            } else {
                System.out.println("El número 3 es el mayor"); 
            }
        }
    }
    
}
