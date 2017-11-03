
package boletin5.pkg2;

import java.util.Scanner;

public class Boletin52 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        short n1, n2;
        
        System.out.print("Introduce el N1: ");  
        n1 = reader.nextShort();
        System.out.print("Introduce el N2: ");  
        n2 = reader.nextShort();
        
        if (n1 >= n2) {
            System.out.println("A resta e: " + (n1 - n2));
        } else {
            System.out.println("A suma e: " + (n1 + n2)); 
        }
    }
    
}
