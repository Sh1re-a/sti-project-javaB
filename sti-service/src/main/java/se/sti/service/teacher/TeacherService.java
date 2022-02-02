package se.sti.service.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import se.sti.models.course.Course;
import se.sti.models.repo.CourseRepo;
import se.sti.models.repo.TeacherRepo;
import se.sti.models.teacher.Teacher;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class TeacherService{



    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private CourseRepo courseRepo;

    public Teacher findByPersonNumber(long id){
       Teacher x = teacherRepo.findById(id).orElseThrow(null);
        return x;
    }

    public Teacher findbyPersonNumber(long id) {
        Teacher teacher = teacherRepo.findById(id).orElseThrow(null);
        return teacher;
    }

    //TODO Räkna ut en lärares månadslön baserat på timlön och vilka kurser han/hon har
    //TODO Räkna ut genomsnittlig lön för angivna lärare. Om samtliga lärare anges räknas samtliga
    //TODO lärares medellön ut.


    public int teacherSalary(long id){
       Teacher teacher = teacherRepo.findById(id).orElseThrow(null);
       int teacherSalary = teacher.getHourlyRate();
       String course = teacher.getCourseCode();
       Course Course = courseRepo.findByCourseCode(course);
       int totalHours = Course.getTotalHours();

       int monthlySalary = teacherSalary  * totalHours;
       return monthlySalary;
    }

   // public int averageSalaryAmongTeacher()

    public List<Teacher> getTeachers(){
        return teacherRepo.findAll();
    }


    public Teacher saveTeacher(Teacher teacher){
        return teacherRepo.save(teacher);
    }

  public Teacher updateTeacher(long id, Teacher teacher){
        Teacher updateTeacher = teacherRepo.findById(id).orElseThrow(null);
        updateTeacher.setFirstName(teacher.getFirstName());
        updateTeacher.setLastName(teacher.getLastName());
        updateTeacher.setHourlyRate(teacher.getHourlyRate());
        return updateTeacher;

    }

    public Teacher deleteStudent(long id){
        Teacher deleteTeacher = teacherRepo.findById(id).orElseThrow(null);
        return deleteTeacher;
    }





}
