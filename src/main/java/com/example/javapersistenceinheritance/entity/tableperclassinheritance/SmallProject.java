package com.example.javapersistenceinheritance.entity.tableperclassinheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SMALLPROJECT")
public class SmallProject extends Project {
}