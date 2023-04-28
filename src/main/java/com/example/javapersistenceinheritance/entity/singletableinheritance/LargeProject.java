package com.example.javapersistenceinheritance.entity.singletableinheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Entity
@SuperBuilder
@NoArgsConstructor
@DiscriminatorValue("L")
public class LargeProject extends Project {
    private BigDecimal budget;
}
