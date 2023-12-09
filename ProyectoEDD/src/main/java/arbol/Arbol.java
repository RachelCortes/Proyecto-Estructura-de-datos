package arbol;

import javax.swing.JOptionPane;
import listasimple.Pilotos;

public class Arbol {

    NodoArbol raiz;
    Pilotos id;

    public void inserta(int idPiloto, int posicion) {
        if (raiz == null) {
            raiz = new NodoArbol(idPiloto);
        } else {
            insertaRecursivo(raiz, idPiloto, posicion);
        }
    }

    public void insertaRecursivo(NodoArbol n, int idPiloto, int posicion) {

        if (idPiloto <= n.getId()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new NodoArbol(idPiloto));
            } else {
                insertaRecursivo(n.getHijoIzq(), idPiloto, posicion);
            }
        } else {

            if (n.getHijoDer() == null) {
                n.setHijoDer(new NodoArbol(idPiloto));
            } else {
                insertaRecursivo(n.getHijoDer(), idPiloto, posicion);
            }
        }
    }

    public void inorden() {
        if (raiz == null) {
            JOptionPane.showMessageDialog(null, "El árbol está vacío");
        } else {
            inordenRecursivo(raiz);
        }
    }

    public void inordenRecursivo(NodoArbol n) {
        if (n != null) {
            inordenRecursivo(n.getHijoIzq());
            JOptionPane.showMessageDialog(null, n.getId());
            inordenRecursivo(n.getHijoDer());
        }
    }

//    public void preorden() {
//        if (raiz == null) {
//            JOptionPane.showMessageDialog(null, "El árbol está vacío");
//        } else {
//            preordenRecursivo(raiz);
//        }
//    }
//
//    public void preordenRecursivo(NodoArbol n, int posicion) {
//        if (n != null) {
//            JOptionPane.showMessageDialog(null, n.getId());
//            preordenRecursivo(n.getHijoIzq());
//            preordenRecursivo(n.getHijoDer());
//        }
//    }
    public void preorden() {
        if (raiz == null) {
            JOptionPane.showMessageDialog(null, "El árbol está vacío");
        } else {
            StringBuilder mensaje = new StringBuilder();
            preordenRecursivo(raiz, mensaje, 1);
            JOptionPane.showMessageDialog(null, "Resultados:\n" + mensaje.toString());
        }
    }

    public void preordenRecursivo(NodoArbol n, StringBuilder mensaje, int posicion) {
        if (n != null) {
            mensaje.append(n.getId()).append("  posición ").append(posicion).append("\n");
            preordenRecursivo(n.getHijoIzq(), mensaje, posicion + 1);
            preordenRecursivo(n.getHijoDer(), mensaje, posicion + 1);
        }
    }

    public void postorden() {
        if (raiz == null) {

            JOptionPane.showMessageDialog(null, "El árbol está vacío");
        } else {
            postordenRecursivo(raiz);
        }
    }

    public void postordenRecursivo(NodoArbol n) {
        if (n != null) {
            postordenRecursivo(n.getHijoIzq());
            postordenRecursivo(n.getHijoDer());

            JOptionPane.showMessageDialog(null, n.getId());
        }
    }

}
