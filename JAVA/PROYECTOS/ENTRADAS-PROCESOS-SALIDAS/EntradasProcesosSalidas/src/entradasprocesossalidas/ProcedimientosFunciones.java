/*
Se requiere de un programa escolar, que le permita a los estudiantes hallar el área y el perímetro de un Triangulo, 
mostrando la formula completa al momento de visualizar la respuesta

ANALISIS
ENTRADAS   base, altura, lado1, lado2
PROCESOS:  area ?  base * altura / 2
           perímetro = base + lado1 + lado2
SALIDAS :  area, perimetro
           mostrar la formula completa
*/
package entradasprocesossalidas;
import java.util.Scanner;

public class ProcedimientosFunciones {


    public static void main(String[] args) {
        // TODO code application logic here
        //[2] declaracion de variables con su tipo de dato
        float base=0.0f, altura=0.0f, lado1=0.0f, lado2=0.0f, area = 0.0f, perimetro = 0.0f;
        
        //[3] ENTRADAS
        Scanner sc = new Scanner(System.in);
        System.out.print("BASE: ");  base    = sc.nextFloat();
        System.out.print("LADO1: "); lado1  = sc.nextFloat();
        System.out.print("LADO2: "); lado2  = sc.nextFloat();
        System.out.print("ALTURA: "); altura = sc.nextFloat();
        
        //[4] Procesos
        area = calcularArea(base, altura);
        perimetro = calcularPerimetro(base, lado1, lado2);
        
        mostrarSalidas(base, altura, lado1, lado2, area, perimetro);
        
    } //fin del main
    
    public static float calcularArea(float b, float h) {
       float area = b * h / 2;
       return area;
    } //fin de calcularArea
    
    public static float calcularPerimetro(float b, float l1, float l2) {
       return b + l1 + l2;
    } //fin de calcularPerimetro
    
    //procedimiento NO retorna ninun valor - solo muestra
    public static void mostrarSalidas(float base, float altura, float lado1, float lado2, float area, float per){
        //[5] Salias 
        System.out.println("PROGRAMA DE TRIANGULOS: ");
        System.out.println("BASE    LADO1 LADO2 ALTURA AREA PERIMETRO ");
        System.out.println("=======================================");
        System.out.println(base + "\t" + lado1 + "\t" + lado2 + "\t" + altura + "\t" + area + "\t" + per);
        
        System.out.println("\n AREA = " + base + " * " + altura + " / 2");
        System.out.println("\n PERIMETRO = " + base + " + " + lado1 + " + " + lado2);    
    }//fin de mostrar salidas
}
