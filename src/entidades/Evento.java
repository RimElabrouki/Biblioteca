/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Rim
 */
public class Evento {
    
    protected long id;
    protected String nombre;
    protected Date fechaHora;
    
    /*constructor por defecto*/
    public Evento() {
    }
    /*constructor con todos los atributos*/
    public Evento(long id, String nombre, Date fechaHora) {
        this.id = id;
        this.nombre = nombre;
        this.fechaHora = fechaHora;
    }
    /*constructor de copia que tenga como primer parámetro un objeto del tipo de dato de la superclase*/
    public Evento(Evento e){
        this.id = e.id;
        this.nombre = e.nombre;
        this.fechaHora = e.fechaHora;
    }
    /* los getters y setters */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
