/*
DETERMINAR SI UNA LETRA ES VOCAL O NO
ANALISIS
ENTRADAS : letra
PROCESOS : mensaje <- "ES VOCAL"      condicionar
           mensaje <- "NO ES VOCAL"   condicionar
SALIDAS  : mensaje
*/
package condicionales;

import java.util.Scanner;


public class VocalesSwitch {

   
    public static void main(String[] args) {
        // TODO code application logic here
        char letra = ' ';
        String mensaje = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE LETRA: "); letra = teclado.nextLine().charAt(0);
        
        //mensaje = getVocal(letra);
        System.out.println("LETRA " + letra + "\t" + getVocal(letra));  
        System.out.println("ASCII " + letra + "\t" + (int)(letra));
        
        if ((Character.toLowerCase(letra) >= 'a' && Character.toLowerCase(letra) <= 'z') ||
                ((int)(Character.toLowerCase(letra)) == 241)) {
           mensaje = "ES CONSONANTE";
           System.out.println("LETRA " + letra + "\t ES DEL ALFABETO");  
        }            
    }
    
    public static String getVocal(char letra){
        String mensaje = "NO ES VOCAL";
        switch (Character.toLowerCase(letra)) {
            case 'a': 
            case 'e':
            case 'i': 
            case 'o': 
            case 'u': mensaje = "ES VOCAL"; break;
            default:
                 mensaje = "NO ES VOCAL";
        }
        return mensaje;
    }
    
}
