
package listadoblecircular;

import listaCircular.PilotosClasificacion;

public class ListaDC {
    NodoDC cabeza;
    NodoDC ultimo;
    
    public void inserta(PilotosClasificacion nuevoPiloto)
    {
        
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
            
            if(nuevoPiloto.getTiempoClasificacion() < cabeza.getDato().getTiempoClasificacion())
            {
                
                NodoDC auxiliar = new NodoDC(nuevoPiloto);
                auxiliar.setSiguiente(cabeza);
                cabeza.setAnterior(auxiliar); 
                cabeza = auxiliar;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
            }
            else
            {
                
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
                    
                    NodoDC auxiliar = cabeza.getSiguiente();
                    while(auxiliar.getDato().getTiempoClasificacion() < nuevoPiloto.getTiempoClasificacion())
                    {
                        
                        auxiliar = auxiliar.getAnterior();
                    
                    
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
    String respuesta = "Posición de la carrera: \n";


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
