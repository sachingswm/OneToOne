package com.example.onetoone.entities.jointable;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="employee_email",
            joinColumns = {
                    @JoinColumn(name="employee_id",referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name="email_id",referencedColumnName = "id")
            }
    )
    private EmailId emailId;
}
