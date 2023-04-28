package com.example.javapersistenceinheritance.entity.mappedsuperclasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SMALLPROJECT")
public class SmallProject extends Project {
}