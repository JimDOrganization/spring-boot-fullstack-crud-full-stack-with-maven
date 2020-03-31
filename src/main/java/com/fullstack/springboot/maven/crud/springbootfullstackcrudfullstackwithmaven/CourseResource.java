package com.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class CourseResource {
    @Autowired
    private CoursesHardcodedService courseManagementService;

    //@CrossOrigin(origins = { "http://localhost:3000"})
    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseManagementService.findAll();



    }
}
