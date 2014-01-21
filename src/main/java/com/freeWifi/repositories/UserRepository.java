package com.freeWifi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeWifi.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
