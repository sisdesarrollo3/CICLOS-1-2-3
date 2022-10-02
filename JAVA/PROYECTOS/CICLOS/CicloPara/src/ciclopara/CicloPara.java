/*
 del teclado con su correspondiente ASCII al frente.
Ejm: A->65 B->66………………..Z->90;
Tenga presente que el código ASCII va desde 1 hasta 255; los primeros no son imprimibles.

 */
package ciclopara;

public class CicloPara {

    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        char caracter = ' ';
        int ascii = 64;
        
        System.out.println("CARACTER    ASCII");
        for (ascii = 33; ascii <= 255; ascii++) {
           System.out.println((char)(ascii) + "\t" + ascii);  
        }
        
        //POTENCIA
        //System.out.println("EJEMPLO DE POW (BASE-POTENCIA " + Math.pow(2, 4));
        System.out.println("EJEMPLO DE POW (BASE-POTENCIA " + myPotencia(3, 4));
    }
    
    public static int myPotencia (int base, int exponente){
        int resultado = base;   //2*2*2*2
        for (int contador=1; contador < exponente; contador++) {
           resultado = resultado * base;
        }           
        return resultado;
    }
    
}
