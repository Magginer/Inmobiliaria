/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ignac
 */
public class ContratoData {
    
    private Connection con = null;
    
    private final InmueblesData ind= new InmueblesData();
    private final //InquilinoData inq = new InquilinoData();
    
    
    
    public ContratoData(){
        this.con = Conexion.getConexion();
    }
    
    public void buscarContrato(){ //Como MRD nombro esto??? atte: Ignacio UwU
        
    }
    
    public void cancelacion(){  //el deletear contrato
        
    }
    
    public void Crear_Contrato(ContratoVenta){  //el guardar contrato
        
    }
    
    public void Renovacion(){  //el modificar contrato
        
    }
}
