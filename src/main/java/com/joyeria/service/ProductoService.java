package com.joyeria.service;
import com.joyeria.domain.Producto;
import java.util.List;

public interface ProductoService {
    public List<Producto> getProductos(int categoria);
}
