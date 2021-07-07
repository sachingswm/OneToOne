package com.example.onetoone.repositories;

import com.example.onetoone.entities.sharedprimarykey.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
