
package proyectoedd;

public class NodoCola {
    private NodoCola atras;
    private Equipo elemento;

    public NodoCola(Equipo elemento) {
        this.elemento = elemento;
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
    
    @Override
    public String toString() {
        return this.elemento.toString();
    }
    
}
