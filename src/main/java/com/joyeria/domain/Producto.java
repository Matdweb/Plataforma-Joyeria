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
@Table(name="Productos")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private static final long serialVersionUID = 1L;
    
    private Long idProducto;
    private String nombreProducto;
    private String descripcion;
    private float precio;
    private int idCategoria;
    private Long disponibilidad;
    private String rutaImagen;
    private boolean activo;
    
    public Producto(){}
    
    public Producto(String nombreProducto ,boolean activo){
        this.nombreProducto = nombreProducto;
        this.activo = activo;
    }
    
    public boolean isActivo(){
        return activo;
    }
    
    public int getCategoria(){
        return idCategoria;
    }
    
}
