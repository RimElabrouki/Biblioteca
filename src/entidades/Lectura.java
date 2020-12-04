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
public class Lectura extends Evento {
    private String libro;
/*constructor por defecto*/
    public Lectura() {
        super();
    }
/*constructor con los atributos de subclase*/
    public Lectura(String libro) {
        this.libro = libro;
    }
/*constructor con todos los atributos de subclase y supclase*/
    public Lectura(String libro, long id, String nombre, Date fechaHora) {
        super(id, nombre, fechaHora);
        this.libro = libro;
    }
/*Un constructor que tenga un objeto del tipo de dato de la superclase, y otros parámetros*/
    public Lectura(String libro, Evento e) {
        super(e);
        this.libro = libro;
    }
/*getters y setters de los atributos de la subclase*/

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }       
}
