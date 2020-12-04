/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Socio {
    private long id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String direccion;
    private Penalizacion penalizacion;
    //*private ArrayList <Prestamo> = new ArrayList <Prestamo>();

    /*constructor por defecto*/
    ;

    /*constructor por defecto*/
    
    public Socio() {
    }
    
    /*constructor con todos los atributos*/
    
    public Socio(long id, String nombre, String apellidos, String dni, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.penalizacion = penalizacion;
    }
    
        /*constructor de copia*/
    
        public Socio(Socio soc) {
        this.id = soc.id;
        this.nombre = soc.nombre;
        this.apellidos = soc.apellidos;
        this.dni = soc.dni;
        this.telefono = soc.telefono;
        this.direccion = soc.direccion;
        this.penalizacion = soc.penalizacion;
    }

    /*constructor con los atributos más importantes*/
        
    public Socio(long id, String nombre, String apellidos, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    /*getters y setters de todos los atributos*/
    
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Penalizacion getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(Penalizacion penalizacion) {
        this.penalizacion = penalizacion;
    }
    
   
    
    
    
    
    
    
    
}

