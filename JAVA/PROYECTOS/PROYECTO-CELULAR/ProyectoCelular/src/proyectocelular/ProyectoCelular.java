package proyectocelular;

import clases.Bateria;
import clases.Celular;
import clases.Chip;

public class ProyectoCelular {

    public static void main(String[] args) {
        // TODO code application logic here
        Bateria bateria1 = new Bateria();
        String marca = "EVERREDY";
        int miliAmperios = 100;
        bateria1.setMarca(marca);
        bateria1.setMiliamperios(miliAmperios);
        
        Chip chip1 = new Chip("TIGO", "321465789");
        
        Celular celular1;
        celular1 = new Celular("Sansum-Galazi-2022", 2, bateria1);
        
        celular1.agregarChip(chip1);
        
        celular1.mostrarDatos();
        
        //celular1.mostrarDatos();
    }//fin main
    
}
