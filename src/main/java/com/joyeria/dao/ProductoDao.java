package com.joyeria.dao;
import com.joyeria.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author salas
 */
@Repository
public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
