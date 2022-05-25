/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Nodo {
   int dato;
    Nodo ramaizquierdo;
    Nodo ramaderecho;

    public Nodo(int dato) {
        this.dato = dato;
        this.ramaderecho = null;
        this.ramaizquierdo = null;
    }

    @Override
    public String toString() {
        return " " + dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public Nodo getHijoizquierdo() {
        return ramaizquierdo;
    }

    public void setHijoizquierdo(Nodo hijoizquierdo) {
        this.ramaizquierdo = hijoizquierdo;
    }

    public Nodo getHijoderecho() {
        return ramaderecho;
    }

    public void setHijoderecho(Nodo hijoderecho) {
        this.ramaderecho = hijoderecho;
    }  
}
