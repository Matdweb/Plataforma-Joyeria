package com.joyeria.dao;
import com.joyeria.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author salas
 */
@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}
