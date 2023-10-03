/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class Conexion {
    
    private static final String URL= "jdbc:mariadb://localhost/";
    private static final String DB="inmobiliaria";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection conect;
    
    
    private Conexion(){}
    
    public static Connection getConexion(){
        
        if (conect ==null) {
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                
                conect = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar el Driver ");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de Conexion ");
            }
            
        }
        return conect;
    }
    
    
}

    
}
