package proyectoedd;

import javax.swing.JOptionPane;

public class Pila {

    public NodoPila cima;
    private boolean validarOpcion;

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
                cima = new NodoPila(carrera);
            } else {
                
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


    public boolean validarOpciones(String Opcion) {
        if (Opcion.matches("[0-9]*")) {
            validarOpcion = false;
        } else {
            JOptionPane.showMessageDialog(null, "Digite un número para poder ingresar al menú.");
            validarOpcion = true;
        }
        return validarOpcion;
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



//    public boolean buscar(NodoPila posicion) {
//            boolean respuesta = false;
//        
//            NodoPila auxiliar = cima;
//            if (auxiliar == null) {
//                return false;
//            } else if (auxiliar == posicion) {
//                return true;
//            } else {
//                return buscar(auxiliar.getSiguiente());
//            }
//        }
    
    
//    public boolean carreraEnLaPila(String carrera) {
//
//        NodoPila actual = cima;
//        while (actual != null) {
//            if (actual.getElemento().getCarrera().equals(carrera)) {
//                return true;
//            }
//            actual = actual.getSiguiente();
//        }
//        return false;
//    }

//    public void llenarCarreras() {
//        String carrera1 = "Qatar, Bahrein";
//        String carrera2 = "Australia, Albert Park";
//        String carrera3 = "USA, Miami";
//        String carrera4 = "Italia, Imola";
//        String carrera5 = "España, Cataluña";
//
//        JOptionPane.showMessageDialog(null, "Carreras Disponibles:\n"
//                + carrera1 + "\n"
//                + carrera2 + "\n"
//                + carrera3 + "\n"
//                + carrera4 + "\n"
//                + carrera5);
//        boolean salir = true;
//        String opcion = "";
//        while (salir) {
//            validarOpcion = true;
//            while (validarOpcion) {
//
//                opcion = JOptionPane.showInputDialog("Ingrese el número que corresponde a cada carrera para llenar la pila o seleccione salir \n"
//                        + "1. " + carrera1 + "\n"
//                        + "2. " + carrera2 + "\n"
//                        + "3. " + carrera3 + "\n"
//                        + "4. " + carrera4 + "\n"
//                        + "5. " + carrera5 + "\n"
//                        + "6. Ingresar nuevas carreras\n"
//                        + "7. Mostrar orden original de las carreras\n"
//                        + "8. Salir");
//                validarOpciones(opcion);
//
//                switch (opcion) {
//                    case "1":
//                        apilar(carrera1);
//                        break;
//                    case "2":
//                        apilar(carrera2);
//                        break;
//                    case "3":
//                        apilar(carrera3);
//                        break;
//                    case "4":
//                        apilar(carrera4);
//                        break;
//                    case "5":
//                        apilar(carrera5);
//                        break;
//                    case "6":
//                        ingresarNuevaCarrera();
//                        break;
//                    case "7":
//                        mostrrarOrdenDeCarreras();
//                        break;
//                    case "8":
//                        salir = false;
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
//
//                }
//
//            }
//
//        }
//        JOptionPane.showMessageDialog(null, "Orden de carreras:\n" + imprimirPila());
//
//    }


//    public void mostrrarOrdenDeCarreras() {
//        String original = "Orden original de carreras: \n";
//        NodoPila actual = cima;
//        int contador = 1;
//        while (actual != null) {
//            original += " Carrera número " + contador + " " + actual.getElemento().getCarrera() + "\n";
//            actual = actual.getSiguiente();
//            contador++;
//        }
//        JOptionPane.showMessageDialog(null, original);
//    }
