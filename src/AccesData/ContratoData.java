/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesData;

import Entidades.Contrato;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class ContratoData {
    
    private Connection con = null;
    
    private final InquilinoData Inq = new InquilinoData();
    private final InmueblesData Inm = new InmueblesData();
    private final PropietarioData pd = new PropietarioData();
    
    public ContratoData(){
        this.con = Conexion.getConexion();
    }
    
    public void guardarContrato(Contrato cont) {

        String sql = "INSERT INTO contrato (fechadeinicio, fechadefinalizacion, alquiler, vigente, idinquilino, idinmueble) VALUES (?,?,?,?,?,?)";
                 
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(cont.getFechadeinicio()));
            ps.setDate(2, Date.valueOf(cont.getFechadefinalizacion()));
            ps.setInt(3, cont.getAlquiler());
            ps.setBoolean(4, cont.isVigente());
            ps.setInt(5, cont.getInquilino().getIdinquilino());
            ps.setInt(6, cont.getInmueble().getIdinmueble());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cont.setIdcontrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato Generado Exitosamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la tabla de Contrato");
        }
    }
    
    public void deletearContrato(int idinquilino, int idinmueble) {

        String sql = "DELETE FROM contrato WHERE idinquilino=? and idinmueble=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idinquilino);
            ps.setInt(2, idinmueble);

            int filas = ps.executeUpdate();
            if (filas > 0) {

                JOptionPane.showMessageDialog(null, "Contrato Borrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la tabla Contratos");
        }
    }
    

    public void actualizarContrato(LocalDate fechadeinicio, LocalDate fechadefinalizacion, int alquiler, boolean vigente, int idcontrato) {


        String sql = "UPDATE contrato SET fechadeinicio=?, fechadefinalizacion=?, alquiler=?, vigente=? WHERE idcontrato=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(fechadeinicio));
            ps.setDate(2, Date.valueOf(fechadefinalizacion));
            ps.setInt(3, alquiler);
            ps.setBoolean(4, vigente);
            ps.setInt(5, idcontrato);

            int filas = ps.executeUpdate();
            if (filas > 0) {

                JOptionPane.showMessageDialog(null,"se ha Renovado el Contrato");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la tabla Contrato");
        }
    }
    
    
}
