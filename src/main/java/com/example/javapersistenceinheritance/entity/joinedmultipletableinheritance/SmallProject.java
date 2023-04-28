package com.example.javapersistenceinheritance.entity.joinedmultipletableinheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("S")
@Table(name = "SMALLPROJECT")
public class SmallProject extends Project {
}
