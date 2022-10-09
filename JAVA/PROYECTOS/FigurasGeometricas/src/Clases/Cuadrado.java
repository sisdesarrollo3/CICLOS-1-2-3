
package Clases;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    
     
    
    public String getNombre() {
        return nombre;
    } 

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public void calcularArea() {
        area = lado * lado;
    } 

    @Override
    public void calcularPerimetro() {
        perimetro = (2*lado) + (2*lado);
    }   
    
    @Override
    public String getTipoFigura() {
        return "FIGURA CUADRADO";
    }
    
}
