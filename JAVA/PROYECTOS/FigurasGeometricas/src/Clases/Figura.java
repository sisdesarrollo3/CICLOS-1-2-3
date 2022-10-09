package Clases;
                      
import interfaces.IFormulas;

public abstract class Figura implements IFormulas { 

    //Atributos comunes a todas las figuras
    protected String nombre;
    protected double area;
    protected double perimetro;
    
    public Figura(String nombre, double area, double perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    } 

    //getter y setter
    public double getArea() {
        return area;
    }

       
    public double getPerimetro() {
        return perimetro;
    } 

    @Override
    public void calcularArea() {
        area = 0;
    } 

    @Override
    public void calcularPerimetro() {
        perimetro = 0;
    }     
    
    @Override
    public String getTipoFigura() {
        return "FIGURA PLANA";
    }

    /*
     * Métodos abstractos, cada figura "hija"
     * sobreescribirá estos métodos para hacer
     * los cálculos de estos atributos a su manera
    */
    //protected abstract void calcularArea();
    //protected abstract void calcularPerimetro();
}