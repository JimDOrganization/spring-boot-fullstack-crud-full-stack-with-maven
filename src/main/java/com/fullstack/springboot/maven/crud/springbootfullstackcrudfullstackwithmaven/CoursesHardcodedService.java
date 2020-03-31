package com.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CoursesHardcodedService {

    private  List<Course> courses ;
    private  long idCounter = 0;

     public CoursesHardcodedService(){
         CreateCourseArray();

    }

    @Bean
    private List<Course> CreateCourseArray(){
        courses = new ArrayList<>();
        courses.add(new Course(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and Angular"));
        courses.add(new Course(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and React"));
        courses.add(new Course(++idCounter, "in28minutes", "Master Microservices with Spring Boot and Spring Cloud"));
        courses.add(new Course(++idCounter, "in28minutes",
                "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
        return courses;
    }
    @Bean
    public List<Course> findAll() {
        return courses;
    }
}




