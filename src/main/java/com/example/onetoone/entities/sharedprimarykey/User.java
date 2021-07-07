package com.example.onetoone.entities.sharedprimarykey;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
    private Address address;
}
