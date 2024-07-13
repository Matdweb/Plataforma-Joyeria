/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joyeria.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.joyeria.domain.Usuarios;
import com.joyeria.service.UsuariosService;

@Controller
@Slf4j
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/form")
    public String mostrarFormularioRegistrar(Model model) {
        model.addAttribute("usuarios", new Usuarios());
        return "form";
    }

    @GetMapping("/signIn")
    public String mostrarFormularioInicioSesion(Model model) {
        model.addAttribute("usuarios", new Usuarios());
        return "signIn";
    }

    @PostMapping("/registrar")
    public String usuarioRegistrar(Usuarios usuario) {
        System.out.println(usuario.toString());
        usuariosService.save(usuario);
        return "redirect:/";
    }

    @PostMapping("/inicioSesion")
    public String usuarioIniciarSesion(Usuarios usuario) {
        var usuarios = usuariosService.getUsuarios();
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCorreo().equals(usuario.getCorreo())){
                if(usuarios.get(i).getContraseña().equals(usuario.getContraseña())){
                    System.out.println("Usuario correcto");
                    return "redirect:/";
                } else {
                    System.out.println("Contraseña incorrecta");
                    return "usuarioNoAutorizado";
                }
            }
        }
        System.out.println("Usuario no valido");
        return "usuarioNoAutorizado";
    }
}
