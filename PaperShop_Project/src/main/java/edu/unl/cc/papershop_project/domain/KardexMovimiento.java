/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.domain;

import java.time.LocalDate;

/**
 *
 * @author luisr
 */
public class KardexMovimiento {

    private LocalDate fecha;
    private String tipoMovimiento;
    private int cantidad;
    private float costoUnitario;
    private float totalMovimiento;

    public KardexMovimiento(LocalDate fecha, String tipoMovimiento, int cantidad, float costoUnitario, float totalMovimiento) {
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
        this.totalMovimiento = totalMovimiento;
    }

    public void calcularCostoPromedio() {
        // TODO implement here
    }

    public void calcularCantidadActual() {
        // TODO implement here
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(float costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public float getTotalMovimiento() {
        return totalMovimiento;
    }

    public void setTotalMovimiento(float totalMovimiento) {
        this.totalMovimiento = totalMovimiento;
    }
}
