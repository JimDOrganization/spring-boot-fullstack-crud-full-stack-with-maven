package com.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class CourseResource {
    @Autowired
    private CoursesHardcodedService courseManagementService;

    @CrossOrigin(origins = { "http://localhost:3000"})
    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseManagementService.findAll();
    }


    @GetMapping("/instructors/{username}/courses/{id}")
    public Course getCourse(@PathVariable String username, @PathVariable long id) {
        return courseManagementService.findById(id);
    }
   // @CrossOrigin(origins = { "http://localhost:3000"})
    @DeleteMapping("/instructors/{username}/courses/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String username, @PathVariable long id) {

        Course course = courseManagementService.deleteById(id);

        if (course != null) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
