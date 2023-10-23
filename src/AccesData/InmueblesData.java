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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        String sql="UPDATE inmuebles SET direccion=? ,altura=? ,tipo=? ,superficie=? ,precio=? ,zona=? WHERE idinmueble=?";
        try {
            //UPDATE inmuebles SET direccion=?,altura=?,tipo=?,superficie=?,precio=?,zona=? WHERE idinmueble=?
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, inm.getDireccion());
            ps.setInt(2, inm.getAltura());
            ps.setString(3, inm.getTipo());
            ps.setInt(4, inm.getSuperficie());
            ps.setInt(5, inm.getPrecio());
            ps.setString(6, inm.getZona());
            ps.setInt(7, inm.getIdinmueble());
            
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
    public ArrayList<Inmuebles> ListarInmueble() {

        String sql = "SELECT  idinmueble ,direccion, altura, tipo, superficie, precio, zona  FROM inmuebles WHERE estado=0 ";
        ArrayList<Inmuebles> inmueble = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                Inmuebles inmu = new Inmuebles();
                inmu.setIdinmueble(rs.getInt("idinmueble"));
                inmu.setDireccion(rs.getString("direccion"));
                inmu.setAltura(rs.getInt("Altura"));
                inmu.setTipo(rs.getString("tipo"));
                inmu.setSuperficie(rs.getInt("superficie"));
                inmu.setPrecio(rs.getInt("precio"));
                inmu.setZona(rs.getString("zona"));
                inmu.setEstado(false);
                
                inmueble.add(inmu);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return inmueble;
    }
    public ArrayList<Inmuebles> InmueblesPorPropietarios(int idpropietario){
    
         String sql = "SELECT idinmueble, direccion, altura, tipo, superficie, precio, zona FROM inmuebles WHERE idpropietario = ?";

    ArrayList<Inmuebles> inmuebles = new ArrayList<>();
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idpropietario); // Establece el valor de idpropietario en el SQL
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Inmuebles inmueble = new Inmuebles();
            inmueble.setIdinmueble(rs.getInt("idinmueble"));
            inmueble.setDireccion(rs.getString("direccion"));
            inmueble.setAltura(rs.getInt("Altura"));
            inmueble.setTipo(rs.getString("tipo"));
            inmueble.setSuperficie(rs.getInt("superficie"));
            inmueble.setPrecio(rs.getInt("precio"));
            inmueble.setZona(rs.getString("zona"));
            
            inmuebles.add(inmueble);
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmuebles");
    }
        
        return inmuebles;
    }
    
    public ArrayList<Inmuebles> inmueblesxestado() {

        String sql = "SELECT  idinmueble ,direccion, altura, estado, idpropietario FROM inmuebles WHERE estado=0 ";
        ArrayList<Inmuebles> inmueble = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                Inmuebles inmu = new Inmuebles();
                inmu.setIdinmueble(rs.getInt("idinmueble"));
                inmu.setDireccion(rs.getString("direccion"));
                inmu.setAltura(rs.getInt("Altura"));
                inmu.setEstado(rs.getBoolean("estado"));
                
               Propietario propietario = new Propietario();
               inmu.setPropietario(propietario);
                
                inmueble.add(inmu);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return inmueble;
    }
}
