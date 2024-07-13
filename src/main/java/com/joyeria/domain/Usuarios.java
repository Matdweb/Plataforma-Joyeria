/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joyeria.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data 
@Entity  
@Table (name="Usuarios") 
public class Usuarios {
     private static final long serialVersionUID = 1L; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    private String fecha_registro;
}