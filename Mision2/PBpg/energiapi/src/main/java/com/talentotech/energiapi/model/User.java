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
    

    //constructor vacio
    public User(){}

    //metodos get and set

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
