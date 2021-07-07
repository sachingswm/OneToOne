package com.example.onetoone.repositories;

import com.example.onetoone.entities.jointable.EmailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailIdDao extends JpaRepository<EmailId,Integer> {
}
