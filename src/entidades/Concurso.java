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
public class Concurso extends Evento{
    private String tipo;
    private String premio;
/*constructor por defecto*/
    public Concurso() {
        super();
    }
/*constructor con los atributos de subclase*/
    public Concurso(String tipo, String premio) {
        this.tipo = tipo;
        this.premio = premio;
    }
/*constructor con todos los atributos de subclase y supclase*/
    public Concurso(String tipo, String premio, long id, String nombre, Date fechaHora) {
        super(id, nombre, fechaHora);
        this.tipo = tipo;
        this.premio = premio;
    }
/*Un constructor que tenga un objeto del tipo de dato de la superclase, y otros parámetros*/
    public Concurso(String tipo, String premio, Evento e) {
        super(e);
        this.tipo = tipo;
        this.premio = premio;
    }
/*getters y setters de los atributos de la subclase*/
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
    
}
