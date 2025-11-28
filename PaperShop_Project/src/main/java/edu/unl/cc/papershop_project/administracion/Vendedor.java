/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.papershop_project.administracion;

/**
 *
 * @author luisr
 */
public class Vendedor extends Persona {

    private Usuario usuario;

    public Vendedor(Usuario usuario, String nombres, String apellidos, String cedula, String direccion, String celular) {
        super(nombres, apellidos, cedula, direccion, celular);
        this.usuario = usuario;
    }
}
