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
public class NotaVenta {

    private LocalDate fecha;;
    private String codigo;
    private float subtotal;
    private float iva;
    private float total;
    
    private List<ItemVenta> items;

    public NotaVenta(LocalDate fecha, String codigo, float subtotal, float iva, float total, List<ItemVenta> items) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.items = items;
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

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<ItemVenta> getItems() {
        return items;
    }

    public void setItems(List<ItemVenta> items) {
        this.items = items;
    }
}
