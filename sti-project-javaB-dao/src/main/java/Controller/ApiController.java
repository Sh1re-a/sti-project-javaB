package Controller;

import Repo.StudentRepo;
import Repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private StudentRepo studentRepo;
    private TeacherRepo teacherRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "welcome";
    }


}
