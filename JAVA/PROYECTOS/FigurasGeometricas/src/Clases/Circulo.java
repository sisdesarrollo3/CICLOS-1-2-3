package Clases;

public class Circulo extends Figura {
    private double radio;
    private double diametro;
       
    public Circulo(double radio, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
        calcularDiametro();
    } 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public double getDiametro() {
        return diametro;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    } 

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }      
    
    @Override
    public String getTipoFigura() {
        return "FIGURA CIRCULO";
    }
    
    public void calcularDiametro() {
        diametro = 2 * radio;
    }
    
}
