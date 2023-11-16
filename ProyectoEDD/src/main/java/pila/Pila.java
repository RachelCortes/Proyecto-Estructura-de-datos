package pila;

import pila.NodoPila;
import javax.swing.JOptionPane;

public class Pila {

    public NodoPila cima;
    private boolean validarOpcion;
    private int contadorIdCarrera;
    
    public NodoPila getCima() {
        return cima;
    }

    public void setCima(NodoPila cima) {
        this.cima = cima;
    }

    public Pila() {
        this.cima = null;
    }

    public boolean estaVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar(Carrera carrera) {
        
        if (!existe(carrera.getPais(), carrera.getCiudad())) {
            if (estaVacia()) {
                carrera.setIdCarrera(contadorIdCarrera++);
                cima = new NodoPila(carrera);
            } else {
                carrera.setIdCarrera(contadorIdCarrera++);
                NodoPila auxiliar = new NodoPila(carrera);
                auxiliar.setSiguiente(cima);
                cima = auxiliar;
            }
        } else {
            JOptionPane.showMessageDialog(null, "La carrera ya está en la pila");
        }
    }
    
    public boolean existe(String pais, String ciudad)
    {
        boolean respuesta = false;
        
        NodoPila auxiliar = cima;
        
        while(auxiliar != null)
        {
            if(auxiliar.getElemento().getPais().equals(pais) &&  auxiliar.getElemento().getCiudad().equals(ciudad))
            {
                respuesta = true;
                break;
            }
            else
            {
                auxiliar = auxiliar.getSiguiente();
            }
        }
        
        return respuesta;
    }
    public Object[] buscar(String pais, String ciudad) {
        return buscar(cima, pais, ciudad,1);
    }
    private Object[] buscar(NodoPila nodoActual, String pais,String ciudad, int posicion) {
    if (nodoActual == null) {
        return new Object[]{null, -1}; // La carrera no se encontró en la lista
    }
        Carrera carrera = nodoActual.getElemento();
    if (carrera.getPais().equals(pais) && carrera.getCiudad().equals(ciudad)) {
        return new Object[]{carrera, posicion}; // La carrera fue encontrada en esta posición
    }
    
        return buscar(nodoActual.getSiguiente(), pais, ciudad, posicion + 1);
}


    public void desapilar() {
        if (estaVacia()) {
            System.out.println("No se puede extraer nigún elemento porque esta vacía");
        } else {
            cima = cima.getSiguiente();
        }
    }


    @Override
    public String toString() {
        NodoPila auxiliar = cima;
        String respuesta = "Carreras: \n";
        
        while(auxiliar != null)
        {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
        }
        
        return respuesta;
    }

}




