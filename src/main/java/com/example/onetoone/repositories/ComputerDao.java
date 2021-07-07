package com.example.onetoone.repositories;

import com.example.onetoone.entities.unidirectional.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerDao extends JpaRepository<Computer,Integer>{
}
