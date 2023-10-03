/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesData;

import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class PropietarioData {
 
     private Connection con=null;
     
     
    public PropietarioData(){
        
        con= Conexion.getConexion();
    }   
 
    
    public void GuardarPropietario (Propietario propietario){
        
        String sql= "INSERT INTO propietarios( dni, nombre, apellido, domicilio, telefono) VALUES (?,?,?,?,?)";
        // INSERT INTO propietarios( dni, nombre, apellido, domicilio, telefono) VALUES (?,?,?,?,?)
         try {
             PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, propietario.getDni());
             ps.setString(2, propietario.getNombre());
             ps.setString(3, propietario.getApellido());
             ps.setString(4, propietario.getDomicilio());
             ps.setInt(5, propietario.getTelefono());
             ps.executeQuery();
             
             ResultSet rs= ps.getGeneratedKeys();
             if (rs.next()) {
                 propietario.setIdpropietario(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Propietario Guardado Exitosamente.");
             }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la Tabla de Propietarios.");
         }
    }
    public void ModificarPropietario(Propietario propietario){
        String sql="UPDATE `propietarios` SET dni=?, nombre=?, apellido=?, domicilio=, telefono=? WHERE idpropietario=?";
        //UPDATE `propietarios` SET dni=?,nombre=?,apellido=?,domicilio=,telefono=? WHERE idpropietario=?
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, propietario.getDni());
             ps.setString(2, propietario.getNombre());
             ps.setString(3, propietario.getApellido());
             ps.setString(4, propietario.getDomicilio());
             ps.setInt(5, propietario.getTelefono());
             
             int exito=ps.executeUpdate();
             System.out.println("Propietario Modificado.");
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Propietario Modificado Exitosamente.");
             }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar a la Tabla Propietario.");
         }
        
    }
    public void EliminarLogico(Propietario propietario){
        
    }
    
}
