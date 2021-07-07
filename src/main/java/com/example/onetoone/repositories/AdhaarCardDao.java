package com.example.onetoone.repositories;

import com.example.onetoone.entities.bidirectional.AdhaarCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdhaarCardDao extends JpaRepository<AdhaarCard,Integer> {
}
