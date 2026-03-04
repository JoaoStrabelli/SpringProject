package com.curso.springproject.repositories;

import com.curso.springproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Anotação opcional pois já está herdando um Repository
@Repository
public interface UserRepository extends JpaRepository <User, Long> {

}
