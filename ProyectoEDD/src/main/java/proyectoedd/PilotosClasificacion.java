/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd;

/**
 *
 * @author Josh
 */
public class PilotosClasificacion {
    String nombre, equipo;
    int tiempoClasificacion;

    public PilotosClasificacion(String nombre, String equipo, int tiempoClasificacion) {
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

    public int getTiempoClasificacion() {
        return tiempoClasificacion;
    }

    public void setTiempoClasificacion(int tiempoClasificacion) {
        this.tiempoClasificacion = tiempoClasificacion;
    }

    @Override
    public String toString() {
        return " - Piloto: " + this.nombre + " - Equipo: " + this.equipo + " - Tiempo: " + this.tiempoClasificacion;
    }
    
}
