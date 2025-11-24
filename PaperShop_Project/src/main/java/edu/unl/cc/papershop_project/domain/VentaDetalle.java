/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.domain;

/**
 *
 * @author luisr
 */
public class VentaDetalle {

    private float subtotal;
    private int cantidad;
    private float precioUnitario;

    public VentaDetalle(float subtotal, int cantidad, float precioUnitario) {
        this.subtotal = subtotal;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public void agregar_detalleVenta() {
        // TODO implement here
    }

    /**
     * @return
     */
    public float calcularSubtotal() {
        // TODO implement here
        return 0.0f;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
