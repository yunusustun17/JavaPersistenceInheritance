package com.example.javapersistenceinheritance.entity.tableperclassinheritance;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Project {
    @Id
    private long id;
}