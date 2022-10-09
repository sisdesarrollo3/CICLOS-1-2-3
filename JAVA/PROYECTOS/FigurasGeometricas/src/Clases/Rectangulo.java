package Clases;
import java.util.Scanner;

public class Rectangulo extends Figura {
    //atributos
    double alto;
    double ancho;
    
    //constructor creo el objeto
    public Rectangulo(double alto, double ancho, String nombre, double area, 
                      double perimetro) {
        super(nombre, area, perimetro);         
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n*** INGRESANDO DATOS DEL RECTANGULO *** ");
        System.out.print("\nNombre Rectángulo: "); this.nombre = teclado.nextLine();
        System.out.print("Introduzca el ancho: "); this.ancho = teclado.nextDouble();
        System.out.print("Introduzca el alto : "); this.alto = teclado.nextDouble();
        
        calcularArea();
        calcularPerimetro();
    } 
    
    public String getNombre() {
        return nombre;
    } 

    // Getter y setter
    public void setNombre(String nombre) {    
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    } 

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    } 

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        System.out.println("Introduzca el alto: ");
        Scanner sc= new Scanner(System.in);
        this.alto = sc.nextDouble();
    } 

    public double getAncho() {
        return ancho;
    } 

    public void setAncho(double ancho) {
        System.out.println("Introduzca el ancho");
        Scanner sc= new Scanner(System.in);
        this.ancho = sc.nextDouble();
    }
    
    public void setMostrar(){
    
    }
    /*
     * Sobrescribimos los métodos heredados de la clase madre Figura
     * Los atributos área y perímetro son visibles en el ámbito de Rectangulo
     * porque en la clase Figura se establecieron como protected en lugar de private
    */

    @Override
    public void calcularArea() {
        area = alto * ancho;
    } 

    @Override
    public void calcularPerimetro() {
        perimetro = (2*alto) + (2*ancho);
    }   
    
    @Override
    public String getTipoFigura() {
        return "FIGURA RECTANGULO";
    }
}