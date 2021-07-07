package com.example.onetoone.entities.unidirectional;


import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="Processor")
public class Processor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
