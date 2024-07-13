/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.joyeria.service;
import com.joyeria.domain.Usuarios;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface UsuariosService {
    public List<Usuarios> getUsuarios();

    public Usuarios getUsuario(Usuarios categoria);
    
    public void save(Usuarios usuario);
}