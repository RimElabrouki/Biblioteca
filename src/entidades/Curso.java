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
public class Curso extends Evento {
    private int duracion;
    private String aula;
    
/*constructor por defecto*/
    public Curso() {
        super();
    }
/*constructor con los atributos de subclase*/
    public Curso(int duracion, String aula) {
        this.duracion = duracion;
        this.aula = aula;
    }
 /*constructor con todos los atributos de subclase y supclase*/
    public Curso(int duracion, String aula, long id, String nombre, Date fechaHora) {
        super(id, nombre, fechaHora);
        this.duracion = duracion;
        this.aula = aula;
    }
/*Un constructor que tenga un objeto del tipo de dato de la superclase, y otros parámetros*/
    public Curso(int duracion, String aula, Evento e) {
        super(e);
        this.duracion = duracion;
        this.aula = aula;
    }
/*getters y setters de los atributos de la subclase*/

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
       
}
