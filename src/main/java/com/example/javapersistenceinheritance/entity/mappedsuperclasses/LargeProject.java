package com.example.javapersistenceinheritance.entity.mappedsuperclasses;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="LARGEPROJECT")
@AttributeOverride(name="NAME", column=@Column(name="PROJECT_NAME"))
public class LargeProject extends Project {
    private BigDecimal budget;
}