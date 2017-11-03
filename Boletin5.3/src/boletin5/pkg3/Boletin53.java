
package boletin5.pkg3;

import java.util.Scanner;

public class Boletin53 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double n;
        
        System.out.print("Introduce el número: ");  
        n = reader.nextDouble();
        
        if (n > 0) {
            System.out.println("+");
        } else if (n == 0){
            System.out.println(n);
        } else {
            System.out.println("-"); 
        }
    }
    
}
