
package pila;

public class NodoPila {
    private Carrera elemento;
    private NodoPila siguiente;

    public NodoPila(Carrera elemento) {
        this.elemento = elemento;
    }
    
    
    public Carrera getElemento() {
        return elemento;
    }

    public void setElemento(Carrera elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString() {
        return this.elemento.toString();
    }
}
