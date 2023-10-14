/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author javie
 */
public class Propietario {
    
    private int dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int telefono;
    private int idpropietario;
    private boolean estado;
   
    public Propietario() {
    }

    public Propietario(int dni, String nombre, String apellido, String domicilio, int telefono, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Propietario(int dni, String nombre, String apellido, String domicilio, int telefono, int idpropietario, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.idpropietario = idpropietario;
        this.estado = estado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdpropietario() {
        return idpropietario;
    }

    public void setIdpropietario(int idpropietario) {
        this.idpropietario = idpropietario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idpropietario +", "+ dni +", "+ nombre +", "+ apellido +", "+ domicilio +", "+ telefono;
    }

   
}  