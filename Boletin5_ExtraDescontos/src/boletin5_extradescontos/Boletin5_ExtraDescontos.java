package boletin5_extradescontos;
import java.util.Scanner;

public class Boletin5_ExtraDescontos {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        double prezo;
        int unidades;
        
        System.out.print("Introduce o precio do artigo: ");
        prezo = reader.nextDouble();
        System.out.print("Introduce as unidades vendidas: ");
        unidades = reader.nextInt();
        
        Ventas venta1 = new Ventas(prezo, unidades);
        
        System.out.print(venta1.calcularPrecio());
        
/*  Teclear o precio unitario dun artigo e o Nº de unidades vendidas, e obter a cantidade a pagar.
    Se o numero de unidades e menor que 100, non hai desconto.
    Se esta entre 100 e 200 e prezo unitario > 4000 se aplica un desconto do 5%.
    No resto un 2%. Se o número de unidades e maior ou igual a 200 e precio unitario maior de 4000
    se aplica un 10% de desconto.
    No resto un 8%. 
    Visualizar precio total sen desconto, desconto, e prezo final.*/
    }
    
}
