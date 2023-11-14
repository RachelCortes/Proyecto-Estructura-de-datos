/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd;

/**
 *
 * @author Rachel
 */
public class ListaDC {
    NodoDC cabeza;
    NodoDC ultimo;
    
    public void inserta(PilotosClasificacion nuevoPiloto)
    {
        //1. La lista está vacía
        if(cabeza == null)
        {
            cabeza = new NodoDC(nuevoPiloto);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setAnterior(cabeza);
            ultimo.setSiguiente(cabeza);
        }
        else
        {
            //2. La persona a insertar tiene un id menor al que
            //referencia la cabeza (el primero y menor de la lista), por
            //lo que se debe insertar a la izquierda de la cabeza.
            if(nuevoPiloto.getTiempoClasificacion() < cabeza.getDato().getTiempoClasificacion())
            {
                //Aquí vamos a insertar a la izquierda de la cabeza, es decir al inicio de la lista
                NodoDC auxiliar = new NodoDC(nuevoPiloto);
                auxiliar.setSiguiente(cabeza);//La cabeza actual, se convierte en el segundo elemento
                cabeza.setAnterior(auxiliar); //La cabeza actual, tiene como anterior al nuevo no insertado
                cabeza = auxiliar; //En este caso el auxiliar pasa a ser la cabeza
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
            }
            else
            {
                //3. Si es mayor que el último, vamos directamente a
                //insertarlo al final (este contiene el #3 de la versión
                if(nuevoPiloto.getTiempoClasificacion() > ultimo.getDato().getTiempoClasificacion())
                {
                    NodoDC auxiliar = new NodoDC(nuevoPiloto);
                    auxiliar.setAnterior(ultimo);
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                }
                else
                {
                    //4. Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio de la lista.
                    NodoDC auxiliar = cabeza.getSiguiente();
                    while(auxiliar.getDato().getTiempoClasificacion() < nuevoPiloto.getTiempoClasificacion())
                    {
                        //Siempre y cuando el nodo que estamos recorriendo sea menor al id del nuevo
                        //vamos a mantener el recorrido
                        //De lo contrario el recorrido se acaba
                        auxiliar = auxiliar.getAnterior();
                    
                    //Aquí hacemos la inserción de los datos
                    NodoDC otroAuxiliar = new NodoDC(nuevoPiloto);
                    otroAuxiliar.setAnterior(auxiliar.getAnterior());
                    otroAuxiliar.setSiguiente(auxiliar);
                    auxiliar.setAnterior(otroAuxiliar);
                    otroAuxiliar.getAnterior().setSiguiente(otroAuxiliar);
                }
            }
        }
    }

}

    @Override
    public String toString() {
    String respuesta = "Lista doble circular: \n";


            if(cabeza != null)
            {
                NodoDC auxiliar = cabeza;

                respuesta += auxiliar.toString() + "\n";

                auxiliar = auxiliar.getSiguiente();

                while(auxiliar != cabeza)
                {
                    respuesta += auxiliar.toString() + "\n";
                    auxiliar = auxiliar.getSiguiente();
                }
            }
            else
            {
                respuesta += "Vacía";
            }

            return respuesta;
    }
}
