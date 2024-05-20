package arbol;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();

        miArbol.insertarNodo(new Persona("321"));
        miArbol.insertarNodo(new Persona("121"));
        miArbol.insertarNodo(new Persona("112"));
        miArbol.insertarNodo(new Persona("231"));

        System.out.println(miArbol.retornaraiz().persona.getCedula());

        System.out.println("");
        miArbol.getPreOrden(miArbol.retornaraiz());
        System.out.println("");

    }
}
