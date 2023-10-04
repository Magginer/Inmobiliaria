/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import AccesData.PropietarioData;
import Entidades.Propietario;

/**
 *
 * @author marti
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Propietario margo = new Propietario(123456,"Margo", "Garcia","Chacras 568", 456788654,7,true);
     Propietario juan = new Propietario(879513,"Juan", "Chamorro","calle falsa 123", 7895645,8,true);
     PropietarioData prop=new PropietarioData();
     //prop.GuardarPropietario(juan);
     //prop.ModificarPropietario(margo);
     //prop.DeletearPropietario(123456);
     //prop.EliminarLogico(7);
     
        
    }
   
}
