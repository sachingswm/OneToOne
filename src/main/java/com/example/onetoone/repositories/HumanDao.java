package com.example.onetoone.repositories;

import com.example.onetoone.entities.bidirectional.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanDao extends JpaRepository<Human,Integer> {
}
