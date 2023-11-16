
package cola;

import listasimple.LSPilotos;

public class NodoCola {
    private NodoCola atras;
    private Equipo elemento;
    private LSPilotos lista;
    public NodoCola(Equipo elemento, LSPilotos lista) {
        this.elemento = elemento;
        this.lista = lista;
        
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

    public Equipo getElemento() {
        return elemento;
    }

    public void setElemento(Equipo elemento) {
        this.elemento = elemento;
    }

    public LSPilotos getLista() {
        return lista;
    }

    public void setLista(LSPilotos lista) {
        this.lista = lista;
    }
    
    
    @Override
    public String toString() {
        return "Equipo: " + elemento.getNombreEquipo() + " - Pilotos: " + lista.toString();
    }
    
}
