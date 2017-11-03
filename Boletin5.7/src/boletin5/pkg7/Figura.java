
package boletin5.pkg7;

public class Figura {
    
    private String figura;
    
    public Figura(String figura){
        this.figura = figura;
    }
    
    public void setFigura(String figura){
        this.figura = figura;
    }
    public String getFigura(){
        return figura;
    }
    public String knowFigura(){
        
        String figuraTemp = "";
        
        switch(this.figura){
            case "Cadrado" : figuraTemp = "E un cadrado."; break;
            case "Triangulo" : figuraTemp = "E un triángulo."; break;
            case "Circulo" : figuraTemp = "E un circulo."; break;
        }
        return figuraTemp;
    }
}
