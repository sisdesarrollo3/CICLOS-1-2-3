
package Controlador;

import Clase.clsColor;
import Modelo.modelColor;
import java.util.ArrayList;
import java.util.LinkedList;


public class ctlColor {
    private modelColor modelColor;

    public ctlColor() {
        this.modelColor = new modelColor();
    }
    
    //operaciones del CRUD entre Vista y Model
    public boolean insertar (clsColor color) {
       try {
        this.modelColor.insertar((clsColor)color);
        return true;
       }     
       catch(Exception e) {
         return false;
       }
    } 
    
    
    public clsColor consultar (int id) {
        clsColor color = null;
        try {
           color = this.modelColor.consultar(id);
           return color;
       }catch(Exception e) {
         return color;
       }
    }   
    
    public boolean actualizar (clsColor color) {
       try {
           boolean rowsActualizadas = this.modelColor.actualizar((clsColor) color);
           return (rowsActualizadas);
       }     
       catch(Exception e) {
         return false;
       }
    }   
    
    public boolean eliminar ( int idColor ) {
       try {
         boolean rowsEliminadas = this.modelColor.eliminar(idColor);
         return (rowsEliminadas);
       }catch(Exception e) {
         return false;
       }
    }
    
    /*public LinkedList<clsColor> listar () {
        LinkedList<clsColor> colorList = null;
        try {
            colorList = this.modelColor.listar();
            return colorList;
        } catch (Exception e) {
            return null;
        }
    } 
    
    public ArrayList<clsColor> cargar () {
        ArrayList<clsColor> listaColors = null;
        try {
            listaColors = this.modelColor.cargar();
            return listaColors;
        } catch (Exception e) {
            return null;
        }
    }  */
    
}
