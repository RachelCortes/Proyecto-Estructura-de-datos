
package listadoblecircular;

import listaCircular.PilotosClasificacion;

public class NodoDCResultado {
    private PilotosClasificacion piloto;
    private String escuderia;
    private double tiempoClasificacion;
    private double tiempoCarrera;
    
    
    NodoDCResultado anterior;
    NodoDCResultado siguiente;

    public NodoDCResultado(PilotosClasificacion piloto, String escuderia, double tiempoClasificacion, double tiempoCarrera) {
        this.piloto = piloto;
        this.escuderia = escuderia;
        this.tiempoClasificacion = tiempoClasificacion;
        this.tiempoCarrera = tiempoCarrera;
        
    }

    public PilotosClasificacion getPiloto() {
        return piloto;
    }

    public void setPiloto(PilotosClasificacion piloto) {
        this.piloto = piloto;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public double getTiempoClasificacion() {
        return tiempoClasificacion;
    }

    public void setTiempoClasificacion(double tiempoClasificacion) {
        this.tiempoClasificacion = tiempoClasificacion;
    }

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(double tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public NodoDCResultado getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDCResultado anterior) {
        this.anterior = anterior;
    }

    public NodoDCResultado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDCResultado siguiente) {
        this.siguiente = siguiente;
        
    }


    
    @Override
    public String toString() {
        return "Piloto: " + piloto.getNombre() + ", Escudería: " + escuderia + ", Tiempo Clasificación: "
                + tiempoClasificacion + ", Tiempo Carrera: " + tiempoCarrera;
    }
}
