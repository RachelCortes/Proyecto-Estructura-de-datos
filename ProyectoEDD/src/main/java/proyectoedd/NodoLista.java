
package proyectoedd;


public class NodoLista {
    private Pilotos dato;
    private NodoLista siguiente;

    public NodoLista(Pilotos dato) {
        this.dato = dato;
    }

    public Pilotos getDato() {
        return dato;
    }

    public void setDato(Pilotos dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    public Pilotos buscarPorId(int id) {
        NodoLista auxiliar = this;
        while (auxiliar != null) {
            if (auxiliar.getDato().getId() == id) {
                return auxiliar.getDato();
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return null;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
}
