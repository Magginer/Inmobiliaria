/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author marti
 */
public class Inmuebles {
    private int idinmueble;
    private String direccion;
    private int altura;
    private String tipo;
    private int superficie;
    private int precio;
    private String zona;
    private boolean estado;
    private Propietario propietario;
    
    
    
    public Inmuebles() {
    }

    public Inmuebles(String direccion, int altura, String tipo, int superficie, int precio, String zona, boolean estado, Propietario propietario) {
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.zona = zona;
        this.estado = estado;
        this.propietario = propietario;
    }

    public Inmuebles(int idinmueble, String direccion, int altura, String tipo, int superficie, int precio, String zona, boolean estado, Propietario propietario) {
        this.idinmueble = idinmueble;
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.zona = zona;
        this.estado = estado;
        this.propietario = propietario;
    }

    public int getIdinmueble() {
        return idinmueble;
    }

    public void setIdinmueble(int idinmueble) {
        this.idinmueble = idinmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Inmuebles{" + "idinmueble=" + idinmueble + ", direccion=" + direccion + ", altura=" + altura + ", tipo=" + tipo + ", superficie=" + superficie + ", precio=" + precio + ", zona=" + zona + ", estado=" + estado + ", propietario=" + propietario + '}';
    }

    
    
    
    }
    
    
   