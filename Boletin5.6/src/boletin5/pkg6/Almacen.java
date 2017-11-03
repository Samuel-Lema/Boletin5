
package boletin5.pkg6;

public class Almacen {
    
    private static double ventas;
    
    public static void setVentas(double ventas){
        Almacen.ventas = ventas;
    }
    public static String Artigo(){
        
        String artigo = "";
        
        if(ventas <= 100){
            artigo = "baixo";
        } else if(ventas < 500){
            artigo = "medio";
        }else if(ventas > 500){
            artigo = "alto";
        }else if(ventas > 1000){
            artigo = "primera necesidade";
        }
        
        return artigo;
    }
}
