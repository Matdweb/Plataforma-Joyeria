/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joyeria.service.impl;

import java.util.List;
import com.joyeria.dao.UsuariosDao;
import com.joyeria.domain.Usuarios;
import com.joyeria.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    private UsuariosDao usuariosDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Usuarios> getUsuarios(){
        var usuarios = usuariosDao.findAll();
        return usuarios;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Usuarios getUsuario(Usuarios usuario){
        return usuariosDao.findById(usuario.getId()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Usuarios usuario){
        usuariosDao.save(usuario); 
    }
}