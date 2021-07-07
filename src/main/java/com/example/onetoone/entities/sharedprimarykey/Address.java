package com.example.onetoone.entities.sharedprimarykey;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id",referencedColumnName = "id")
    private User user;
}
