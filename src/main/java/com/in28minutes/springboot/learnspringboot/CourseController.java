package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "ima"),
                new Course(2, "AWS", "kallen"),
                new Course(3, "28 minutes", "sinag"),
                new Course(4, "28 minutes later", "poni")
        );
    }

}

