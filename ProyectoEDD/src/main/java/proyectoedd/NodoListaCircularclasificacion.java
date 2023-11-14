/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd;

/**
 *
 * @author Josh
 */
public class NodoListaCircularclasificacion {
    NodoListaCircularclasificacion siguiente;
    PilotosClasificacion dato;

    public NodoListaCircularclasificacion(PilotosClasificacion dato) {
        this.dato = dato;
    }

    public NodoListaCircularclasificacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircularclasificacion siguiente) {
        this.siguiente = siguiente;
    }

    public PilotosClasificacion getDato() {
        return dato;
    }

    public void setDato(PilotosClasificacion dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
}
