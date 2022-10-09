package Clases;

public class Triangulo extends Figura {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangulo(double base, double altura, double lado1, 
        double lado2, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        calcularArea();
        calcularPerimetro();
    } 

    @Override
    public void calcularArea() {
        area = base * altura / 2;
    } 

    @Override
    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + base;
    }       
    
    @Override
    public String getTipoFigura() {
        return "FIGURA TRIANGULO";
    }
}