package com.example.onetoone.entities.bidirectional;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="Human")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="adhaar_card_id",referencedColumnName = "id")
    private AdhaarCard adhaarCard;
}
