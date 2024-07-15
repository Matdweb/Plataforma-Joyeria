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
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    
    private Long idCategoria;
    private String nombreCategoria;
    
    public Categoria(){}
    
    public Categoria(String nombreCategoria){
        this.nombreCategoria = nombreCategoria;
    }
}
