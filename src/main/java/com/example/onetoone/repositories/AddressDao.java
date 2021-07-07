package com.example.onetoone.repositories;

import com.example.onetoone.entities.sharedprimarykey.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends JpaRepository<Address,Integer> {
}
