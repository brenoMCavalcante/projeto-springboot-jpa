package com.springproject.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.springcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
