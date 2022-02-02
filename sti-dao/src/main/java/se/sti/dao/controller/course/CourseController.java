package se.sti.dao.controller.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.sti.models.course.Course;
import se.sti.models.repo.CourseRepo;
import se.sti.service.course.CourseService;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;

    @GetMapping(value = "/course/getAll")
    public List<Course> getCourses(){
        return courseRepo.findAll();
    }

    @PostMapping(value = "/course/save")
    public String saveCourse(@RequestBody Course course){
        courseRepo.save(course);
        return "Course is saved...";
    }

/*
    @PutMapping(value = "/course/update/{courseCode}")
    public String updateCourse(@PathVariable long id, @RequestBody Course course){
        CourseService x = new CourseService();
        Course updateCourse = x.updateCourse(id, course);
        courseRepo.save(updateCourse);
        return "Course is update...";
    }


 */
}

