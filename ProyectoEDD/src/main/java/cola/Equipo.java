
package cola;

import listasimple.LSPilotos;

public class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private LSPilotos lista;

    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.lista = new LSPilotos();
    }

    

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPaisEquipo() {
        return paisEquipo;
    }

    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }

    public LSPilotos getLista() {
        return lista;
    }

    public void setLista(LSPilotos lista) {
        this.lista = lista;
    }
    
    
@Override
    public String toString() {
        return "Nombre del Equipo: " + this.nombreEquipo + " - Pais origen: " + this.paisEquipo + "Pilotos: " + this.lista;
    }
    
}
