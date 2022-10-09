
package clases;

public class Bateria {
   //atributos de la clase
   private String marca;
   private int miliamperios;
   
   //constructor
    public Bateria(String marca, int miliamperios) {
        this.marca = marca;
        this.miliamperios = miliamperios;
    }

    public Bateria() {
    }
    
    //Encapsulamiento get y set

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMiliamperios() {
        return miliamperios;
    }

    public void setMiliamperios(int miliamperios) {
        this.miliamperios = miliamperios;
    }
    
   
}
