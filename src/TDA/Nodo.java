/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author Luis Marcelo
 */
public class Nodo<T> {
    // ATRIBUTOS
    private T item; // Datos
    private Nodo sgteNodo;       // Puntero
    // METODOS
    public Nodo(){
        this.item = null;
        this.sgteNodo = null;
    }
    public Nodo(T item, Nodo sgteNodo){
        this.item = item;
        this.sgteNodo = sgteNodo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Nodo getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
}
