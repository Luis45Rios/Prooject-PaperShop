/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.domain;

import java.util.List;

/**
 *
 * @author luisr
 */
public class Kardex {

    private int stock;
    private List<ItemKardex> itemKardex;
    private Producto producto;

    public Kardex(int stock, List<ItemKardex> itemKardex, Producto producto) {
        this.stock = stock;
        this.itemKardex = itemKardex;
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<ItemKardex> getItemKardex() {
        return itemKardex;
    }

    public void setItemKardex(List<ItemKardex> itemKardex) {
        this.itemKardex = itemKardex;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
