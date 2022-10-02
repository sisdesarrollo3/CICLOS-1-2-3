/*
 Programa que permita escribir, la tabla de multiplicar de un número dado (N). Ejm: la tabla del 9 mostrar:
9*1=9
9*2=18
Que pida tablas hasta que el usuario el usuario responda NO
 */
package ciclopara;

import java.util.Scanner;

public class WhileTablas {

    public static void main(String[] args) {
        // TODO code application logic here
        int tabla = 1;
        Scanner sc = new Scanner(System.in);
        char respuesta = 's';
        while (Character.toUpperCase(respuesta) != 'N') {
            System.out.print("QUE TABLA DESEA: ");  tabla  = sc.nextInt();
            setTabla(tabla);
            System.out.print("CONTINUAR (Si/No): "); respuesta = sc.next().charAt(0);
        }          
        System.out.print("GRACIAS POR UTILIZAR NUESTRO PROGRAMA: "); 
    }//fin del main
    
    public static void setTabla(int tabla){      
        int contador = 1; int resultado = 0;
        while (contador <= 10) {
            resultado = tabla * contador;
            System.out.println(tabla + " * " +  contador + " = " + resultado);
            contador++;
        }
    }    
}//FIN DE CLASE

