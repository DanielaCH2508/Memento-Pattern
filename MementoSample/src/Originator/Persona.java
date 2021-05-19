/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Originator;

import Memento.Memento;

/**
 *
 * @author bryan
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String carrera;
    private String direccion;
    private String telefono;

    public Memento saveToMemento() {
        System.out.println("\nOriginator: Guardando memento...");
        return new Memento(this);
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

    public String getEdad() {
        return String.valueOf(edad);
    }

    public void setEdad(String edad) {
        this.edad = Integer.valueOf(edad);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n Datos de persona:" + "\n -Nombre: " + nombre + "\n -Apellidos: " + apellidos
                + "\n -Edad: " + edad + "\n -Carrera: " + carrera 
                +  "\n -Telefono: " + telefono + "\n -Direccion: " + direccion +' ';
    }
    
//    public void restoreFromMemento(Memento m) {
//        nombre = m.getSavedState();
//    }

}
