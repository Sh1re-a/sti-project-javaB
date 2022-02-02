package se.sti.service.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.sti.models.course.Course;
import se.sti.models.repo.CourseRepo;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;



    public List<Course> getCourses(){
        return courseRepo.findAll();
    }

    public Course saveCourse(Course course){
        return courseRepo.save(course);
    }

  /*  public Course updateCourse(String courseCode, Course course){
        Course updateCourse = courseRepo.findById(id).orElseThrow(null);
        updateCourse.setCourseName(course.getCourseName());
        updateCourse.setYhPoints(course.getYhPoints());
        updateCourse.setTotalHours(course.getTotalHours());
        updateCourse.setTeacher(course.getTeacher());
        return updateCourse;
    }

    public Course deleteCourse(String courseCode){
        Course deleteCourse = courseRepo.findByCourseCode(courseCode);
        return  deleteCourse;
    }

   */
}
