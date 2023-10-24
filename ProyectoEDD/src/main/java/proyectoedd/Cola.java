package proyectoedd;

import javax.swing.JOptionPane;

public class Cola {

    private NodoCola frente;
    private NodoCola ultimo;
    private boolean validarOpcion;

    public NodoCola getFrente() {
        return frente;
    }

    public void setFrente(NodoCola frente) {
        this.frente = frente;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }

    public void registrar(Equipo equipo) {
        NodoCola nuevo = new NodoCola(equipo);
        if (!equipoEnLaCola(equipo.getNombreEquipo(),equipo.getPaisEquipo())) {
            if (frente == null) {

                frente = nuevo;
                ultimo = nuevo;
            } else {

                ultimo.setAtras(nuevo);
                ultimo = nuevo;
            }
        } else{
            JOptionPane.showMessageDialog(null,"Equipo ya se encuentra registrado");
        }
       
    }

    public boolean equipoEnLaCola(String nombreEquipo, String pais) {

        boolean respuesta = false;
        
        NodoCola auxiliar = frente;
        
        while(auxiliar != null)
        {
            Equipo equipo = auxiliar.getElemento();
            if(equipo.getNombreEquipo().equals(nombreEquipo) && equipo.getPaisEquipo().equals(pais)) {
                // El equipo fue encontrado en la cola
                respuesta = true;
            }
            
                auxiliar = auxiliar.getAtras();
            
        }
        
        return respuesta;
    }


    public String mostrarEquipo(String nombre) {
        NodoCola auxiliar = frente;
        int posicion = 1;
        while(auxiliar != null){
            Equipo equipo = auxiliar.getElemento();
            if (equipo.getNombreEquipo().equals(nombre)) {
                return JOptionPane.showInputDialog("Nombre: " + equipo.getNombreEquipo() + "\n"
                        + "País: " + equipo.getPaisEquipo() + "\n" 
                        + "Posición en la cola: " + posicion);
                       
            } else {
                auxiliar = auxiliar.getAtras();
                posicion++;
            }
            
            
        }
        return "No se encontró un equipo con ese nombre en la cola.";

    }

//    public String obtenerEquipos(int numero) {
//        NodoCola auxiliar = frente;
//        int contador = 1;
//        while (auxiliar != null) {
//            if (contador == numero) {
//                return auxiliar.getElemento().getEquipo();
//            }
//            auxiliar = auxiliar.getAtras();
//            contador++;
//        }
//        return null;
//    }

    public NodoCola quitar() {
        NodoCola auxiliar = frente;

        if (frente != null) {
            frente = frente.getAtras();
            auxiliar.setAtras(null);
        }
        return auxiliar;
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
    
    public String toString() {
        NodoCola auxiliar = frente;
        String respuesta = "Carreras: \n";
        
        while(auxiliar != null)
        {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getAtras();

        }
        
        return respuesta;
    }
//    public void registrarEquipos() {
//        String equipo1 = "Mercedes, Alemania";
//        String equipo2 = "Alpine, Reino Unido";
//        String equipo3 = "Haas, USA";
//        String equipo4 = "Red Bull, Austria";
//        String equipo5 = "Ferrari, Italia";
//
//        boolean salir = true;
//        String opcion = "";
//        while (salir) {
//            validarOpcion = true;
//            while (validarOpcion) {
//
//                opcion = JOptionPane.showInputDialog("Ingrese el número que corresponde a cada equipo para llenar la cola o seleccione salir \n"
//                        + "1. " + equipo1 + "\n"
//                        + "2. " + equipo2 + "\n"
//                        + "3. " + equipo3 + "\n"
//                        + "4. " + equipo4 + "\n"
//                        + "5. " + equipo5 + "\n"
//                        + "6. Ver información de un equipo específico\n"
//                        + "7. Salir");
//                validarOpciones(opcion);
//
//                switch (opcion) {
//                    case "1":
//                        registrar(equipo1);
//                        break;
//                    case "2":
//                        registrar(equipo2);
//                        break;
//                    case "3":
//                        registrar(equipo3);
//                        break;
//                    case "4":
//                        registrar(equipo4);
//                        break;
//                    case "5":
//                        registrar(equipo5);
//                        break;
//                    case "6":
//                        mostrarEquipo();
//                        break;
//                    case "7":
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
//        JOptionPane.showMessageDialog(null, "Equipos de la formula 1 registrados:\n" + imprimirCola());
//
//    }

}
