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
public class Visionado extends Evento {
    private String pelicula;
    private String aula;
/*constructor por defecto*/
    public Visionado() {
        super();
    }
/*constructor con los atributos de subclase*/
    public Visionado(String pelicula, String aula) {
        this.pelicula = pelicula;
        this.aula = aula;
    }
/*constructor con todos los atributos de subclase y supclase*/
    public Visionado(String pelicula, String aula, long id, String nombre, Date fechaHora) {
        super(id, nombre, fechaHora);
        this.pelicula = pelicula;
        this.aula = aula;
    }
/*Un constructor que tenga un objeto del tipo de dato de la superclase, y otros parámetros*/
    public Visionado(String pelicula, String aula, Evento e) {
        super(e);
        this.pelicula = pelicula;
        this.aula = aula;
    }
/*getters y setters de los atributos de la subclase*/
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }   
}
