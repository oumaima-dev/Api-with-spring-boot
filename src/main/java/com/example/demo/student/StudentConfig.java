package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
          Student maria = new Student("maria",
                  LocalDate.of(1998, Month.AUGUST,17),
                  " maria.la@gmail.com");

            Student laith = new Student("laith",
                    LocalDate.of(1991, Month.JANUARY,1),
                    " laith@gmail.com");

            studentRepository.saveAll(List.of(maria,laith));

        };
    }
}
