package proyectoedd;

import arbol.Arbol;
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
        ListaCircularclasificacion clasificacion1 = new ListaCircularclasificacion();
        ListaCircularclasificacion clasificacion2 = new ListaCircularclasificacion();
        ListaCircularclasificacion clasificacion3 = new ListaCircularclasificacion();
        ListaDC listaDC = new ListaDC();
        LDCResultado carreraOficial1 = new LDCResultado();
        LDCResultado carreraOficial2 = new LDCResultado();
        LDCResultado carreraOficial3 = new LDCResultado();

        Arbol arbolCarrera1 = new Arbol();
        Arbol arbolCarrera2 = new Arbol();
        Arbol arbolCarrera3 = new Arbol();

        carrera.apilar(new Carrera("Qatar", "Bahrein", 1));
        carrera.apilar(new Carrera("Australia", "Albert Park", 2));
        carrera.apilar(new Carrera("USA", "Miami", 3));

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

        clasificacion1.insertar(new PilotosClasificacion("Lewis Hamilton", "Alpine", 2.33));
        clasificacion1.insertar(new PilotosClasificacion("Carlos Sainz", "Ferrari", 2.20));
        clasificacion1.insertar(new PilotosClasificacion("Sergio Perez", "Red Bull", 3.01));
        clasificacion1.insertar(new PilotosClasificacion("Fernando Alonso", "Haas", 1.78));
        clasificacion1.insertar(new PilotosClasificacion("Pierre Gasly", "Alpine", 4.56));
        clasificacion1.insertar(new PilotosClasificacion("Charles Leclerc", "Ferrari", 7.43));
        clasificacion1.insertar(new PilotosClasificacion("Max Verstappen", "Red Bull", 1.96));
        clasificacion1.insertar(new PilotosClasificacion("Lando Norris", "Haas", 5.43));

        clasificacion2.insertar(new PilotosClasificacion("Lewis Hamilton", "Alpine", 2.22));
        clasificacion2.insertar(new PilotosClasificacion("Carlos Sainz", "Ferrari", 2.77));
        clasificacion2.insertar(new PilotosClasificacion("Sergio Perez", "Red Bull", 3.25));
        clasificacion2.insertar(new PilotosClasificacion("Fernando Alonso", "Haas", 1.85));
        clasificacion2.insertar(new PilotosClasificacion("Pierre Gasly", "Alpine", 3.21));
        clasificacion2.insertar(new PilotosClasificacion("Charles Leclerc", "Ferrari", 6.45));
        clasificacion2.insertar(new PilotosClasificacion("Max Verstappen", "Red Bull", 1.22));
        clasificacion2.insertar(new PilotosClasificacion("Lando Norris", "Haas", 5.33));

        clasificacion3.insertar(new PilotosClasificacion("Lewis Hamilton", "Alpine", 1.45));
        clasificacion3.insertar(new PilotosClasificacion("Carlos Sainz", "Ferrari", 2.23));
        clasificacion3.insertar(new PilotosClasificacion("Sergio Perez", "Red Bull", 3.10));
        clasificacion3.insertar(new PilotosClasificacion("Fernando Alonso", "Haas", 1.87));
        clasificacion3.insertar(new PilotosClasificacion("Pierre Gasly", "Alpine", 6.65));
        clasificacion3.insertar(new PilotosClasificacion("Charles Leclerc", "Ferrari", 3.66));
        clasificacion3.insertar(new PilotosClasificacion("Max Verstappen", "Red Bull", 4.28));
        clasificacion3.insertar(new PilotosClasificacion("Lando Norris", "Haas", 2.33));

        carreraOficial1.inserta("Lewis Hamilton", "Alpine", 2.33, 1.04);//1
        carreraOficial1.inserta("Carlos Sainz", "Ferrari", 2.20, 4.12);//7
        carreraOficial1.inserta("Sergio Perez", "Red Bull", 3.01, 1.60);//3
        carreraOficial1.inserta("Fernando Alonso", "Haas", 1.78, 2.11);//4
        carreraOficial1.inserta("Pierre Gasly", "Alpine", 4.56, 3.23);//6
        carreraOficial1.inserta("Charles Leclerc", "Ferrari", 7.43, 2.27);//5
        carreraOficial1.inserta("Max Verstappen", "Red Bull", 1.22, 1.24);//2
        carreraOficial1.inserta("Lando Norris", "Haas", 5.33, 5.18);//7

        carreraOficial2.inserta("Lewis Hamilton", "Alpine", 1.45, 2.07);//1
        carreraOficial2.inserta("Carlos Sainz", "Ferrari", 2.23, 4.38);//6
        carreraOficial2.inserta("Sergio Perez", "Red Bull", 3.10, 3.79);//5
        carreraOficial2.inserta("Fernando Alonso", "Haas", 1.87, 3.17);//3
        carreraOficial2.inserta("Pierre Gasly", "Alpine", 6.65, 2.23);//2
        carreraOficial2.inserta("Charles Leclerc", "Ferrari", 3.66, 5.74);//8
        carreraOficial2.inserta("Max Verstappen", "Red Bull", 4.28, 4.45);//7
        carreraOficial2.inserta("Lando Norris", "Haas", 2.33, 3.69);//4

        carreraOficial3.inserta("Lewis Hamilton", "Alpine", 1.45, 1.07);//1
        carreraOficial3.inserta("Carlos Sainz", "Ferrari", 2.23, 4.21);//7
        carreraOficial3.inserta("Sergio Perez", "Red Bull", 3.10, 1.66);//4
        carreraOficial3.inserta("Fernando Alonso", "Haas", 1.87, 3.11);//6
        carreraOficial3.inserta("Pierre Gasly", "Alpine", 6.65, 2.23);//5
        carreraOficial3.inserta("Charles Leclerc", "Ferrari", 3.66, 5.27);//8
        carreraOficial3.inserta("Max Verstappen", "Red Bull", 1.96, 1.24);//3
        carreraOficial3.inserta("Lando Norris", "Haas", 4.28, 1.18);//2

        arbolCarrera1.inserta(44, 1);
        arbolCarrera1.inserta(55, 7);
        arbolCarrera1.inserta(11, 3);
        arbolCarrera1.inserta(14, 4);
        arbolCarrera1.inserta(10, 6);
        arbolCarrera1.inserta(26, 5);
        arbolCarrera1.inserta(1, 2);
        arbolCarrera1.inserta(4, 7);
        
        

        arbolCarrera2.inserta(44,1);
        arbolCarrera2.inserta(55, 6);
        arbolCarrera2.inserta(11, 5);
        arbolCarrera2.inserta(14, 3);
        arbolCarrera2.inserta(10,2 );
        arbolCarrera1.inserta(26, 8);
        arbolCarrera2.inserta(1, 7);
        arbolCarrera1.inserta(4, 4);

        arbolCarrera3.inserta(44, 1);
        arbolCarrera3.inserta(55, 7);
        arbolCarrera3.inserta(11, 4);
        arbolCarrera3.inserta(14, 6);
        arbolCarrera3.inserta(10, 5);
        arbolCarrera1.inserta(26, 8);
        arbolCarrera3.inserta(1, 3);
        arbolCarrera3.inserta(4, 2);
        
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
                                + "7. Posiciones de carreras \n"
                                + "8. Salir"));
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
                                int posicionBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición de la carrera a buscar:"));
                                Carrera carreraPosicion = carrera.buscarPorPosicion(posicionBuscar);

                                if (carreraPosicion != null) {
                                    JOptionPane.showMessageDialog(null, "La carrera encontrada es: " + carreraPosicion + " \n"
                                            + "Se encuentra en la posición: " + posicionBuscar);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encontró ninguna carrera en la posición indicada.");
                                }
                                break;

                            case 4:
                                JOptionPane.showMessageDialog(null, clasificacion1.toString());
                                JOptionPane.showMessageDialog(null, clasificacion2.toString());
                                JOptionPane.showMessageDialog(null, clasificacion3.toString());
                                break;
                            case 5:
                                clasificacion1.trasladarListaDobleCircular(listaDC);
                                clasificacion2.trasladarListaDobleCircular(listaDC);
                                clasificacion3.trasladarListaDobleCircular(listaDC);
                                JOptionPane.showMessageDialog(null, "Clasificación 1:\n" + clasificacion1.toString());
                                JOptionPane.showMessageDialog(null, "Clasificación 2:\n" + clasificacion2.toString());
                                JOptionPane.showMessageDialog(null, "Clasificación 3:\n" + clasificacion3.toString());

                                break;
                            case 6:
                                //System.out.println(resultadoCarreraOficial.toString());
                                JOptionPane.showMessageDialog(null, carreraOficial1.toString());
                                JOptionPane.showMessageDialog(null, carreraOficial2.toString());
                                JOptionPane.showMessageDialog(null, carreraOficial3.toString());
                                break;
                            case 7:
                                StringBuilder mensajeArboles = new StringBuilder();
                                
                                arbolCarrera1.preorden();
                                
                                arbolCarrera2.preorden();
                               
                                arbolCarrera3.preorden();
                                
                                JOptionPane.showMessageDialog(null, mensajeArboles.toString());
                                break;
                            case 8:
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
                        //String equipo1 = "Mercedes, Alemania";

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
                                //String NombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a buscar \n");

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
