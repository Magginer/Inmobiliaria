/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import AccesData.InquilinoData;
import AccesData.PropietarioData;
import Entidades.Inquilino;
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
        

     //Propietario elsa = new Propietario(158742,"elsa", "balero","Chacras 568", 456788654,true);
     //Propietario juan = new Propietario(87951396,"Juan", "Chamorro","calle falsa 123", 7895645,true);
     //PropietarioData prop=new PropietarioData();
     //prop.GuardarPropietario(juan);
     //prop.GuardarPropietario(elsa);

     Inquilino pepe = new Inquilino (3, 48984,"Moni","Argento","Las Heras 546","Dardo Fuseneco", 4874984,true);
     InquilinoData inq = new InquilinoData();
     //inq.GuardarInquilino(pepe);
     //inq.ModificarInquilino(pepe);
     //inq.EliminarLogico(3);
     //inq.DeletearInquilino(48984);
        
    }
   
}
