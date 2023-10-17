/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesData;

import Entidades.Inmuebles;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        
        String sql= "INSERT INTO inquilino( idinquilino , cuit, nombre, apellido, ltrabajo, ngarante, gdni, estado) VALUES (?,?,?,?,?,?,?,?)";
        // INSERT INTO propietarios( dni, nombre, apellido, domicilio, telefono) VALUES (?,?,?,?,?)
         try {
             PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, inquilino.getIdinquilino());
             ps.setInt(2, inquilino.getCuit());
             ps.setString(3, inquilino.getNombre());
             ps.setString(4, inquilino.getApellido());
             ps.setString(5, inquilino.getLtrabajo());
             ps.setString(6, inquilino.getNgarante());
             ps.setInt(7, inquilino.getDni());
             ps.setBoolean(8, inquilino.isEstado());
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
    public ArrayList<Inquilino> ListarInquilino() {

        String sql = "SELECT  idinquilino ,cuit, nombre, apellido, ltrabajo, ngarante, gdni FROM inquilino WHERE estado=1 ";
        ArrayList<Inquilino> inquilinos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                Inquilino inqui = new Inquilino();
                inqui.setIdinquilino(rs.getInt("idinquilino"));
                inqui.setCuit(rs.getInt("cuit"));
                inqui.setNombre(rs.getString("Nombre"));
                inqui.setApellido(rs.getString("Apellido"));
                inqui.setLtrabajo(rs.getString("ltrabajo"));
                inqui.setNgarante(rs.getString("ngarante"));
                inqui.setDni(rs.getInt("gdni"));
                inqui.setEstado(true);
                
                inquilinos.add(inqui);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return inquilinos;
    }
}
