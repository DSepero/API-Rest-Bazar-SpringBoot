package com.DerianSepero.StockBazar.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;
 

    public Cliente() {
    }

    public Cliente(Long id_cliente, String nombre, String apellido, String dni, Venta venta) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        
    }
 
    
    
}
