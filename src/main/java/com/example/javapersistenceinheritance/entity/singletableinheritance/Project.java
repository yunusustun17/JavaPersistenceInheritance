package com.example.javapersistenceinheritance.entity.singletableinheritance;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Inheritance
@SuperBuilder
@NoArgsConstructor
@Table(name = "PROJECT")
@DiscriminatorColumn(name = "PROJ_TYPE")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
