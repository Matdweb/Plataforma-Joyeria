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
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuarios", new Usuarios());
        return "form";
    }

    @PostMapping("/registrar")
    public String usuarioRegistrar(Usuarios usuario) {
        System.out.println(usuario.toString());
        usuariosService.save(usuario);
        return "redirect:/";
    }
}
