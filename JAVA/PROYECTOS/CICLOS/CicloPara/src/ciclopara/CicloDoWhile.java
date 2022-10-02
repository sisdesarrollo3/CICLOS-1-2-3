/*
 Realizar un programa controlado por un menu, donde el usuari elija la opcion respectiva
 */
package ciclopara;

import java.util.Scanner;

public class CicloDoWhile {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);  
        char opcion = 'z';
        do{
            menu();
            opcion = teclado.next().charAt(0); 
            switch (opcion) {
                case '1': break;
                case '2': break;
                case '3': break;
                default:
                    System.out.println("OPCION NO VALIDA [1...4] ");
            }
        }while(opcion != '4');
        
    }
    
    public static void menu(){
        System.out.println("*** PROGRAM MINTIC *** ");
        System.out.println("===========================");
        System.out.println("[1]. OPCION 1");
        System.out.println("[2]. OPCION 1");
        System.out.println("[3]. OPCION 1");
        System.out.println("[4]. SALIR");
        System.out.print("SU OPCION");        
    }
    
}
