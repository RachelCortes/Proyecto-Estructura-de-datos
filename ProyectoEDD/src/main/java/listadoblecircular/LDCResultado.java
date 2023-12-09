package listadoblecircular;

import listaCircular.PilotosClasificacion;
import pila.Carrera;

public class LDCResultado {

    NodoDCResultado cabeza;
    NodoDCResultado ultimo;

    public void inserta(String nombre, String escuderia, double tiempoClasificacion, double tiempoCarrera) {
    PilotosClasificacion p = new PilotosClasificacion(nombre, escuderia, tiempoClasificacion);
    NodoDCResultado nuevo = new NodoDCResultado(p, escuderia, tiempoClasificacion, tiempoCarrera);

    if (cabeza == null) {
        cabeza = nuevo;
        ultimo = cabeza;
        cabeza.setAnterior(ultimo);
        cabeza.setSiguiente(ultimo);
        ultimo.setAnterior(cabeza);
        ultimo.setSiguiente(cabeza);
    } else {
        NodoDCResultado auxiliar = cabeza.getSiguiente();

        while (auxiliar != cabeza && auxiliar.getTiempoCarrera() < tiempoCarrera) {
            auxiliar = auxiliar.getSiguiente();
        }
        nuevo.setAnterior(auxiliar.getAnterior());
        nuevo.setSiguiente(auxiliar);

        auxiliar.getAnterior().setSiguiente(nuevo);
        auxiliar.setAnterior(nuevo);

        if (auxiliar == cabeza && nuevo.getTiempoCarrera() < cabeza.getTiempoCarrera()) {
            cabeza = nuevo;
        }

        if (auxiliar == ultimo && nuevo.getTiempoCarrera() > ultimo.getTiempoCarrera()) {
            ultimo = nuevo;
        }
    }
}

  @Override
public String toString() {
    String respuesta = "Carrera Oficial: \n";
    
    if (cabeza != null) {
        NodoDCResultado auxiliar = cabeza;
        int pos = 1;

        do {
            respuesta += pos + " " + auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
            pos++;
        } while (auxiliar != cabeza);
    } else {
        respuesta += "Vacía";
    }

    return respuesta;
}

}
