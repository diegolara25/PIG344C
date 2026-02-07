package com.talentotech.energiapi.repository;

import com.talentotech.energiapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//esta clase va a ser una interfaz que nos va a permitir conusltar,eliminar etc. 
public interface UserRepository extends JpaRepository<User,Long>{

} 


