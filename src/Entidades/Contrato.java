/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
/**
 *
 * @author ignac
 */
public class Contrato {
    
    private int idcontrato;
    private LocalDate fechadeinicio;
    private LocalDate fechadefin;
    private int alquiler;
    private boolean vigente;
    private Inquilino inquilino;
    private Inmuebles inmueble;

    public Contrato() {
    }

    public Contrato(LocalDate fechadeinicio, LocalDate fechadefin, int alquiler, boolean vigente, Inquilino inquilino, Inmuebles inmueble) {
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.alquiler = alquiler;
        this.vigente = vigente;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
    }

    public Contrato(int idcontrato, LocalDate fechadeinicio, LocalDate fechadefin, int alquiler, boolean vigente, Inquilino inquilino, Inmuebles inmueble) {
        this.idcontrato = idcontrato;
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.alquiler = alquiler;
        this.vigente = vigente;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
    }

    public int getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(int idcontrato) {
        this.idcontrato = idcontrato;
    }

    public LocalDate getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(LocalDate fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public LocalDate getFechadefin() {
        return fechadefin;
    }

    public void setFechadefin(LocalDate fechadefin) {
        this.fechadefin = fechadefin;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public boolean getVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Inmuebles getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmuebles inmueble) {
        this.inmueble = inmueble;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idcontrato=" + idcontrato + ", fechadeinicio=" + fechadeinicio + ", fechadefin=" + fechadefin + ", alquiler=" + alquiler + ", vigente=" + vigente + ", inquilino=" + inquilino + ", inmueble=" + inmueble + '}';
    }

}
