package se.sti.service.teacher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.sti.models.course.Course;
import se.sti.models.repo.CourseRepo;
import se.sti.models.repo.TeacherRepo;
import se.sti.models.student.Student;
import se.sti.models.teacher.Teacher;

import java.util.List;

@Service
public class TeacherService{

    @Autowired
    private TeacherRepo teacherRepo;
    private CourseRepo courseRepo;

    public Teacher findByPersonNumber(String personNumber){
        Teacher x = teacherRepo.findByPersonNumber(personNumber);
        return x;
    }

    //TODO Räkna ut en lärares månadslön baserat på timlön och vilka kurser han/hon har
    //TODO Räkna ut genomsnittlig lön för angivna lärare. Om samtliga lärare anges räknas samtliga
    //TODO lärares medellön ut.

    public int teacherSalary(int hourlyRate, List<Course> courses){
        return 2;
    }

    public List<Teacher> getTeachers(){
        return teacherRepo.findAll();
    }


    public Teacher saveTeacher(Teacher teacher){
        return teacherRepo.save(teacher);
    }

    public Teacher updateTeacher(String personNumber, Teacher teacher){
        Teacher updateTeacher = teacherRepo.findByPersonNumber(personNumber);
        updateTeacher.setFirstName(teacher.getFirstName());
        updateTeacher.setLastName(teacher.getLastName());
        updateTeacher.setHourlyRate(teacher.getHourlyRate());
        return updateTeacher;

    }

    public Teacher deleteStudent(String personNumber){
        Teacher deleteTeacher = teacherRepo.findByPersonNumber(personNumber);
        return deleteTeacher;
    }





}
