package edu.escuelaing.arep;

public class Puntero {




    private Puntero siguiente;
    private Puntero anterior;
    private double valor;

    /**
     * Crea una instancia de un puntero, con sus respectivos atributos.
     * @param valor El parametro valor  indica el valor que tiene el puntero.
     */
    public Puntero( double valor) {
        this.valor = valor;
        this.siguiente=null;
        this.anterior=null;
    }

    /**
     *Este método se encarga de devolver el puntero siguiente al puntero actual
     * @return El puntuero siguiente.
     */
    public Puntero getSiguiente() {
        return siguiente;
    }

    /**
     *Este método se encarga de devolver el puntero anterior al puntero actual.
     * @return El puntero anterior.
     */
    public Puntero getAnterior() {
        return anterior;
    }

    /**
     *Este método se encarga de devolver el valor del puntero actual
     * @return El valor que tiene el puntero.
     */
    public double getValor() {
        return valor;
    }

    /**
     *Este método se encarga de fijar  el puntuero siguiente al puntero acutal.
     * @param siguiente El parametro siguiente asigna el puntero immediatamente posterior al puntero actual.
     */
    public void setSiguiente(Puntero siguiente) {
        this.siguiente = siguiente;
    }

    /**
     *Este método se encarga de fijar el puntero anterior al puntero actual.
     * @param anterior El parámetro anterior asigna el puntero inmediatamente precente al puntero actual.
     */
    public void setAnterior(Puntero anterior) {
        this.anterior = anterior;
    }

    /**
     *Este método se encarga de asignar al atributo valor el valor nuevo correspondiente al nuevo puntero.
     * @param valor El parametro valor es el nuevo valor que se va a asignar al nuevo puntero.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}

