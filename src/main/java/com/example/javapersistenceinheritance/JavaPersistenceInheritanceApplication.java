package com.example.javapersistenceinheritance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@EntityScan(basePackages = {"com.example.javapersistenceinheritance.entity.singletableinheritance"})
//@EntityScan(basePackages = {"com.example.javapersistenceinheritance.entity.joinedmultipletableinheritance"})
//@EntityScan(basePackages = {"com.example.javapersistenceinheritance.entity.tableperclassinheritance"})
@EntityScan(basePackages = {"com.example.javapersistenceinheritance.entity.mappedsuperclasses"})
public class JavaPersistenceInheritanceApplication {

    public static void main(String[] args) {
        // https://en.wikibooks.org/wiki/Java_Persistence/Inheritance#Single_Table_Inheritance
        SpringApplication.run(JavaPersistenceInheritanceApplication.class, args);
    }

}
