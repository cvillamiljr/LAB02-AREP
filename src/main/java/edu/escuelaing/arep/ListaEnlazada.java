package edu.escuelaing.arep;

public class ListaEnlazada {
    private int tamaño;
    private Puntero cabeza, cola,actual;


    public ListaEnlazada() {
        this.tamaño=0;
        this.cabeza = null;
        this.cola=null;


    }

    public void setActual(Puntero actual) {
        this.actual = actual;
    }

    public Puntero getActual() {
        return actual;
    }

    /**
     * Este método se encarga de retornar la cantidad de elementos que contiene la Lista Enlazada.
     * @return El tamaño de la lista.
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Este método se encarga de devolver la actual cabeza de la lista enlazada.
     * @return El puntero que hace referencia a la cabeza de la lista enlazada.
     */
    public Puntero getCabeza() {
        return cabeza;
    }

    /**
     *Este método se encarga de devolver la actual cola de la lista enlazada.
     * @return El puntero que hace referencia a la cola de la lista enlazada.
     */
    public Puntero getCola() {
        return cola;
    }

    /**
     * Este método se encarga de fijar el valor como la nueva cabeza.
     * @param cabeza El parametro cabeza pasará a ser la nueva cabeza de la lista enlazada.
     */
    public void setCabeza(Puntero cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Este método se encarga de fijar el valor como la nueva cola.
     * @param cola El parametro cabeza pasará a ser la nueva cabeza de la lista cola.
     */
    public void setCola(Puntero cola) {
        this.cola = cola;
    }

    /**
     * Este método se encarga de adicionar el nuevo elemento de la lista enlazada al final de la misma.
     * @param nuevo El parametro nuevo es el nuevo elemento de la lista enlazada.
     */
    public void add(Puntero nuevo){
        if (tamaño==0){
            setCabeza(nuevo);
            setActual(nuevo);
            setCola(nuevo);
        }

        else {
            Puntero nuevaCola=getCola();
            if (nuevaCola!=null){
                setCola(nuevo);
                nuevo.setAnterior(nuevaCola);
                nuevaCola.setSiguiente(nuevo);
            }
        }
        tamaño+=1;
    }

    /**
     * Este método se encarga de remover el elemento de la lista encadenada.
     * @param viejo El parametro viejo es el elemento que se va a eleminar de la lista enlazada.
     */
    public void remove(Puntero viejo){
        if(contains(viejo)) {
            Puntero sig, ant;
            sig = viejo.getSiguiente();
            ant = viejo.getAnterior();
            if (sig == null) {
                setCola(ant);
            }
            if (ant == null) {
                setCabeza(sig);
            } else {
                ant.setSiguiente(sig);
            }
            tamaño -= 1;
        }
    }

    /**
     * Este método se encarga de verificar si el la Lista Enlazada contiene el nodo.
     * @param nuevo EL noodo que vamos a verificar si lo contiene o no.
     * @return El valor de verdad dependiendo si el nodo existe o no en la Linked List.
     */
    public boolean contains(Puntero nuevo){
        Puntero P=actual;
        while (P != null) {
            if (P.equals(nuevo))
                return true;
            P = P.getSiguiente();
        }
        return false;
    }

    /**
     * Este méotodo se encarga de iterar los punteros de toda la Lista Enlazada
     * @return Retorna el puntero actual.
     */
    public Puntero iterador() {
        Puntero p = null;
        if (actual == null) {
            actual=getCabeza();
        } else {
            p = actual;
            setActual(actual.getSiguiente());
        }
        return actual;
    }

    /**
     * Este método se encarga de devolver el valor inmediatamente previo al valor seleccionado.
     * @param p El parametro p es el puntero base.
     * @return
     */
    public Puntero nextNode(Puntero p){
        return p.getSiguiente();
    }

    /**
     * Este método se encarga de devolver el valor inmediantamente anterior al valor seleccionado.
     * @param p El parametro p es el puntero base.
     * @return Retorna el siguiente puntero al puntero base.
     */
    public Puntero priorNode(Puntero p){
        return p.getAnterior();
    }

}
