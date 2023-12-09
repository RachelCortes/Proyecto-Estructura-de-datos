
package arbol;

import listasimple.Pilotos;

public class NodoArbol {
    int id;
    int posicion;
    NodoArbol hijoIzq;
    NodoArbol hijoDer;
    Pilotos piloto;

    public Pilotos getPiloto() {
        return piloto;
    }

    public void setPiloto(Pilotos piloto) {
        this.piloto = piloto;
    }

    public NodoArbol(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
