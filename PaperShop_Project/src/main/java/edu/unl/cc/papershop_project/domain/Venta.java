/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.domain;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author luisr
 */
public class Venta {

    private LocalDate fecha;
    private float total;

    public Venta(LocalDate fecha, float total) {
        this.fecha = fecha;
        this.total = total;
    }

    public void clacularTotal() {
        // TODO implement here
    }

    public void registrarVenta() {
        // TODO implement here
    }

    public void obtenerTotal() {
        // TODO implement here
    }
}
