/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Caretaker.Caretaker;
import Memento.Memento;
import Originator.Persona;

/**
 *
 * @author bryan
 */
public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Dana");
        persona.setApellidos("CH");
        persona.setEdad("20");
        persona.setCarrera("Ingenieria de Sistemas");
        persona.setDireccion("Autopista Norte");
        persona.setTelefono("+573134554982");
        
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(persona.saveToMemento());
        System.out.println(persona);       
        
        persona.setNombre("Daniela");
        persona.setEdad("24");
        caretaker.addMemento(persona.saveToMemento());

        Memento memento1 = caretaker.getMemento(0);
        //Memento memento2 = caretaker.getMemento(1);

        System.out.println(memento1.getSavedState());
        //System.out.println(memento2.getSavedState());
    }

}
