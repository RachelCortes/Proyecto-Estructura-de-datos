
package listaCircular;

public class PilotosClasificacion {
    String nombre, equipo;
    double tiempoClasificacion;

    public PilotosClasificacion(String nombre, String equipo, double tiempoClasificacion) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.tiempoClasificacion = tiempoClasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getTiempoClasificacion() {
        return tiempoClasificacion;
    }

    public void setTiempoClasificacion(double tiempoClasificacion) {
        this.tiempoClasificacion = tiempoClasificacion;
    }

    @Override
    public String toString() {
        return " - Piloto: " + this.nombre + " - Equipo: " + this.equipo + " - Tiempo: " + this.tiempoClasificacion;
    }
    
}
