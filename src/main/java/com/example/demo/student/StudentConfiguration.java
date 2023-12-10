package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Locale;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ) {
        return args -> {
           Student mariam =  new Student(
                    1L,
                    "Mariam",
                    "mariam.james@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 25)
            );

            Student alex =  new Student(
                    2L,
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2003, Month.AUGUST, 25)
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
