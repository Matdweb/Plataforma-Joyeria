package com.joyeria.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author salas
 */
@Data
@Entity
@Table(name = "Productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")

    private Long idProducto;
    private String nombreProducto;
    private String descripcion;
    private float precio;
    private int idCategoria;
    private Long disponibilidad;
    private String imagen;

    public Producto() {
    }

    public Producto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCategoria() {
        return idCategoria;
    }

}
