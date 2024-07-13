package com.joyeria.service;
import com.joyeria.domain.Producto;
import java.util.List;

public interface ProductoService {
    public List<Producto> getProductos(boolean activos, int categoria);
}
