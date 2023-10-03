package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
             Student mariam = new Student(
                "Daniel Eldon",
                "eldondaniel2@gmail.com",
                LocalDate.of(1998, APRIL, 25)

        );
            Student alex = new Student(
                    "Alex Ontita",
                    "alexjon@gmail.com",
                    LocalDate.of(1990, JANUARY, 25)

            );
            repository.saveAll(
                    List.of(mariam, alex));
        };

    }
}
