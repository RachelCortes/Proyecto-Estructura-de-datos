
package listasimple;

public class LSPilotos {
    NodoLista cabeza;
    
    public void insertar(Pilotos p)
    {
        
        if(cabeza == null) 
        {
            
            cabeza = new NodoLista(p);
        }
        else
        {
            
            if(p.getId()< cabeza.getDato().getId())
            {
                
                NodoLista auxiliar = new NodoLista(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            }
            else
            {
                
                if(cabeza.getSiguiente() == null)
                {
                    NodoLista nuevo = new NodoLista(p);
                    
                    cabeza.setSiguiente(nuevo);
                }
                else
                {
                    
                    NodoLista auxiliar = cabeza;
                    while(auxiliar.getSiguiente() != null && 
                          auxiliar.getSiguiente().getDato().getId() < p.getId())
                    {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    
                    NodoLista otroAuxiliar = new NodoLista(p); 
                                                         
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }
    
    public boolean existe(int id)
    {
        boolean respuesta = false;
        
        NodoLista auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getId() == id)
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
    
    
    public void elimina(int id)
    {
        NodoLista auxiliar = cabeza;
        NodoLista anterior = null;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getId() == id)
            {
                
                if(auxiliar == cabeza)
                {
                    cabeza = cabeza.getSiguiente();
                    auxiliar.setSiguiente(null);
                    break;
                }
                else
                {
                    anterior.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(null);
                    break;
                }
            }
            else
            {
                
                anterior = auxiliar;
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

    
    public void cambiarTitularPorReserva(LSPilotos lista, int idTitular, int idReserva) {
    Pilotos titular = lista.cabeza.buscarPorId(idTitular);
    Pilotos reserva = lista.cabeza.buscarPorId(idReserva);

    
    if (titular != null && reserva != null) {
        
        if (titular.getTitularOReserva().equalsIgnoreCase("Titular")) {
            
            titular.setTitularOReserva("Reserva");

            reserva.setTitularOReserva("Titular");
        }
    } else {
        System.out.println("No se pudo realizar el cambio. Verifique los IDs de pilotos.");
    }
}

   

    @Override
    public String toString() {
        NodoLista auxiliar = cabeza;
        String respuesta = "\n";
        
        while(auxiliar != null)
        {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
        }
        
        return respuesta;
    }
    
}
