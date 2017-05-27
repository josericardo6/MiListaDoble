/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joser
 */
public class NodoDoble {
    
    private NodoDoble siguiente;
    private NodoDoble ante;
    private String dato;

    public NodoDoble(String dato) {
        this.dato = dato;
    }

    public NodoDoble getSig() {
        return siguiente;
    }

    public void setSig(NodoDoble sig) {
        this.siguiente = sig;
    }

    public NodoDoble getAnte() {
        return ante;
    }

    public void setAnte(NodoDoble ante) {
        this.ante = ante;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
}
