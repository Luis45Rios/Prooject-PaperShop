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
public class NotaVenta {

    private LocalDate fecha;
    private String codigo;

    public NotaVenta(LocalDate fecha, String codigo) {
        this.fecha = fecha;
        this.codigo = codigo;
    }

    public void imprimirNotaVenta() {
        // TODO implement here
    }

    public void archivarNotaVenta() {
        // TODO implement here
    }

    public void calcularTotal() {
        // TODO implement here
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
