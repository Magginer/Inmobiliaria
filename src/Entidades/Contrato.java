/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ignac
 */
public class Contrato {
    
    private int idcontrato;
    private int fechadeinicio;
    private int fechadefin;
    private int alquiler;
    private int vigente;
    private Inquilino inquilino;
    private Inmuebles inmueble;

    public Contrato() {
    }

    public Contrato(int fechadeinicio, int fechadefin, int alquiler, int vigente, Inquilino inquilino, Inmuebles inmueble) {
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.alquiler = alquiler;
        this.vigente = vigente;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
    }

    public Contrato(int idcontrato, int fechadeinicio, int fechadefin, int alquiler, int vigente, Inquilino inquilino, Inmuebles inmueble) {
        this.idcontrato = idcontrato;
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.alquiler = alquiler;
        this.vigente = vigente;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idcontrato=" + idcontrato + ", fechadeinicio=" + fechadeinicio + ", fechadefin=" + fechadefin + ", alquiler=" + alquiler + ", vigente=" + vigente + ", inquilino=" + inquilino + ", inmueble=" + inmueble + '}';
    }
    
    
}
