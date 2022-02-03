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




    public List<Student> getUsers(){
        return studentRepo.findAll();
    }


    public Student saveStudent(Student student){

        return student;
    }

    public Student updateStudent(long id, Student student){
        Student updateStudent = studentRepo.findById(id).orElseThrow(null);
        updateStudent.setFirstName(student.getFirstName());
        updateStudent.setLastName(student.getLastName());
        updateStudent.setCourseCode(student.getCourseCode());
       return updateStudent;

    }

    public Student deleteStudent(long id){
        return studentRepo.findById(id).orElseThrow(null);
    }



}
