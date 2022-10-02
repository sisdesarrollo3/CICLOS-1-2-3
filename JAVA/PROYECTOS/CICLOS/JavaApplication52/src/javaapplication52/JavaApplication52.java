/*
del teclado con su correspondiente ASCII al frente.
Ejm: A->65 B->66………………..Z->90;
Tenga presente que el código ASCII va desde 1 hasta 255; los primeros no son imprimibles.
ANALISIS
ENTRADAS  :  
PROCESOS  :  
SALIDAS   :  caracter, ascii
*/
package javaapplication52;


public class JavaApplication52 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        char caracter = ' ';
        int ascii = 64;
        
        System.out.println("CARACTER  ASCII");
        System.out.println((char)(ascii) + "\t" + ascii);
    }
    
}
