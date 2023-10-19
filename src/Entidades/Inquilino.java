/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ignac
 */
public class Inquilino {
    
    private int idinquilino;
    private int cuit;
    private String nombre;
    private String apellido;
    private String ltrabajo;
    private String ngarante;
    private int dni;
    private boolean estado;

    public Inquilino() {
    }

    public Inquilino(int cuit, String nombre, String apellido, String ltrabajo, String ngarante, int dni, boolean estado) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ltrabajo = ltrabajo;
        this.ngarante = ngarante;
        this.dni = dni;
        this.estado = estado;
    }

    public Inquilino(int idinquilino, int cuit, String nombre, String apellido, String ltrabajo, String ngarante, int dni, boolean estado) {
        this.idinquilino = idinquilino;
        this.cuit = cuit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ltrabajo = ltrabajo;
        this.ngarante = ngarante;
        this.dni = dni;
        this.estado = estado;
    }

    public int getIdinquilino() {
        return idinquilino;
    }

    public void setIdinquilino(int idinquilino) {
        this.idinquilino = idinquilino;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
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

    public String getLtrabajo() {
        return ltrabajo;
    }

    public void setLtrabajo(String ltrabajo) {
        this.ltrabajo = ltrabajo;
    }

    public String getNgarante() {
        return ngarante;
    }

    public void setNgarante(String ngarante) {
        this.ngarante = ngarante;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idinquilino + "- "+ nombre + "- " + apellido ;
    }
   
    
}
