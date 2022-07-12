package com.springboot.learning.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // http://localhost:8080/courses
    // Course: id, name, author

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Mohit"),
                new Course(2, "Learn DevOps", "Mohit"),
                new Course(3, "Learn Azure", "Mohit")
        );
    }
}
