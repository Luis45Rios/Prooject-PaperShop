/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.domain;

/**
 *
 * @author luisr
 */
public class Cliente {

    private String nombres_completos;
    private String cedula;
    private String dirección;
    private String celular;

    public Cliente(String nombres_completos, String cedula, String dirección, String celular) {
        this.nombres_completos = nombres_completos;
        this.cedula = cedula;
        this.dirección = dirección;
        this.celular = celular;
    }

    public String getNombres_completos() {
        return nombres_completos;
    }

    public void setNombres_completos(String nombres_completos) {
        this.nombres_completos = nombres_completos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
