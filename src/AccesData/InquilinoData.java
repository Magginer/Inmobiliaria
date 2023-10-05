/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesData;

import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class InquilinoData {
    private Connection con=null;
     
     
    public InquilinoData(){
        
        con= Conexion.getConexion();
    }   
 
    
    public void GuardarInquilino (Inquilino inquilino){
        
        String sql= "INSERT INTO inquilino( cuit, nombre, apellido, ltrabajo, ngarante, gdni, estado) VALUES (?,?,?,?,?,?,?)";
        // INSERT INTO propietarios( dni, nombre, apellido, domicilio, telefono) VALUES (?,?,?,?,?)
         try {
             PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, inquilino.getCuit());
             ps.setString(2, inquilino.getNombre());
             ps.setString(3, inquilino.getApellido());
             ps.setString(4, inquilino.getLtrabajo());
             ps.setString(5, inquilino.getNgarante());
             ps.setInt(6, inquilino.getDni());
             ps.setBoolean(7, inquilino.isEstado());
             ps.executeQuery();
             
             ResultSet rs= ps.getGeneratedKeys();
             if (rs.next()) {
                 inquilino.setIdinquilino(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Inquilino Guardado Exitosamente.");
             }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la Tabla de Inquilino.");
         }
    }
    public void ModificarInquilino(Inquilino inquilino){
        String sql="UPDATE inquilino SET cuit=?, nombre=?, apellido=?, ltrabajo=?, ngarante=?, gdni=? WHERE idinquilino=?";
        //UPDATE `propietarios` SET dni=?,nombre=?,apellido=?,domicilio=,telefono=? WHERE idpropietario=?
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, inquilino.getCuit());
             ps.setString(2, inquilino.getNombre());
             ps.setString(3, inquilino.getApellido());
             ps.setString(4, inquilino.getLtrabajo());
             ps.setString(5, inquilino.getNgarante());
             ps.setInt(6, inquilino.getDni());
             ps.setInt(7, inquilino.getIdinquilino());
             
             int exito=ps.executeUpdate();
             System.out.println("Inquilino Modificado.");
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Inquilino Modificado Exitosamente.");
             }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar a la Tabla Inquilino.");
         }
        
    }
    public void EliminarLogico(int idinquilino){
        String sql = "UPDATE inquilino SET estado = 0 WHERE idinquilino=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idinquilino);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario borrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");

        }
        
        
    }
    public void DeletearInquilino(int cuit){
        String sql="DELETE FROM inquilino WHERE cuit=?";
        
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setInt(1, cuit);
             int exito=ps.executeUpdate();
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Inquilino eliminado");
             }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inquilino.");
                    
         }
        
    }
    
}
