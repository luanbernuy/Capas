/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arq2;

/**
 *
 * @author ASUS ROG
 */
public class InterfazUsuario {
    private ServicioUsuario servicioUsuario;

    public InterfazUsuario() {
        this.servicioUsuario = new ServicioUsuario();
    }

    public void registrarUsuario(String nombre, String email) {
        // Validaciones, interacciones con el usuario, etc.
        servicioUsuario.registrarUsuario(nombre, email);
    }
}
