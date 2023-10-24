

package proyectoedd;

import javax.swing.JOptionPane;

public class ProyectoEDD {

    public static void main(String[] args) 
    {
        Pila carrera = new Pila();
        Cola equipo = new Cola();
        
        carrera.apilar(new Carrera("Qatar", "Bahrein"));
        carrera.apilar(new Carrera("Australia", "Albert Park"));
        carrera.apilar(new Carrera("USA", "Miami"));
        carrera.apilar(new Carrera("Italia", "Imola"));
        carrera.apilar(new Carrera("España", "Cataluña"));
        equipo.registrar(new Equipo("Alpine","Reino Unido"));
        equipo.registrar(new Equipo("Haas", "USA"));
        equipo.registrar(new Equipo("Red Bull", "Austria"));
        equipo.registrar(new Equipo("Ferrari", "Italia"));

       

        boolean salir = true;
        boolean salirCarrera = true;

        int opcion = 0;
        int opcionEquipo = 0;

        while (salir) 
        {
            

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a la opción que desee \n"
                    + "1. Carreras \n"
                    + "2. Equipos \n"
                    + "3. Salir"));

            switch (opcion) 
            {
                case 1:
                    

                    while (salirCarrera)
                    {
                        int opcionCarrera = 0;
                        opcionCarrera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a la opción que desee \n"
                        + "1. Ver registro original de Carreras \n"
                        + "2. Ingrese nueva Carrera \n"
                        + "3. Ver carrera según posición \n"
                        + "4. Salir"));
                        switch (opcionCarrera) 
                        {
                            case 1:  JOptionPane.showMessageDialog(null,carrera.toString()); break;
                            case 2: 

                                String pais = JOptionPane.showInputDialog("Ingrese el pais de la carrera \n");
                                String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad de la carrera \n");
                                carrera.apilar(new Carrera(pais, ciudad));
                                break;
                            case 3: 
                                String paisB = JOptionPane.showInputDialog("Ingrese el pais de la carreraa buscar \n");
                                String ciudadB = JOptionPane.showInputDialog("Ingrese la ciudad de la carrera a buscar\n");
                                Object[] resultado = carrera.buscar(paisB,ciudadB);

                                Carrera carrera1 = (Carrera) resultado[0];
                                int posicion = (int) resultado[1];

                                if (carrera1 != null) {
                                     JOptionPane.showMessageDialog(null,"La carrera encontrada es: " + carrera1 + " \n"
                                     + "Se encuentra en la posición: " + posicion);

                                } else {
                                     JOptionPane.showMessageDialog(null,"No se encontró ninguna carrera con ese nombre y ciudad.");
                                }
                            case 4: 
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
                    while (opcionEquipo != 4)
                    {
                        opcionEquipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a la opción que desee \n"
                        + "1. Ver equipos inscritos \n"
                        + "2. Ingrese nuevo equipo \n"
                        + "3. Ver información de equipo \n"
                        + "4. Salir"));
                        String equipo1 = "Mercedes, Alemania";


                        switch (opcionEquipo) {
                            case 1:  JOptionPane.showMessageDialog(null,equipo.toString());System.out.println(equipo.toString()); break;
                                
                            case 2: 

                                String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a registrar \n");
                                String paisEquipo = JOptionPane.showInputDialog("Ingrese el pais del equipo a registrar \n");
                                equipo.registrar(new Equipo(nombreEquipo, paisEquipo));
                                break;
                            case 3: 
                                String NombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a buscar \n");
    //                                String PaisEquipo = JOptionPane.showInputDialog("Ingrese el pais del equipo a buscar\n");

                                String equipoEncontrado = equipo.mostrarEquipo(NombreEquipo);

                                if (equipoEncontrado != null) {
                                     JOptionPane.showMessageDialog(null, equipoEncontrado);
                                } else {
                                    JOptionPane.showMessageDialog(null,"El equipo no se encontró en la cola.");
                                }

                            case 4: 
                                salir = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                        }
                    }  
                    salir = true;
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


   