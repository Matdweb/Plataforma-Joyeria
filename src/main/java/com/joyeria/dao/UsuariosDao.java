package com.joyeria.dao;
import com.joyeria.domain.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuariosDao extends JpaRepository <Usuarios, Long> {
    
}
