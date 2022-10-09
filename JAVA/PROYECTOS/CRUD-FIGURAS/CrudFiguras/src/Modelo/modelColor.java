
package Modelo;

import Clase.clsColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;


public class modelColor {
    BDdata bdDatos;

    public modelColor() {
       bdDatos = new BDdata();
    }
    
    //TODAS LAS OPERACIONES PARA EL CRUD
    public boolean insertar(clsColor color) {
        try (Connection conn = bdDatos.conexionBD()){
          try{                  
                String query = "INSERT INTO color (col_nombre) VALUES(?)";
                PreparedStatement pstColor = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);            
                pstColor.setString(1, color.getNombre());

                int rowsInserted = pstColor.executeUpdate();
                //System.out.println("SQL " + query);            
                if (rowsInserted > 0) {
                    /*ResultSet generatedKeys = pstColor.getGeneratedKeys();
                    if (generatedKeys.next()){
                        int idColor = generatedKeys.getInt(1);
                        System.out.println("clave id: " + idColor);
                    }*/
                    return true;                
                }
            } catch (SQLIntegrityConstraintViolationException e) {  //error integridad referencial
                System.out.println("ERROR INTEGRIDAD REFERENCIAL: " + e.getMessage());
                return false;
            }
        } catch (SQLException e) {  //error en la construccion del SQL
            System.out.println("ERROR EN SU SQL: " + e.getMessage());
            return false;
        }
        return false;
    }//fin insertar
    
    public clsColor consultar (int idColor) {
        clsColor color = null;
        try (Connection conn = bdDatos.conexionBD()){
            String query = "SELECT col_id, col_nombre FROM color WHERE col_id = ? LIMIT 1";
            PreparedStatement pstColor = conn.prepareStatement(query);
            pstColor.setInt(1, idColor);
            ResultSet result = pstColor.executeQuery();
            while (result.next()) {
                int id = result.getInt(1);
                String nombre = result.getString(2);
                color = new clsColor(id, nombre);
            }
            return color;
        } catch (SQLException e) {
            return color;
        }
    } //FIN DE CONSULTAR
    
    public boolean actualizar(clsColor color) {
        try (Connection conn = bdDatos.conexionBD()){
            conn.setAutoCommit(false);
            Savepoint savePoint = conn.setSavepoint("updatePoint");            
            try {             
                String query = "UPDATE color "
                        + "        SET col_nombre=?"
                        + "      WHERE col_id = ?";
                PreparedStatement pstColor = conn.prepareStatement(query);
                pstColor.setString(1, color.getNombre());
                pstColor.setInt(2, color.getId());
                int rowsUpdate = pstColor.executeUpdate();
                conn.commit();
                return (rowsUpdate > 0);
            } catch (SQLIntegrityConstraintViolationException e) {  //error integridad referencial
                System.out.println("ERROR INTEGRIDAD REFERENCIAL: " + e.getMessage());
                conn.rollback(savePoint);
                return false;
            }
        } catch (SQLException e) {  //error en la construccion del SQL
            System.out.println("ERROR EN SU SQL: " + e.getMessage());
            return false;
        }
    } //fin actualizar
    
    
    public boolean eliminar(int idColor) {
        try (Connection conn = bdDatos.conexionBD()){
            conn.setAutoCommit(false);
            Savepoint savePoint = conn.setSavepoint("deletePoint");            
            try {             
                String query = "DELETE FROM color WHERE col_id = ?";
                PreparedStatement pstColor = conn.prepareStatement(query);
                pstColor.setInt(1, idColor);
                int rowsDelete = pstColor.executeUpdate();
                conn.commit();
                return (rowsDelete > 0);
            } catch (SQLIntegrityConstraintViolationException e) {  //error integridad referencial
                System.out.println("ERROR INTEGRIDAD REFERENCIAL: " + e.getMessage());
                conn.rollback(savePoint);
                return false;
            }
        } catch (SQLException e) {  //error en la construccion del SQL
            System.out.println("ERROR EN SU SQL: " + e.getMessage());
            return false;
        }
        //return false;
    }//fin de eliminar
    
    /*
    public LinkedList<clsColor>  listar () {
        LinkedList<clsColor> colorList = new LinkedList<>();
        clsColor color = null;        
        //color = new clsColor(0, "--Seleccionar--");
        //colorList.add(color);
        try (Connection conn = bdDatos.conexionBD()){
            String query = "SELECT cic_id, cic_nombre FROM color";
            PreparedStatement pstColor = conn.prepareStatement(query);
            ResultSet result = pstColor.executeQuery();
            while (result.next()) {
                int cicId        = result.getInt(1);
                String sedNombre = result.getString(2);
                color = new clsColor(cicId, sedNombre);
                colorList.add(color);
            }
            return colorList;
        } catch (SQLException e) {
            return colorList;
        }
    }//fin de listar 
    
    public ArrayList<clsColor>  cargar () {
        ArrayList<clsColor> listaColors = new ArrayList<>();
        clsColor color = null;        
        color = new clsColor(0, "--Seleccionar--");
        listaColors.add(color);
        try (Connection conn = bdDatos.conexionBD()){
            String query = "SELECT cic_id, cic_nombre FROM color";
            PreparedStatement pstColor = conn.prepareStatement(query);
            ResultSet result = pstColor.executeQuery();
            while (result.next()) {
                int cicId        = result.getInt(1);
                String sedNombre = result.getString(2);
                color = new clsColor(cicId, sedNombre);
                listaColors.add(color);
            }
            return listaColors;
        } catch (SQLException e) {
            return listaColors;
        }
    }//fin de cargar 
   */
}
