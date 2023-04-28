package com.example.javapersistenceinheritance.entity.mappedsuperclasses;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Project {
    @Id
    private long id;
    @Column(name="NAME")
    private String name;
}