/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd;

/**
 *
 * @author Josh
 */
public class ListaCircularclasificacion {
    NodoListaCircularclasificacion cabeza;
    NodoListaCircularclasificacion ultimo;
    
    public void insertar(PilotosClasificacion nuevoPiloto){
        if(cabeza==null){
            cabeza = new NodoListaCircularclasificacion(nuevoPiloto);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
        }
        else{
            if(nuevoPiloto.getTiempoClasificacion() < cabeza.getDato().getTiempoClasificacion()){
                NodoListaCircularclasificacion auxiliar = new NodoListaCircularclasificacion(nuevoPiloto);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
                ultimo.setSiguiente(cabeza);
            }
            else{
                if(nuevoPiloto.getTiempoClasificacion() > ultimo.getDato().getTiempoClasificacion()){
                    NodoListaCircularclasificacion auxiliar = new NodoListaCircularclasificacion(nuevoPiloto);
                    auxiliar.setSiguiente(cabeza);
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                }
                else{
                    NodoListaCircularclasificacion auxiliar = cabeza;
                    while(auxiliar.getSiguiente().getDato().getTiempoClasificacion() < nuevoPiloto.getTiempoClasificacion()){
                        auxiliar = auxiliar.getSiguiente();
                    }
                    NodoListaCircularclasificacion otroAuxiliar = new NodoListaCircularclasificacion(nuevoPiloto);
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }
    public void trasladarListaDobleCircular(ListaDC l){

            if(cabeza != null){
                NodoListaCircularclasificacion auxiliar = cabeza;
                
                    while(auxiliar != cabeza){
                        if(auxiliar != null){
                            l.inserta(auxiliar.getDato());
                            break;
                        }else{
                            auxiliar = auxiliar.getSiguiente();
                        }
                    }
            }else{
                System.out.println("Lista vacía");
            }
    }
    @Override
    public String toString() {
        String respuesta = "Lista clasificatoria: \n";
        
        NodoListaCircularclasificacion auxiliar = cabeza;
        
        if(auxiliar != null){
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
            while(auxiliar != cabeza){
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        else{
            respuesta += "Vacia";
        }
        
        return respuesta;
    }
}
