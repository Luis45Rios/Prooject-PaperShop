/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.domain;

/**
 *
 * @author luisr
 */
public class Producto {

    private String codigo; 
    private String nombre;
    private String marca;
    private String tipo;
    private float PVP;
    private boolean tieneIVA;
    private float IVA;

    public Producto(String codigo, String nombre, String marca, String tipo, float PVP, boolean tieneIVA, float IVA) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.PVP = PVP;
        this.tieneIVA = tieneIVA;
        this.IVA = IVA;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPVP() {
        return PVP;
    }

    public void setPVP(float PVP) {
        this.PVP = PVP;
    }

    public boolean isTieneIVA() {
        return tieneIVA;
    }

    public void setTieneIVA(boolean tieneIVA) {
        this.tieneIVA = tieneIVA;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }
}
