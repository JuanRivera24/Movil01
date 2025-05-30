package com.app.customers.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Customers")
@Data
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false, unique = true)
    private String lastName;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String birthDate;

    // Empty constructor (required for JPA)
    public Customers() {}

    // Constructor with parameters
    public Customers(Long id, String firstName, String lastName, String phone, String birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getPhone () {
        return this.phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public String getBirthDate () {
        return this.birthDate;
    }

    public void setBirthDate (String birthDate) {
        this.birthDate = birthDate;
    }
}
