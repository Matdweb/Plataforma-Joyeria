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
@Table(name="Categorias")
public class Categoria implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private static final long serialVersionUID = 1L;
    
    private Long idCategoria;
    private String nombreCategoria;
    private boolean activo;
    
    public Categoria(){}
    
    public Categoria(String nombreCategoria, boolean activo){
        this.nombreCategoria = nombreCategoria;
        this.activo = activo;
    }
    
    public boolean isActivo(){
        return activo;
    }
}
