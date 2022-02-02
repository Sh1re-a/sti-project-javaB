package se.sti.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import se.sti.models.repo.StudentRepo;
import se.sti.models.student.Student;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student findByPersonNumber(String personNumber){
        Student x = studentRepo.findByPersonNumber(personNumber);
        return x;
    }


    public List<Student> getUsers(){
        return studentRepo.findAll();
    }


    public Student saveStudent(Student student){
        return student;
    }

    public Student updateStudent(String personNumber, Student student){
        Student updateStudent = studentRepo.findByPersonNumber(personNumber);
        updateStudent.setFirstName(student.getFirstName());
        updateStudent.setLastName(student.getLastName());
        updateStudent.setCourse(student.getCourse());
       return updateStudent;

    }

    public Student deleteStudent(String personNumber){
        Student deletestudent = studentRepo.findByPersonNumber(personNumber);
        return deletestudent;
    }



}
