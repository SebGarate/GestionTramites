/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edaproyecto;

import TDA.Cola;

/**
 *
 * @author sebga
 */
public class dependencias {
    private String Nombre;
    private Cola<Expediente> colaexp;

    public dependencias() {
    }

    public dependencias(String Nombre) {
        this.Nombre = Nombre;
        this.colaexp = new Cola<Expediente>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Cola<Expediente> getColaexp() {
        return colaexp;
    }

    public void setColaexp(Cola<Expediente> colaexp) {
        this.colaexp = colaexp;
    }
                                
}
