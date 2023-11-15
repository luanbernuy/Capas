/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arq2;

/**
 *
 * @author ASUS ROG
 */
public class ServicioUsuario {
    private RepositorioUsuario repositorioUsuario;

    public ServicioUsuario() {
        this.repositorioUsuario = new RepositorioUsuario();
    }

    public void registrarUsuario(String nombre, String email) {
        // Aquí se pueden realizar validaciones adicionales antes de registrar al usuario
        Usuario nuevoUsuario = new Usuario(nombre, email);
        repositorioUsuario.guardarUsuario(nuevoUsuario);
    }
}

