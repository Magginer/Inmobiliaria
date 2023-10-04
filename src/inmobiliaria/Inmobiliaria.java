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
        

    Propietario elsa = new Propietario(158742,"elsa", "balero","Chacras 568", 456788654,true);
     //Propietario juan = new Propietario(87951396,"Juan", "Chamorro","calle falsa 123", 7895645,true);
     PropietarioData prop=new PropietarioData();
     //prop.GuardarPropietario(juan);
     prop.GuardarPropietario(elsa);

     
        
    }
   
}
