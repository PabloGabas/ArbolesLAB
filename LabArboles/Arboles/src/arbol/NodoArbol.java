package arbol;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class NodoArbol {

    Persona persona;
    NodoArbol li;
    NodoArbol ld;
    int dato;

    public NodoArbol(Persona nuevaPersona) {
        this.persona = nuevaPersona;
        li = null;
        ld = null;
    }

    public void busquedaCedula(ArrayList<String> lista, int cedula) {
 
        if (Integer.valueOf(String.valueOf(this.persona.getCedula()))
                == cedula) {            
            lista.add(this.persona.getCedula());
        }
        if (li != null) {
            li.busquedaCedula(lista, cedula);
        }
        if (ld != null) {
            ld.busquedaCedula(lista, cedula);
        }
    }

    public synchronized void insertar(Persona nuevaPersona) {

       
        int comparacion = this.persona.getCedula().compareTo(nuevaPersona.getCedula());
        
        if (comparacion == 0) {
            return;
        }
        if (comparacion < 0) {
            if (li == null) {
                li = new NodoArbol(nuevaPersona);
                System.out.println("\nInsertado a la izquierda...");
            } else {
                li.insertar(nuevaPersona);
            }
        }

        if (comparacion > 0) {
            if (ld == null) {
                ld = new NodoArbol(nuevaPersona);
                System.out.println("\nInsertado a la derecha...");
            } else {
                ld.insertar(nuevaPersona);
            }
        }

    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int retornadato() {
        return (dato);
    }
}
