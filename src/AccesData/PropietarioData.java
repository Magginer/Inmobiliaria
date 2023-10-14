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
import java.util.ArrayList;
import java.util.List;
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
        
        String sql= "INSERT INTO propietarios( idpropietario, dni, nombre, apellido, domicilio, telefono, estado) VALUES (?,?,?,?,?,?,?)";
        // INSERT INTO propietarios( dni, nombre, apellido, domicilio, telefono) VALUES (?,?,?,?,?)
         try {
             PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, propietario.getIdpropietario());
             ps.setInt(2, propietario.getDni());
             ps.setString(3, propietario.getNombre());
             ps.setString(4, propietario.getApellido());
             ps.setString(5, propietario.getDomicilio());
             ps.setInt(6, propietario.getTelefono());
             ps.setBoolean(7, propietario.isEstado());
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
        String sql="UPDATE `propietarios` SET dni=?, nombre=?, apellido=?, domicilio=?, telefono=? WHERE idpropietario=?";
        //UPDATE `propietarios` SET dni=?,nombre=?,apellido=?,domicilio=,telefono=? WHERE idpropietario=?
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, propietario.getDni());
             ps.setString(2, propietario.getNombre());
             ps.setString(3, propietario.getApellido());
             ps.setString(4, propietario.getDomicilio());
             ps.setInt(5, propietario.getTelefono());
             ps.setInt(6, propietario.getIdpropietario());
             
             int exito=ps.executeUpdate();
             System.out.println("Propietario Modificado.");
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Propietario Modificado Exitosamente.");
             }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar a la Tabla Propietario.");
         }
        
    }
    public void EliminarLogico(int idpropietario){
        String sql = "UPDATE propietarios SET estado = 0 WHERE idpropietario=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idpropietario);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario borrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");

        }
        
        
    }
    public void DeletearPropietario(int dni){
        String sql="DELETE FROM propietarios WHERE dni=?";
        
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setInt(1, dni);
             int exito=ps.executeUpdate();
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Propietario eliminado");
             }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Propietarios.");
                    
         }
        
    }
    public List<Propietario> ListarPropietarios() {

        String sql = "SELECT  idpropietario ,dni, nombre, apellido, domicilio, telefono FROM propietarios WHERE estado=1 ";
        ArrayList<Propietario> propietarios = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                Propietario propietario = new Propietario();
                propietario.setIdpropietario(rs.getInt("idpropietario"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setEstado(true);
                
                propietarios.add(propietario);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return propietarios;
    }
}
