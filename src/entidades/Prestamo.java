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
public class Prestamo {
    
    private long id;
    private Date fecha_inicio;
    private Date fecha_devolucion;
    private String devolucion;
    private Estado estado;
    

    public Prestamo() {
    }

    public Prestamo(long id, Date fecha_inicio, Date fecha_devolucion, String devolucion) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
        this.devolucion = devolucion;
        this.estado = estado;
    }
    
        public Prestamo(Prestamo pres) {
        this.id = pres.id;
        this.fecha_inicio = pres.fecha_inicio;
        this.fecha_devolucion = pres.fecha_devolucion;
        this.devolucion = pres.devolucion;
        this.estado = pres.estado;
    }

    public Prestamo(long id, Date fecha_inicio, Date fecha_devolucion) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
    }

    public long getId() {
        return id;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public String getDevolucion() {
        return devolucion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    
    
    
    
    
    
    
    
    
    
}
