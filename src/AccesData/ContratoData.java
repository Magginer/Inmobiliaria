/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesData;

import java.sql.Connection;

/**
 *
 * @author ignac
 */
public class ContratoData {
    
    private Connection con = null;
    
    private final InmueblesData id= new InmueblesData();
    private final PropietarioData pd= new PropietarioData();
    
    
    
    public ContratoData(){
        this.con = Conexion.getConexion();
    }
    
    public void buscarContrato(){
        
    }
    
    public void cancelacion(){
        
    }
    
    public void Crear_Contrato(ContratoVenta){
        
    }
    
    public void Renovacion(){
        
    }
}
