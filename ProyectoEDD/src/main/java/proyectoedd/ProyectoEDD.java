package proyectoedd;

import listasimple.Pilotos;
import listasimple.LSPilotos;
import cola.Equipo;
import cola.Cola;
import pila.Carrera;
import pila.Pila;
import javax.swing.JOptionPane;
import listaCircular.ListaCircularclasificacion;
import listaCircular.PilotosClasificacion;
import listadoblecircular.LDCResultado;
import listadoblecircular.ListaDC;

public class ProyectoEDD {

    public static void main(String[] args) {
        Pila carrera = new Pila();
        Cola equipo = new Cola();
        LSPilotos pilotos = new LSPilotos();
        LSPilotos pilotos2 = new LSPilotos();
        LSPilotos pilotos3 = new LSPilotos();
        LSPilotos pilotos4 = new LSPilotos();
        ListaCircularclasificacion listaCircular = new ListaCircularclasificacion();
        ListaDC listaDC = new ListaDC();
        LDCResultado resultadoCarreraOficial = new LDCResultado();

        carrera.apilar(new Carrera("Qatar", "Bahrein", 1));
        carrera.apilar(new Carrera("Australia", "Albert Park", 2));
        carrera.apilar(new Carrera("USA", "Miami", 3));
        carrera.apilar(new Carrera("Italia", "Imola", 4));
        carrera.apilar(new Carrera("España", "Cataluña", 5));

        pilotos.insertar(new Pilotos("Lewis Hamilton", 38, "Reino Unido", "Titular", 44));
        pilotos.insertar(new Pilotos("Pierre Gasly", 27, "Francia", "Titular", 10));
        pilotos.insertar(new Pilotos("Esteban Ocon", 27, "Francia", "Reserva", 31));
        pilotos.insertar(new Pilotos("Logan Sargeant", 22, "USA", "Reserva", 2));
        pilotos.insertar(new Pilotos("Nyck De Vries", 28, "Países Bajos", "Reserva", 21));

        pilotos2.insertar(new Pilotos("Fernando Alonso", 42, "España", "Titular", 14));
        pilotos2.insertar(new Pilotos("Lando Norris", 23, "Reino Unido", "Titular", 4));
        pilotos2.insertar(new Pilotos("Kevin Magnussen", 31, "Dinamarca", "Reserva", 20));
        pilotos2.insertar(new Pilotos("Guanyu Zhou", 24, "China", "Reserva", 24));
        pilotos2.insertar(new Pilotos("Daniel Ricciardo", 34, "Australia", "Reserva", 3));

        pilotos3.insertar(new Pilotos("Max Verstappen", 26, "Bélgica", "Titular", 1));
        pilotos3.insertar(new Pilotos("Sergio Pérez", 33, "México", "Titular", 11));
        pilotos3.insertar(new Pilotos("Nico Hülkenberg", 36, "Alemania", "Reserva", 27));
        pilotos3.insertar(new Pilotos("George Russell", 25, "Reino Unido", "Reserva", 8));
        pilotos3.insertar(new Pilotos("Lando Norris", 23, "Reino Unido", "Reserva", 5));

        pilotos4.insertar(new Pilotos("Carlos Sainz", 29, "España", "Titular", 55));
        pilotos4.insertar(new Pilotos("Charles Leclerc", 26, "Mónaco", "Titular", 26));
        pilotos4.insertar(new Pilotos("Oscar Piastri", 22, "Australia", "Reserva", 9));
        pilotos4.insertar(new Pilotos("Lance Stroll", 25, "Cánada", "Reserva", 10));
        pilotos4.insertar(new Pilotos("Yuki Tsunoda", 23, "Japón", "Reserva", 22));

        equipo.registrar(new Equipo("Alpine", "Reino Unido"), pilotos);
        equipo.registrar(new Equipo("Haas", "USA"), pilotos2);
        equipo.registrar(new Equipo("Red Bull", "Austria"), pilotos3);
        equipo.registrar(new Equipo("Ferrari", "Italia"), pilotos4);

        listaCircular.insertar(new PilotosClasificacion("Lewis Hamilton", "Alpine", 2.33));
        listaCircular.insertar(new PilotosClasificacion("Carlos Sainz", "Ferrari", 2.20));
        listaCircular.insertar(new PilotosClasificacion("Sergio Perez", "Red Bull", 3.01));
        listaCircular.insertar(new PilotosClasificacion("Fernando Alonso", "Haas", 1.78));
        listaCircular.insertar(new PilotosClasificacion("Pierre Gasly", "Alpine", 4.56));
        listaCircular.insertar(new PilotosClasificacion("Charles Leclerc", "Ferrari", 7.43));
        listaCircular.insertar(new PilotosClasificacion("Max Verstappen", "Red Bull", 1.96));
        listaCircular.insertar(new PilotosClasificacion("Lando Norris", "Haas", 5.43));  
                
        resultadoCarreraOficial.inserta("Lewis Hamilton", "Alpine", 2.33, 1.07);
        resultadoCarreraOficial.inserta("Carlos Sainz", "Ferrari", 2.20, 4.21);
        resultadoCarreraOficial.inserta("Sergio Perez", "Red Bull", 3.01, 1.66);
        resultadoCarreraOficial.inserta("Fernando Alonso", "Haas", 1.78, 3.11);
        resultadoCarreraOficial.inserta("Pierre Gasly", "Alpine", 4.56, 2.23);
        resultadoCarreraOficial.inserta("Charles Leclerc", "Ferrari", 7.43, 5.27);
        resultadoCarreraOficial.inserta("Max Verstappen", "Red Bull", 1.96, 1.24);
        resultadoCarreraOficial.inserta("Lando Norris", "Haas", 5.43, 1.18);
        
        boolean salir = true;

        int opcion = 0;

        while (salir) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a la opción que desee \n"
                    + "1. Carreras \n"
                    + "2. Equipos \n"
                    + "3. Salir"));

            switch (opcion) {
                case 1:
                    boolean salirCarrera = true;
                    while (salirCarrera) {

                        int opcionCarrera = 0;
                        opcionCarrera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a la opción que desee \n"
                                + "1. Ver registro original de Carreras \n"
                                + "2. Ingrese nueva Carrera \n"
                                + "3. Ver carrera según posición \n"
                                + "4. Carreras de clasificación \n"
                                + "5. Carreras Oficiales \n"
                                + "6. Resultados de Carrera Oficial \n"
                                + "7. Salir"));
                        switch (opcionCarrera) {
                            case 1:
                                JOptionPane.showMessageDialog(null, carrera.toString());
                                break;
                            case 2:

                                String pais = JOptionPane.showInputDialog("Ingrese el pais de la carrera \n");
                                String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad de la carrera \n");
                                int idCarrera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un identificador para la carrera \n"));
                                carrera.apilar(new Carrera(pais, ciudad, idCarrera));
                                break;
                            case 3:
                                String paisB = JOptionPane.showInputDialog("Ingrese el pais de la carrera buscar \n");
                                String ciudadB = JOptionPane.showInputDialog("Ingrese la ciudad de la carrera a buscar\n");
                                Object[] resultado = carrera.buscar(paisB, ciudadB);

                                Carrera carrera1 = (Carrera) resultado[0];
                                int posicion = (int) resultado[1];

                                if (carrera1 != null) {
                                    JOptionPane.showMessageDialog(null, "La carrera encontrada es: " + carrera1 + " \n"
                                            + "Se encuentra en la posición: " + posicion);

                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encontró ninguna carrera con ese nombre y ciudad.");
                                }
                            case 4:
                                JOptionPane.showMessageDialog(null,listaCircular.toString());
                                break;
                            case 5:
                                listaCircular.trasladarListaDobleCircular(listaDC);
                                
                                JOptionPane.showMessageDialog(null,listaDC.toString());
                                break;
                            case 6:
                                //System.out.println(resultadoCarreraOficial.toString());
                                JOptionPane.showMessageDialog(null,resultadoCarreraOficial.toString());
                                break;
                            case 7:
                                salir = true;
                                salirCarrera = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                        }
                    }
                    salir = true;
                    break;

                case 2:
                    int opcionEquipo = 0;
                    while (opcionEquipo != 5) {
                        opcionEquipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a la opción que desee \n"
                                + "1. Ver equipos inscritos \n"
                                + "2. Ingrese nuevo equipo \n"
                                + "3. Ver información de equipo \n"
                                + "4. Cambiar pilotos titulares\n"
                                + "5. Salir"));
                        String equipo1 = "Mercedes, Alemania";

                        switch (opcionEquipo) {
                            case 1:
                                JOptionPane.showMessageDialog(null, equipo.toString());
                                System.out.println(equipo.toString());
                                break;

                            case 2:
                                String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a registrar \n");
                                String paisEquipo = JOptionPane.showInputDialog("Ingrese el país del equipo a registrar \n");
                                LSPilotos listaPilotos = new LSPilotos();
                                equipo.registrar(new Equipo(nombreEquipo, paisEquipo), listaPilotos);
                                break;
                            case 3:
                                String NombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a buscar \n");
                                // ...
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Seleccione la lista de pilotos que quiere cambiar a titular y reserva \n"
                                        + "1. Lista 1 de pilotos\n"
                                        + "2. Lista 2 de pilotos\n"
                                        + "3. Lista 3 de pilotos\n"
                                        + "4. Lista 4 de pilotos");
                                int opcionL = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la lista"));
                                LSPilotos lista = null;
                                switch (opcionL) {
                                    case 1:
                                        lista = pilotos;
                                        break;
                                    case 2:
                                        lista = pilotos2;
                                        break;
                                    case 3:
                                        lista = pilotos3;
                                        break;
                                    case 4:
                                        lista = pilotos4;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción de lista inválida.");
                                        break;
                                }
                                if (lista != null) {
                                    int idTitular = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del piloto titular:"));
                                    int idReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del piloto de reserva:"));
                                    pilotos.cambiarTitularPorReserva(lista, idTitular, idReserva);
                                    JOptionPane.showMessageDialog(null, "Cambio realizado con éxito.\n" + lista.toString());
                                }
                                break;

                            case 5:
                                salir = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                                break; // Agregado para evitar la caída a través de los casos
                        }
                    }
                    break;

                case 3:
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");

            }
        }

    }

}
