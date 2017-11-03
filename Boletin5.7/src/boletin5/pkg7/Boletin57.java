
package boletin5.pkg7;

import java.util.Scanner;

public class Boletin57 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Introduce la figura: ");  
        Figura figura1 = new Figura(reader.next());
        
        System.out.print(figura1.knowFigura());
    }
    
}
