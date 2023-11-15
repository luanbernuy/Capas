/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arq2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS ROG
 */
public class RepositorioUsuario {
    private List<Usuario> baseDeDatosUsuarios;

    public RepositorioUsuario() {
        this.baseDeDatosUsuarios = new ArrayList<>();
    }

    public void guardarUsuario(Usuario usuario) {
        // Operaciones para guardar el usuario en la base de datos
        baseDeDatosUsuarios.add(usuario);
        System.out.println("Usuario guardado en la base de datos: " + usuario);
    }
}
