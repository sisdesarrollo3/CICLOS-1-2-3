/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundaciondog;

import clases.clsPerro;

/**
 *
 * @author Usuario
 */
public class FundacionDog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTACIAR OBJETOS APARTIR DE UNA CLASE
        clsPerro perro1 = new clsPerro();
        perro1.setNombre("TONY");
        perro1.setPeso(5);
        perro1.setRaza("CHIGUAGUA");        
        System.out.println("NOMBRE: " + perro1.getNombre());
        System.out.println("DATOS DEL PERRO 1");
        System.out.println(perro1.getDatosPerro());
    }
    
}
