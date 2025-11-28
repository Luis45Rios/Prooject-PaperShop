/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.domain;
import edu.unl.cc.papershop_project.administracion.Persona;

/**
 *
 * @author luisr
 */
public class Cliente extends Persona{
    
    private NotaVenta notaVenta;

    public Cliente(NotaVenta notaVenta, String nombres, String apellidos, String cedula, String direccion, String celular) {
        super(nombres, apellidos, cedula, direccion, celular);
        this.notaVenta = notaVenta;
    }

    public NotaVenta getNotaVenta() {
        return notaVenta;
    }

    public void setNotaVenta(NotaVenta notaVenta) {
        this.notaVenta = notaVenta;
    }
}
