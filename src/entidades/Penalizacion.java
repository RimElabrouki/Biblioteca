/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Penalizacion {
    
    private long id;
    private String motivo;
    private Date fecha;

    public Penalizacion() {
    }

    public Penalizacion(long id, String motivo, Date fecha) {
        this.id = id;
        this.motivo = motivo;
        this.fecha = fecha;
    }
    
        public Penalizacion(Penalizacion p) {
        this.id = p.id;
        this.motivo = p.motivo;
        this.fecha = p.fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
