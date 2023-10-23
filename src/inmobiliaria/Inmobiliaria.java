/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import AccesData.ContratoData;
import AccesData.InmueblesData;
import AccesData.InquilinoData;
import AccesData.PropietarioData;
import Entidades.Contrato;
import Entidades.Inmuebles;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.time.LocalDate;

/**
 *
 * @author marti
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

     Propietario jose = new Propietario(654,"Josadsad", "asdas","qwesdasdq 456", 879,45,true);
     //Propietario juan = new Propietario(87951396,"Juan", "Chamorro","calle falsa 123", 7895645,8,true);
     PropietarioData prop=new PropietarioData();
     //prop.GuardarPropietario(jose);
     //prop.GuardarPropietario(elsa);
     //prop.ListarPropietarios();
     //prop.DeletearPropietario(549798);
     
     
     Inquilino pepe = new Inquilino (85,895236,"asdas","Argenasdasto","asdasdasd 458","Dardo Fuseneco", 4874984,true);
     InquilinoData inq = new InquilinoData();
     //inq.GuardarInquilino(pepe);
     //inq.ModificarInquilino(pepe);
     //inq.EliminarLogico(87);
     //inq.DeletearInquilino(895236);
     
     Inmuebles inm = new Inmuebles (15,"asqqwq", 456, "depa", 50, 96000, "qweqwe", true, jose);
     InmueblesData inms=new InmueblesData();
     //inms.GuardarInmueble(inm);
     //inms.ModifacacionInmueble(inm);
     //inms.EliminadoLogico(19);
     //inms.DeletearInmueble(19);
     
     Contrato con = new Contrato(LocalDate.of(2015, 4, 25), LocalDate.of(2026, 4, 25), 120000, true, pepe, inm);
     ContratoData cont = new ContratoData();
     //cont.guardarContrato(con);
     //cont.actualizarContrato(LocalDate.of(2016, 4, 25), LocalDate.of(2030, 4, 25), 151515, true, 12);
     cont.deletearContrato(12);
 
          
    //coño la madre
        
     
    }
   
}
