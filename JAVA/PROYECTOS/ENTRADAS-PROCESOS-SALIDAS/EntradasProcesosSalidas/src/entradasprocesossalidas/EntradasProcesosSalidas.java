package entradasprocesossalidas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EntradasProcesosSalidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println( "EDAD:");
        int edad = teclado.nextInt();        
        System.out.println( "SU EDAD ES: " + edad);
        
        int tecla = 64;
        System.out.println( "SU EDAD ES: " + (char)(tecla));

    }
    
}
