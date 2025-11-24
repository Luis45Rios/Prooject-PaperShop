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
    private List<VentaDetalle> detalle;

    public Venta(LocalDate fecha, float total, List<VentaDetalle> detalle) {
        this.fecha = fecha;
        this.total = total;
        this.detalle = detalle;
    }

    /**
     * @return
     */
    public VentaDetalle agregarDetalle() {
        // TODO implement here
        return null;
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
