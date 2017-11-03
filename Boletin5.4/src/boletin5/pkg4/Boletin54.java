
package boletin5.pkg4;

import java.util.Scanner;

public class Boletin54 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        String nome1, nome2;
        double n1, n2;
        
        System.out.print("Introduce el nombre 1: "); 
        nome1 = reader.next();
        System.out.print("Introduce el peso del nombre 1: ");  
        n1 = reader.nextDouble();
        System.out.print("Introduce el nombre 2: ");  
        nome2 = reader.next();
        System.out.print("Introduce el peso del nombre 2: ");  
        n2 = reader.nextDouble();
        
        if (n1 > n2) {
            System.out.println("Nome: " + nome1 + ", Peso: " + n1 + ", Diferencia: " + (n1 - n2));
        } else {
            System.out.println("Nome: " + nome2 + ", Peso: " + n2 + ", Diferencia: " + (n2 - n1));
        }
    }
    
}
