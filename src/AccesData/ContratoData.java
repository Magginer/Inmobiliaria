/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesData;

import Entidades.Contrato;
import Entidades.Inmuebles;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ContratoData {

    private Connection con = null;

    private final InquilinoData Inq = new InquilinoData();
    private final InmueblesData Inm = new InmueblesData();
    private final PropietarioData pd = new PropietarioData();

    public ContratoData() {
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

    public void deletearContrato(int idcontrato) {

        String sql = "DELETE FROM contrato WHERE idcontrato=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idcontrato);

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

                JOptionPane.showMessageDialog(null, "se ha Renovado el Contrato");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la tabla Contrato");
        }
    }

    public ArrayList<Contrato> ListarContrato() {

        String sql = "SELECT  idcontrato ,fechadeinicio, fechadefinalizacion, alquiler, idinquilino, idinmueble FROM contrato WHERE vigente=1 ";
        ArrayList<Contrato> contratos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Contrato con = new Contrato();
                con.setIdcontrato(rs.getInt("idicontrato"));
                con.setFechadeinicio(rs.getDate("fechainicio").toLocalDate());
                con.setFechadefinalizacion(rs.getDate("fechadefinalizacion").toLocalDate());
                con.setAlquiler(rs.getInt("alquiler"));
                Inquilino inqui = new Inquilino();
                inqui.setIdinquilino(rs.getInt("idinquilino"));
                con.setInquilino(inqui);
                Inmuebles inm = new Inmuebles();
                con.setInmueble(inm);
                inm.setIdinmueble(rs.getInt("idinmueble"));

                contratos.add(con);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return contratos;
    }
}
