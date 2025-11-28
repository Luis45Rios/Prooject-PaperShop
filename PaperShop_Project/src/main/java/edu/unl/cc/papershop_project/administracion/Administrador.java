/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.administracion;

import edu.unl.cc.papershop_project.domain.Proveedor;

/**
 *
 * @author luisr
 */
public class Administrador extends Persona{
    
    private Usuario usuario;
    private Proveedor proveedor;

    public Administrador(Usuario usuario, String nombres, String apellidos, String cedula, String direccion, String celular) {
        super(nombres, apellidos, cedula, direccion, celular);
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
