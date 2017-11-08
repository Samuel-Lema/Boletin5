
package boletin5.pkg7;

public class Figura {
    
    private int figura;
    
    public Figura(int figura){
        this.figura = figura;
    }
    
    public void setFigura(int figura){
        this.figura = figura;
    }
    public String getFigura(){
        return "" + figura;
    }
    public String knowFigura(){
        
        String figuraTemp = "";
        
        switch(this.figura){
            case 1 : figuraTemp = "E un cadrado."; break;
            case 2 : figuraTemp = "E un triángulo."; break;
            case 3 : figuraTemp = "E un circulo."; break;
        }
        return figuraTemp;
    }
}
