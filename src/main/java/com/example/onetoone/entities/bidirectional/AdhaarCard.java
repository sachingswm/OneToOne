package com.example.onetoone.entities.bidirectional;

import com.example.onetoone.entities.bidirectional.Human;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="AdhaarCard")
public class AdhaarCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "adhaarCard")
    private Human human;
}
