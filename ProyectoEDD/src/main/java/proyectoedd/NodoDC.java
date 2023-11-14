/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd;

/**
 *
 * @author Rachel
 */
public class NodoDC {
    PilotosClasificacion dato;
    NodoDC anterior;
    NodoDC siguiente;

    public NodoDC(PilotosClasificacion nuevoPiloto) {
        this.dato = nuevoPiloto;
    }

    public PilotosClasificacion getDato() {
        return dato;
    }

    public void setDato(PilotosClasificacion dato) {
        this.dato = dato;
    }

    public NodoDC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDC anterior) {
        this.anterior = anterior;
    }

    public NodoDC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDC siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
}
