package com.example.LED.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity // isso fala para o JPA - Fazer uma tablea no banco
@Table(name = "tbl_estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String data;


}

