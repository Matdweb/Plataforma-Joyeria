package com.joyeria.service.impl;

import com.joyeria.dao.ProductoDao;
import com.joyeria.domain.Producto;
import com.joyeria.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author salas
 */



@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoDao productoDao;

    //Funcion filtra por id de categoria (tenerlas preescritas en base de datos con anterioridad)
    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos, int categoria) {
        var lista = productoDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }

        if (categoria >= 0) {
            lista.removeIf(e -> e.getCategoria() != categoria);
        }
        
        return lista;
    }
}
