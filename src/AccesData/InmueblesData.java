/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesData;

import Entidades.Inmuebles;
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
 * @author marti
 */
public class InmueblesData {
    private Connection con = null;
    
    
    public InmueblesData(){
        con = Conexion.getConexion();
        
    }
    
    
    
    public void GuardarInmueble(Inmuebles inm){
        String sql="INSERT INTO inmuebles(direccion, altura, tipo, superficie, precio, zona, estado, idpropietario) VALUES (?,?,?,?,?,?,?,?)";
        //INSERT INTO inmuebles(idinmuebl, direccion, altura, tipo, superficie, precio, zona, estado, idpropietario) VALUES ()
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inm.getDireccion());
            ps.setInt(2, inm.getAltura());
            ps.setString(3, inm.getTipo());
            ps.setInt(4, inm.getSuperficie());
            ps.setInt(5, inm.getPrecio());
            ps.setString(6, inm.getZona());
            ps.setBoolean(7, inm.isEstado());
            ps.setInt(8, inm.getPropietario().getIdpropietario());
            ps.executeQuery();
            
            ResultSet rs= ps.getGeneratedKeys(); 
             if (rs.next()) {
                 inm.setIdinmueble(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Inmueble Guardado Exitosamente.");
             }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inmuebles");
        }
    }
    public void ModifacacionInmueble(Inmuebles inm){
        String sql="UPDATE inmuebles SET direccion=?,altura=?,tipo=?,superficie=?,precio=?,zona=?,estado=? WHERE idinmueble=?";
        try {
            //UPDATE inmuebles SET direccion=?,altura=?,tipo=?,superficie=?,precio=?,zona=?,estado=? WHERE idinmueble=?
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, inm.getDireccion());
            ps.setInt(2, inm.getAltura());
            ps.setString(3, inm.getTipo());
            ps.setInt(4, inm.getSuperficie());
            ps.setInt(5, inm.getPrecio());
            ps.setString(6, inm.getZona());
            ps.setBoolean(7, inm.isEstado());
            
            int exito=ps.executeUpdate();
             System.out.println("Inmueble Modificado.");
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Inmueble Modificado Exitosamente.");
             }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inmuebles.");
        }
        
    }
    public void EliminadoLogico(int idinmueble){
         String sql = "UPDATE inmuebles SET estado = 0 WHERE idinmueble=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idinmueble);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inmueble Borrado Indefinidamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble");

        }
    }
    public void DeletearInmueble(int idinmueble){
        String sql="DELETE FROM inmuebles WHERE idinmueble=?";
        
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setInt(1, idinmueble);
             int exito=ps.executeUpdate();
             if (exito==1) {
                 JOptionPane.showMessageDialog(null, "Inmueble eliminado");
             }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inmuebles.");
                    
         }
    }
    
}
