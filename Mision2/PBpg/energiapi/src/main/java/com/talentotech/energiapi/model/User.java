package com.talentotech.energiapi.model;
//permite una estandarizacion independiente del motor de base de datos
import jakarta.persistence.*;

//este decorado entity quiere decir que esta clase va a tener datos persistente
@Entity
@Table(name="users") //crea una tabla llamada users va en plural
public class User {
    // todo esto representa primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;
}
