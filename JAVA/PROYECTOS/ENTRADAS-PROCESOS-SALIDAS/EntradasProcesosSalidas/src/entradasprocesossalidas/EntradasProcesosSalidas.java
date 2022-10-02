/*
  programa qeu me permita mostrar nombre, edad, genero, tres notas y su promedio
ANALISIS:
ENTRADAS(que me dan - que necesito): nombre, genero, edad, nota1, nota2, nota3
PROCESOS (formular)                : promedio <- (nota1 + nota2 + nota3) / 3
SALIDA(que me piden - que mostrar) :   promedio
*/
package entradasprocesossalidas;

//[1] importar bibliotecas
import java.util.Scanner;

public class EntradasProcesosSalidas {

    public static void main(String[] args) {
       //[2] declaracion de variables con su tipo de dato
       String nombre = "";
       char genero = ' ';
       int edad = 0;
       float nota1 = 0.0f;
       float nota2  = 0.0f;
       float nota3  = 0.0f;
       double promedio = 0.0d;
       
       //[3] ENTRADAS
       Scanner teclado = new Scanner(System.in);
       System.out.print("NOMBRE: "); nombre  = teclado.nextLine();         
       System.out.print("GENERO[M]Máculino [F]Femenino: "); genero = teclado.next().charAt(0); 
       System.out.print("EDAD: ");  edad = teclado.nextInt();
       System.out.print("NOTA 1: "); nota1 = teclado.nextFloat();
       System.out.print("NOTA 2: "); nota2 = teclado.nextFloat();
       System.out.print("NOTA 3: "); nota3 = teclado.nextFloat();      
       
       //[4] Procesos
       promedio = (nota1 + nota2 + nota3) / 3.0;
       
       //[5] Salias  
       System.out.println("NOMBRES GENERO EDAD NOTA1 NOTA2 NOTA3 PROMEDIO");
       System.out.println(nombre + '\t' + genero + "\t" + edad + "\t" + nota1+ "\t" + nota2 + 
                                   "\t" + nota3 + "\t27" + promedio);
    }
    
}
