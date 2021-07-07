package com.example.onetoone.entities.jointable;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="EmailId")
public class EmailId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "emailId")
    private Employee employee;
}
